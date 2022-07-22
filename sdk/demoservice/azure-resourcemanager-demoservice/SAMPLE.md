# Code snippets and samples


## OperationGroup

- [Get](#operationgroup_get)
### OperationGroup_Get

```java
import com.azure.core.util.Context;

/** Samples for OperationGroup Get. */
public final class OperationGroupGetSamples {
    /*
     * x-ms-original-file: specification/demoservice/resource-manager/Microsoft.DemoService/preview/2020-08-06/examples/OperationGroupGet.json
     */
    /**
     * Sample code: BatchAccountDelete.
     *
     * @param manager Entry point to DemoserviceManager.
     */
    public static void batchAccountDelete(com.azure.resourcemanager.demoservice.DemoserviceManager manager) {
        manager.operationGroups().getWithResponse("demoserviceClient", Context.NONE);
    }
}
```

