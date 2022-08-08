# Code snippets and samples


## RoleAssignments

- [Create](#roleassignments_create)
- [CreateById](#roleassignments_createbyid)
- [Delete](#roleassignments_delete)
- [DeleteById](#roleassignments_deletebyid)
- [Get](#roleassignments_get)
- [GetById](#roleassignments_getbyid)
- [List](#roleassignments_list)
- [ListByResourceGroup](#roleassignments_listbyresourcegroup)
- [ListForResource](#roleassignments_listforresource)
- [ListForScope](#roleassignments_listforscope)
### RoleAssignments_Create

```java
import com.azure.resourcemanager.authorization.generated.models.PrincipalType;

/** Samples for RoleAssignments Create. */
public final class RoleAssignmentsCreateSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-01-03/examples/PutRoleAssignment.json
     */
    /**
     * Sample code: Create role assignment.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void createRoleAssignment(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleAssignments()
            .define("roleAssignmentName")
            .withExistingScope("scope")
            .withRoleDefinitionId(
                "/subscriptions/4004a9fd-d58e-48dc-aeb2-4a4aec58606f/providers/Microsoft.Authorization/roleDefinitions/de139f84-1756-47ae-9be6-808fbbe84772")
            .withPrincipalId("d93a38bc-d029-4160-bfb0-fbda779ac214")
            .withPrincipalType(PrincipalType.USER)
            .withCanDelegate(false)
            .withDescription("Grants UserFoo role assignment bar in scope baz")
            .withCondition(
                "@Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName]"
                    + " StringEqualsIgnoreCase 'foo_storage_container'")
            .withConditionVersion("1.0")
            .create();
    }
}
```

### RoleAssignments_CreateById

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.generated.models.PrincipalType;
import com.azure.resourcemanager.authorization.generated.models.RoleAssignmentCreateParameters;

/** Samples for RoleAssignments CreateById. */
public final class RoleAssignmentsCreateByIdSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-01-03/examples/PutRoleAssignmentById.json
     */
    /**
     * Sample code: Create role assignment by ID.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void createRoleAssignmentByID(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleAssignments()
            .createByIdWithResponse(
                "roleAssignmentId",
                new RoleAssignmentCreateParameters()
                    .withRoleDefinitionId(
                        "/subscriptions/4004a9fd-d58e-48dc-aeb2-4a4aec58606f/providers/Microsoft.Authorization/roleDefinitions/de139f84-1756-47ae-9be6-808fbbe84772")
                    .withPrincipalId("d93a38bc-d029-4160-bfb0-fbda779ac214")
                    .withPrincipalType(PrincipalType.USER)
                    .withCanDelegate(false)
                    .withDescription("Grants UserFoo role assignment bar in scope baz")
                    .withCondition(
                        "@Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName]"
                            + " StringEqualsIgnoreCase 'foo_storage_container'")
                    .withConditionVersion("1.0"),
                Context.NONE);
    }
}
```

### RoleAssignments_Delete

```java
import com.azure.core.util.Context;

/** Samples for RoleAssignments Delete. */
public final class RoleAssignmentsDeleteSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-01-03/examples/DeleteRoleAssignmentByName.json
     */
    /**
     * Sample code: Delete role assignment by name.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void deleteRoleAssignmentByName(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.roleAssignments().deleteWithResponse("scope", "roleAssignmentName", null, Context.NONE);
    }
}
```

### RoleAssignments_DeleteById

```java
import com.azure.core.util.Context;

/** Samples for RoleAssignments DeleteById. */
public final class RoleAssignmentsDeleteByIdSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-01-03/examples/DeleteRoleAssignmentById.json
     */
    /**
     * Sample code: Delete role assignment by ID.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void deleteRoleAssignmentByID(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.roleAssignments().deleteByIdWithResponse("roleAssignmentId", null, Context.NONE);
    }
}
```

### RoleAssignments_Get

```java
import com.azure.core.util.Context;

/** Samples for RoleAssignments Get. */
public final class RoleAssignmentsGetSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-01-03/examples/GetRoleAssignmentByName.json
     */
    /**
     * Sample code: Get role assignment by name.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getRoleAssignmentByName(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.roleAssignments().getWithResponse("scope", "roleAssignmentName", null, Context.NONE);
    }
}
```

### RoleAssignments_GetById

```java
import com.azure.core.util.Context;

/** Samples for RoleAssignments GetById. */
public final class RoleAssignmentsGetByIdSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-01-03/examples/GetRoleAssignmentById.json
     */
    /**
     * Sample code: Get role assignment by ID.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getRoleAssignmentByID(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.roleAssignments().getByIdWithResponse("roleassignmentId", null, Context.NONE);
    }
}
```

### RoleAssignments_List

```java
import com.azure.core.util.Context;

/** Samples for RoleAssignments List. */
public final class RoleAssignmentsListSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-01-03/examples/GetAllRoleAssignments.json
     */
    /**
     * Sample code: List role assignments for subscription.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void listRoleAssignmentsForSubscription(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.roleAssignments().list(null, null, Context.NONE);
    }
}
```

### RoleAssignments_ListByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for RoleAssignments ListByResourceGroup. */
public final class RoleAssignmentsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-01-03/examples/GetRoleAssignmentsForResourceGroup.json
     */
    /**
     * Sample code: List role assignments for resource group.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void listRoleAssignmentsForResourceGroup(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.roleAssignments().listByResourceGroup("rgname", null, null, Context.NONE);
    }
}
```

### RoleAssignments_ListForResource

```java
import com.azure.core.util.Context;

/** Samples for RoleAssignments ListForResource. */
public final class RoleAssignmentsListForResourceSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-01-03/examples/GetRoleAssignmentsForResource.json
     */
    /**
     * Sample code: List role assignments for resource.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void listRoleAssignmentsForResource(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleAssignments()
            .listForResource(
                "rgname",
                "resourceProviderNamespace",
                "parentResourcePath",
                "resourceType",
                "resourceName",
                null,
                null,
                Context.NONE);
    }
}
```

### RoleAssignments_ListForScope

```java
import com.azure.core.util.Context;

/** Samples for RoleAssignments ListForScope. */
public final class RoleAssignmentsListForScopeSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-01-03/examples/GetRoleAssignmentByScope.json
     */
    /**
     * Sample code: List role assignments for scope.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void listRoleAssignmentsForScope(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.roleAssignments().listForScope("scope", null, null, Context.NONE);
    }
}
```

