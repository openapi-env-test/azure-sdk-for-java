# Code snippets and samples


## Workbooks

- [CreateOrUpdate](#workbooks_createorupdate)
- [Delete](#workbooks_delete)
- [GetByResourceGroup](#workbooks_getbyresourcegroup)
- [List](#workbooks_list)
- [ListByResourceGroup](#workbooks_listbyresourcegroup)
- [RevisionGet](#workbooks_revisionget)
- [RevisionsList](#workbooks_revisionslist)
- [Update](#workbooks_update)
### Workbooks_CreateOrUpdate

```java
import com.azure.resourcemanager.applicationinsights.models.Kind;
import com.azure.resourcemanager.applicationinsights.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.applicationinsights.models.UserAssignedIdentity;
import com.azure.resourcemanager.applicationinsights.models.WorkbookResourceIdentity;
import java.util.HashMap;
import java.util.Map;

/** Samples for Workbooks CreateOrUpdate. */
public final class WorkbooksCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2022-02-01/examples/WorkbookManagedAdd.json
     */
    /**
     * Sample code: WorkbookManagedAdd.
     *
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void workbookManagedAdd(
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        manager
            .workbooks()
            .define("deadb33f-5e0d-4064-8ebb-1a4ed0313eb2")
            .withRegion("westus")
            .withExistingResourceGroup("my-resource-group")
            .withIdentity(
                new WorkbookResourceIdentity()
                    .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(
                        mapOf(
                            "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/my-resource-group/providers/Microsoft.ManagedIdentity/userAssignedIdentities/myid",
                            new UserAssignedIdentity())))
            .withKind(Kind.SHARED)
            .withDisplayName("Sample workbook")
            .withSerializedData(
                "{\"version\":\"Notebook/1.0\",\"items\":[{\"type\":1,\"content\":{\"json\":\"test\"},\"name\":\"text -"
                    + " 0\"}],\"isLocked\":false,\"fallbackResourceIds\":[\"/subscriptions/00000000-0000-0000-0000-00000000/resourceGroups/my-resource-group\"]}")
            .withVersion("Notebook/1.0")
            .withCategory("workbook")
            .withStorageUri(
                "/subscriptions/6b643656-33eb-422f-aee8-3ac145d124af/resourceGroups/my-resource-group/providers/Microsoft.Storage/storageAccounts/mystorage/blobServices/default/containers/mycontainer")
            .withDescription("Sample workbook")
            .withSourceIdParameter(
                "/subscriptions/6b643656-33eb-422f-aee8-3ac145d124af/resourcegroups/my-resource-group")
            .create();
    }

    /*
     * x-ms-original-file: specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2022-02-01/examples/WorkbookAdd.json
     */
    /**
     * Sample code: WorkbookAdd.
     *
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void workbookAdd(com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        manager
            .workbooks()
            .define("deadb33f-5e0d-4064-8ebb-1a4ed0313eb2")
            .withRegion("westus")
            .withExistingResourceGroup("my-resource-group")
            .withTags(mapOf("TagSample01", "sample01", "TagSample02", "sample02"))
            .withKind(Kind.SHARED)
            .withDisplayName("Sample workbook")
            .withSerializedData(
                "{\"version\":\"Notebook/1.0\",\"items\":[{\"type\":1,\"content\":\"{\"json\":\"## New workbook\\r"
                    + "\\n"
                    + "---\\r"
                    + "\\n"
                    + "\\r"
                    + "\\n"
                    + "Welcome to your new workbook.  This area will display text formatted as markdown.\\r"
                    + "\\n"
                    + "\\r"
                    + "\\n"
                    + "\\r"
                    + "\\n"
                    + "We've included a basic analytics query to get you started. Use the `Edit` button below each"
                    + " section to configure it or add more"
                    + " sections.\"}\",\"halfWidth\":null,\"conditionalVisibility\":null},{\"type\":3,\"content\":\"{\"version\":\"KqlItem/1.0\",\"query\":\"union"
                    + " withsource=TableName *\\n"
                    + "| summarize Count=count() by TableName\\n"
                    + "| render"
                    + " barchart\",\"showQuery\":false,\"size\":1,\"aggregation\":0,\"showAnnotations\":false}\",\"halfWidth\":null,\"conditionalVisibility\":null}],\"isLocked\":false}")
            .withCategory("workbook")
            .withDescription("Sample workbook")
            .withSourceIdParameter(
                "/subscriptions/6b643656-33eb-422f-aee8-3ac145d124af/resourcegroups/my-resource-group")
            .create();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
```

### Workbooks_Delete

```java
import com.azure.core.util.Context;

/** Samples for Workbooks Delete. */
public final class WorkbooksDeleteSamples {
    /*
     * x-ms-original-file: specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2022-02-01/examples/WorkbookDelete.json
     */
    /**
     * Sample code: WorkbookDelete.
     *
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void workbookDelete(
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        manager
            .workbooks()
            .deleteWithResponse("my-resource-group", "deadb33f-5e0d-4064-8ebb-1a4ed0313eb2", Context.NONE);
    }
}
```

### Workbooks_GetByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for Workbooks GetByResourceGroup. */
public final class WorkbooksGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2022-02-01/examples/WorkbookGet1.json
     */
    /**
     * Sample code: WorkbookGet1.
     *
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void workbookGet1(com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        manager
            .workbooks()
            .getByResourceGroupWithResponse(
                "my-resource-group", "deadb33f-5e0d-4064-8ebb-1a4ed0313eb2", null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2022-02-01/examples/WorkbookManagedGet.json
     */
    /**
     * Sample code: WorkbookManagedGet.
     *
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void workbookManagedGet(
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        manager
            .workbooks()
            .getByResourceGroupWithResponse(
                "my-resource-group", "deadb33f-5e0d-4064-8ebb-1a4ed0313eb2", null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2022-02-01/examples/WorkbookGet.json
     */
    /**
     * Sample code: WorkbookGet.
     *
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void workbookGet(com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        manager
            .workbooks()
            .getByResourceGroupWithResponse(
                "my-resource-group", "deadb33f-5e0d-4064-8ebb-1a4ed0313eb2", null, Context.NONE);
    }
}
```

### Workbooks_List

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.applicationinsights.models.CategoryType;

/** Samples for Workbooks List. */
public final class WorkbooksListSamples {
    /*
     * x-ms-original-file: specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2022-02-01/examples/WorkbooksListSub.json
     */
    /**
     * Sample code: WorkbooksListSub.
     *
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void workbooksListSub(
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        manager.workbooks().list(CategoryType.WORKBOOK, null, null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2022-02-01/examples/WorkbooksList2.json
     */
    /**
     * Sample code: WorkbooksList2.
     *
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void workbooksList2(
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        manager.workbooks().list(CategoryType.WORKBOOK, null, null, Context.NONE);
    }
}
```

### Workbooks_ListByResourceGroup

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.applicationinsights.models.CategoryType;

/** Samples for Workbooks ListByResourceGroup. */
public final class WorkbooksListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2022-02-01/examples/WorkbooksManagedList.json
     */
    /**
     * Sample code: WorkbooksManagedList.
     *
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void workbooksManagedList(
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        manager
            .workbooks()
            .listByResourceGroup(
                "my-resource-group",
                CategoryType.WORKBOOK,
                null,
                "/subscriptions/6b643656-33eb-422f-aee8-3ac119r124af/resourceGroups/my-resource-group/providers/Microsoft.Web/sites/MyApp",
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2022-02-01/examples/WorkbooksList.json
     */
    /**
     * Sample code: WorkbooksList.
     *
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void workbooksList(com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        manager
            .workbooks()
            .listByResourceGroup(
                "my-resource-group",
                CategoryType.WORKBOOK,
                null,
                "/subscriptions/6b643656-33eb-422f-aee8-3ac145d124af/resourceGroups/my-resource-group/providers/Microsoft.Web/sites/MyApp",
                null,
                Context.NONE);
    }
}
```

### Workbooks_RevisionGet

```java
import com.azure.core.util.Context;

/** Samples for Workbooks RevisionGet. */
public final class WorkbooksRevisionGetSamples {
    /*
     * x-ms-original-file: specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2022-02-01/examples/WorkbookRevisionGet.json
     */
    /**
     * Sample code: WorkbookRevisionGet.
     *
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void workbookRevisionGet(
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        manager
            .workbooks()
            .revisionGetWithResponse(
                "my-resource-group",
                "deadb33f-5e0d-4064-8ebb-1a4ed0313eb2",
                "1e2f8435b98248febee70c64ac22e1ab",
                Context.NONE);
    }
}
```

### Workbooks_RevisionsList

```java
import com.azure.core.util.Context;

/** Samples for Workbooks RevisionsList. */
public final class WorkbooksRevisionsListSamples {
    /*
     * x-ms-original-file: specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2022-02-01/examples/WorkbookRevisionsList.json
     */
    /**
     * Sample code: WorkbookRevisionsList.
     *
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void workbookRevisionsList(
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        manager.workbooks().revisionsList("my-resource-group", "deadb33f-5e0d-4064-8ebb-1a4ed0313eb2", Context.NONE);
    }
}
```

### Workbooks_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.applicationinsights.models.Workbook;

/** Samples for Workbooks Update. */
public final class WorkbooksUpdateSamples {
    /*
     * x-ms-original-file: specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2022-02-01/examples/WorkbookUpdate.json
     */
    /**
     * Sample code: WorkbookUpdate.
     *
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void workbookUpdate(
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        Workbook resource =
            manager
                .workbooks()
                .getByResourceGroupWithResponse(
                    "my-resource-group", "deadb33f-5e0d-4064-8ebb-1a4ed0313eb2", null, Context.NONE)
                .getValue();
        resource
            .update()
            .withSourceId(
                "/subscriptions/6b643656-33eb-422f-aee8-3ac145d124af/resourceGroups/my-resource-group/providers/Microsoft.Web/sites/MyApp")
            .apply();
    }

    /*
     * x-ms-original-file: specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2022-02-01/examples/WorkbookManagedUpdate.json
     */
    /**
     * Sample code: WorkbookManagedUpdate.
     *
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void workbookManagedUpdate(
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        Workbook resource =
            manager
                .workbooks()
                .getByResourceGroupWithResponse(
                    "my-resource-group", "deadb33f-5e0d-4064-8ebb-1a4ed0313eb2", null, Context.NONE)
                .getValue();
        resource
            .update()
            .withSourceId("/subscriptions/6b643656-33eb-422f-aee8-3ac145d124af/resourcegroups/my-resource-group")
            .apply();
    }
}
```

