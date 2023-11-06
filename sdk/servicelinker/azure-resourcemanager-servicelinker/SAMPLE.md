# Code snippets and samples


## Linker

- [ListConfigurations](#linker_listconfigurations)

## Operations

- [List](#operations_list)
### Linker_ListConfigurations

```java
/** Samples for Linker ListConfigurations. */
public final class LinkerListConfigurationsSamples {
    /*
     * x-ms-original-file: specification/servicelinker/resource-manager/Microsoft.ServiceLinker/stable/2022-05-01/examples/GetConfigurations.json
     */
    /**
     * Sample code: GetConfiguration.
     *
     * @param manager Entry point to ServiceLinkerManager.
     */
    public static void getConfiguration(com.azure.resourcemanager.servicelinker.ServiceLinkerManager manager) {
        manager
            .linkers()
            .listConfigurationsWithResponse(
                "subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/test-rg/providers/Microsoft.Web/sites/test-app",
                "linkName",
                com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/servicelinker/resource-manager/Microsoft.ServiceLinker/stable/2022-05-01/examples/OperationsList.json
     */
    /**
     * Sample code: GetConfiguration.
     *
     * @param manager Entry point to ServiceLinkerManager.
     */
    public static void getConfiguration(com.azure.resourcemanager.servicelinker.ServiceLinkerManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

