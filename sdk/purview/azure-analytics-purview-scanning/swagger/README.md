## Generate autorest code
``` yaml
java: true
output-folder: ../
namespace: com.azure.analytics.purview.scanning
generate-client-interfaces: false
service-interface-as-public: true
sync-methods: all
license-header: MICROSOFT_MIT_SMALL
data-plane: true
credential-types: tokencredential
credential-scopes: https://purview.azure.net/.default
title: PurviewScanningClient
artifact-id: azure-analytics-purview-scanning
service-name: PurviewScanning
service-versions:
  - 2018-12-01-preview
generate-client-as-impl: true
add-context-parameter: true
context-client-method-parameter: true
generate-sync-async-clients: true
generate-samples: true
require: /mnt/vss/_work/1/s/azure-rest-api-specs/specification/purview/data-plane/readme.md
```
