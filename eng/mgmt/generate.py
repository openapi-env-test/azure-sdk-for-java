#!/usr/bin/env python3
import os
import re
import sys
import json
import yaml
import shutil
import logging
import argparse
import collections
import yaml.resolver

pwd = os.getcwd()
os.chdir(os.path.dirname(sys.argv[0]))
from parameters import *
os.chdir(pwd)


def generate(
    sdk_root: str,
    service: str,
    spec_root: str,
    readme: str,
    autorest: str,
    use: str,
    tag: str = None,
    **kwargs,
):
    output_dir = os.path.join(
        sdk_root,
        'sdk/{0}'.format(service),
        ARTIFACT_FORMAT.format(service),
    )
    shutil.rmtree(output_dir, ignore_errors = True)

    if spec_root[-1] != '/':
        readme = spec_root + '/' + readme
    else:
        readme = spec_root + readme

    tag_option = '--tag={0}'.format(tag) if tag else ''
    namespace = NAMESPACE_FORMAT.format(service)

    command = 'autorest --version={0} --use={1} --java.azure-libraries-for-java-folder={2} --java.output-folder={3} --java.namespace={4} {5}'.format(
        autorest,
        use,
        os.path.abspath(sdk_root),
        os.path.abspath(output_dir),
        namespace,
        ' '.join((tag_option, FLUENTLITE_ARGUMENTS, readme)),
    )
    logging.info(command)
    if os.system(command) != 0:
        logging.error('Autorest fail')
        sys.exit(1)


def add_module_to_pom(pom: str, module: str) -> (bool, str):
    if pom.find('<module>{0}</module>'.format(module)) >= 0:
        logging.info('[Skip] pom already has module {0}'.format(module))
        return (False, '')

    if len(re.findall('<modules>', pom)) > 1:
        logging.error('[Skip] find more than one <modules> in pom')
        return (False, '')

    pre_module = re.match(r'^[\s\S]*?<modules>', pom, re.M)
    if not pre_module:
        logging.error('[Skip] Cannot find <modules> in pom')
        return (False, '')

    post_module = re.search(r'[^\S\r\n]*</modules>[\s\S]*?$', pom)
    if not post_module:
        logging.error('[Skip] Cannot find </modules> in pom')
        return (False, '')

    modules = set(re.findall(r'<module>(.*?)</module>', pom))
    modules.add(module)
    modules = [POM_MODULE_FORMAT.format(module) for module in sorted(modules)]

    return (True,
            pre_module.group() + '\n' + ''.join(modules) + post_module.group())


def update_root_pom(sdk_root: str, service: str):
    pom_file = os.path.join(sdk_root, 'pom.xml')
    if not os.path.exists(pom_file):
        logging.error('[Skip] cannot find root pom')
        return

    module = 'sdk/{0}'.format(service)
    with open(pom_file, 'r') as fin:
        pom = fin.read()

    logging.info('[Process] dealing with root pom')
    success, pom = add_module_to_pom(pom, module)
    if success:
        with open(pom_file, 'w') as fout:
            fout.write(pom)
        logging.info('[Success] Write to root pom')


def update_service_ci_and_pom(sdk_root: str, service: str):
    folder = os.path.join(sdk_root, 'sdk/{0}'.format(service))
    module = ARTIFACT_FORMAT.format(service)
    ci_yml_file = os.path.join(folder, 'ci.yml')
    pom_xml_file = os.path.join(folder, 'pom.xml')

    if os.path.exists(ci_yml_file):
        with open(ci_yml_file, 'r') as fin:
            ci_yml = yaml.safe_load(fin)
    else:
        ci_yml = yaml.safe_load(CI_FORMAT.format(service, module))

    if not (type(ci_yml.get('extends')) == dict and
            type(ci_yml['extends'].get('parameters')) == dict and
            type(ci_yml['extends']['parameters'].get('Artifacts')) == list):
        logging.error('[Skip] Unexpected ci.yml format')
    else:
        artifacts: list = ci_yml['extends']['parameters']['Artifacts']
        for artifact in artifacts:
            if (artifact.get('name') == module and
                    artifact.get('groupId') == GROUP_ID):
                logging.info(
                    '[Skip] ci.yml already has module {0}'.format(module))
                break
        else:
            artifacts.append({
                'name': module,
                'groupId': GROUP_ID,
                'safeName': module.replace('-', '')
            })
            ci_yml_str = yaml.safe_dump(ci_yml, sort_keys = False)
            ci_yml_str = re.sub('(\n\S)', r'\n\1', ci_yml_str)

            with open(ci_yml_file, 'w') as fout:
                fout.write(CI_HEADER)
                fout.write(ci_yml_str)
            logging.info('[Success] Write to ci.yml')

    if os.path.exists(pom_xml_file):
        with open(pom_xml_file, 'r') as fin:
            pom_xml = fin.read()
    else:
        pom_xml = POM_FORMAT.format(service)

    logging.info('[Process] dealing with pom.xml')
    success, pom_xml = add_module_to_pom(pom_xml, module)
    if success:
        with open(pom_xml_file, 'w') as fout:
            fout.write(pom_xml)
        logging.info('[Success] Write to pom.xml')


def parse_args() -> argparse.Namespace:
    parser = argparse.ArgumentParser()
    parser.add_argument(
        '-s',
        '--spec_root',
        default =
        'https://raw.githubusercontent.com/Azure/azure-rest-api-specs/master/',
        help = 'Spec root folder',
    )
    parser.add_argument(
        '-r',
        '--readme',
        help =
        'Readme path, Sample: "specification/storage/resource-manager/readme.md"',
    )
    parser.add_argument(
        '-u',
        '--use',
        default = AUTOREST_JAVA,
        help = 'Autorest java plugin',
    )
    parser.add_argument(
        '--autorest',
        default = AUTOREST_CORE_VERSION,
        help = 'Autorest version',
    )
    parser.add_argument(
        'config',
        nargs = '*',
    )

    return parser.parse_args()


def main():
    args = vars(parse_args())

    base_dir = os.path.abspath(os.path.dirname(sys.argv[0]))
    sdk_root = os.path.join(base_dir, SDK_ROOT)
    spec_to_service_file = os.path.join(base_dir, 'spec_to_service.json')

    spec_to_service = dict()
    if os.path.isfile(spec_to_service_file):
        with open(spec_to_service_file, 'r') as fin:
            spec_to_service = json.load(fin)

    # parse config or args
    readmes = []
    if args.get('config'):
        with open(args['config'][0], 'r') as fin:
            config = json.load(fin)
            args['spec_root'] = config['specFolder']
            readmes = config['relatedReadmeMdFiles']
    elif not args.get('readme'):
        logging.error(
            '[Exit] Cannot find readme in any config or input arguments')
        sys.exit(1)
    else:
        readmes = [args['readme']]

    # deal with each readme
    for readme in readmes:
        args['readme'] = readme
        if 'data-plane' in readme:
            logging.info('[Skip] do not generate for {0}'.format(readme))
        else:
            match = re.search('specification/([^/]+)/resource-manager', readme)
            if not match:
                logging.error(
                    '[Skip] readme path does not format as specification/*/resource-manager'
                )
            else:
                spec = match.group(1)
                service = spec_to_service.get(spec)
                if not service:
                    service = spec

                if service == 'resources':
                    args['tag'] = 'package-resources-2020-06' ########   REMOVE LATER !!!!!

                generate(sdk_root = sdk_root, service = service, **args)
                update_service_ci_and_pom(
                    sdk_root = sdk_root,
                    service = service,
                )
                update_root_pom(sdk_root = sdk_root, service = service)

                args['tag'] = None  ########   REMOVE LATER !!!!!


if __name__ == '__main__':
    logging.basicConfig(
        level = logging.DEBUG,
        format = '%(asctime)s %(levelname)s %(message)s',
        datefmt = '%Y-%m-%d %X',
    )
    main()