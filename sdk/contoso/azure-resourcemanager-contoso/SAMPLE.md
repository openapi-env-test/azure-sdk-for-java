# Code snippets and samples


## Foos

- [GetByResourceGroup](#foos_getbyresourcegroup)
### Foos_GetByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for Foos GetByResourceGroup. */
public final class FoosGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/contoso/resource-manager/Microsoft.Contoso/preview/2020-12-21/examples/OperationGroupGet.json
     */
    /**
     * Sample code: BatchAccountDelete.
     *
     * @param manager Entry point to ContosoManager.
     */
    public static void batchAccountDelete(com.azure.resourcemanager.contoso.ContosoManager manager) {
        manager.foos().getByResourceGroupWithResponse("contosoClient", "foodName", Context.NONE);
    }
}
```

