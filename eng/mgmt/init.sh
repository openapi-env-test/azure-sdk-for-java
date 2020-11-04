#!/bin/sh

sudo apt-get install -y python3-setuptools
pip3 install --upgrade wheel PyYAML

cat << EOF > $2
{"envs": {"PATH": "$JAVA_HOME_11_X64/bin:$PATH" }}
EOF