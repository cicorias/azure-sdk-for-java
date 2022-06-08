## Generate autorest code
```yaml
input-file: https://github.com/Azure/azure-rest-api-specs/blob/main/specification/purview/data-plane/Azure.Analytics.Purview.Catalog/preview/2021-05-01-preview/purviewcatalog.json
java: true
output-folder: ../
namespace: com.azure.analytics.purview.catalog
generate-client-interfaces: false
service-interface-as-public: true
sync-methods: all
license-header: MICROSOFT_MIT_SMALL
data-plane: true
credential-types: tokencredential
credential-scopes: https://purview.azure.net/.default
title: PurviewCatalogClient
artifact-id: azure-analytics-purview-catalog
service-name: PurviewCatalog
service-versions:
  - 2021-05-01-preview
generate-client-as-impl: true
add-context-parameter: true
context-client-method-parameter: true
generate-sync-async-clients: true
generate-samples: true
polling: {}
```