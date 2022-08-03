# azure-sdk-for-java
``` yaml
java: true
output-folder: sdk/deviceupdate/azure-iot-deviceupdate
regenerate-pom: false
title: DeviceUpdateClient
generate-sync-async-clients: true
generate-client-as-impl: true
generate-client-interfaces: false
service-interface-as-public: true
add-context-parameter: true
artifact-id: azure-iot-deviceupdate
data-plane: true
sync-methods: all
generate-samples: true
license-header: MICROSOFT_MIT_SMALL
namespace: com.azure.iot.deviceupdate
service-name: DeviceUpdate
context-client-method-parameter: true
azure-arm: false
partial-update: true
credential-types: tokencredential
credential-scopes: https://api.adu.microsoft.com/.default
service-versions:
  - 2022-07-01-preview
polling:
  default:
    strategy: new OperationResourcePollingStrategyWithEndpoint<>({httpPipeline}, "https://" + this.client.getEndpoint(), null, null, {context})
require: /spec-repo/specification/deviceupdate/data-plane/readme.md
```
