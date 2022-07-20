# Code snippets and samples


## OperationGroup

- [Get](#operationgroup_get)
### OperationGroup_Get

```java
import com.azure.core.util.Context;

/** Samples for OperationGroup Get. */
public final class OperationGroupGetSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/OperationGroupGet.json
     */
    /**
     * Sample code: BatchAccountDelete.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void batchAccountDelete(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager.operationGroups().getWithResponse("singularityClient", Context.NONE);
    }
}
```

