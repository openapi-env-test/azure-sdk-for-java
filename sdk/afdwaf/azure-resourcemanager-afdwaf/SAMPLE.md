# Code snippets and samples


## OperationGroup

- [Get](#operationgroup_get)
### OperationGroup_Get

```java
import com.azure.core.util.Context;

/** Samples for OperationGroup Get. */
public final class OperationGroupGetSamples {
    /*
     * x-ms-original-file: specification/afdwaf/resource-manager/Microsoft.WebApplicationFirewall/preview/2022-06-16/examples/OperationGroupGet.json
     */
    /**
     * Sample code: BatchAccountDelete.
     *
     * @param manager Entry point to AfdwafManager.
     */
    public static void batchAccountDelete(com.azure.resourcemanager.afdwaf.AfdwafManager manager) {
        manager.operationGroups().getWithResponse("afdwafClient", Context.NONE);
    }
}
```

