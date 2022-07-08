# Code snippets and samples


## RoleAssignmentScheduleRequests

- [Cancel](#roleassignmentschedulerequests_cancel)
- [Create](#roleassignmentschedulerequests_create)
- [Get](#roleassignmentschedulerequests_get)
- [ListForScope](#roleassignmentschedulerequests_listforscope)
- [Validate](#roleassignmentschedulerequests_validate)

## RoleEligibilityScheduleRequests

- [Cancel](#roleeligibilityschedulerequests_cancel)
- [Create](#roleeligibilityschedulerequests_create)
- [Get](#roleeligibilityschedulerequests_get)
- [ListForScope](#roleeligibilityschedulerequests_listforscope)
- [Validate](#roleeligibilityschedulerequests_validate)
### RoleAssignmentScheduleRequests_Cancel

```java
import com.azure.core.util.Context;

/** Samples for RoleAssignmentScheduleRequests Cancel. */
public final class RoleAssignmentScheduleRequestsCancelSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2022-06-02/examples/CancelRoleAssignmentScheduleRequestByName.json
     */
    /**
     * Sample code: CancelRoleAssignmentScheduleRequestByName.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void cancelRoleAssignmentScheduleRequestByName(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleAssignmentScheduleRequests()
            .cancelWithResponse(
                "providers/Microsoft.Subscription/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f",
                "fea7a502-9a96-4806-a26f-eee560e52045",
                Context.NONE);
    }
}
```

### RoleAssignmentScheduleRequests_Create

```java
import com.azure.resourcemanager.authorization.generated.models.RequestType;
import com.azure.resourcemanager.authorization.generated.models.RoleAssignmentScheduleRequestPropertiesScheduleInfo;
import com.azure.resourcemanager.authorization.generated.models.RoleAssignmentScheduleRequestPropertiesScheduleInfoExpiration;
import com.azure.resourcemanager.authorization.generated.models.Type;
import java.time.OffsetDateTime;

/** Samples for RoleAssignmentScheduleRequests Create. */
public final class RoleAssignmentScheduleRequestsCreateSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2022-06-02/examples/PutRoleAssignmentScheduleRequest.json
     */
    /**
     * Sample code: PutRoleAssignmentScheduleRequest.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void putRoleAssignmentScheduleRequest(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleAssignmentScheduleRequests()
            .define("fea7a502-9a96-4806-a26f-eee560e52045")
            .withExistingScope("providers/Microsoft.Subscription/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f")
            .withRoleDefinitionId(
                "/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f/providers/Microsoft.Authorization/roleDefinitions/c8d4ff99-41c3-41a8-9f60-21dfdad59608")
            .withPrincipalId("a3bb8764-cb92-4276-9d2a-ca1e895e55ea")
            .withRequestType(RequestType.SELF_ACTIVATE)
            .withScheduleInfo(
                new RoleAssignmentScheduleRequestPropertiesScheduleInfo()
                    .withStartDateTime(OffsetDateTime.parse("2020-09-09T21:35:27.91Z"))
                    .withExpiration(
                        new RoleAssignmentScheduleRequestPropertiesScheduleInfoExpiration()
                            .withType(Type.AFTER_DURATION)
                            .withDuration("PT8H")))
            .withLinkedRoleEligibilityScheduleId("b1477448-2cc6-4ceb-93b4-54a202a89413")
            .withCondition(
                "@Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName]"
                    + " StringEqualsIgnoreCase 'foo_storage_container'")
            .withConditionVersion("1.0")
            .create();
    }
}
```

### RoleAssignmentScheduleRequests_Get

```java
import com.azure.core.util.Context;

/** Samples for RoleAssignmentScheduleRequests Get. */
public final class RoleAssignmentScheduleRequestsGetSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2022-06-02/examples/GetRoleAssignmentScheduleRequestByName.json
     */
    /**
     * Sample code: GetRoleAssignmentScheduleRequestByName.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getRoleAssignmentScheduleRequestByName(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleAssignmentScheduleRequests()
            .getWithResponse(
                "providers/Microsoft.Subscription/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f",
                "fea7a502-9a96-4806-a26f-eee560e52045",
                Context.NONE);
    }
}
```

### RoleAssignmentScheduleRequests_ListForScope

```java
import com.azure.core.util.Context;

/** Samples for RoleAssignmentScheduleRequests ListForScope. */
public final class RoleAssignmentScheduleRequestsListForScopeSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2022-06-02/examples/GetRoleAssignmentScheduleRequestByScope.json
     */
    /**
     * Sample code: GetRoleAssignmentScheduleRequestByScope.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getRoleAssignmentScheduleRequestByScope(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleAssignmentScheduleRequests()
            .listForScope(
                "providers/Microsoft.Subscription/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f",
                "assignedTo('A3BB8764-CB92-4276-9D2A-CA1E895E55EA')",
                Context.NONE);
    }
}
```

### RoleAssignmentScheduleRequests_Validate

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.generated.fluent.models.RoleAssignmentScheduleRequestInner;
import com.azure.resourcemanager.authorization.generated.models.RequestType;
import com.azure.resourcemanager.authorization.generated.models.RoleAssignmentScheduleRequestPropertiesScheduleInfo;
import com.azure.resourcemanager.authorization.generated.models.RoleAssignmentScheduleRequestPropertiesScheduleInfoExpiration;
import com.azure.resourcemanager.authorization.generated.models.Type;
import java.time.OffsetDateTime;

/** Samples for RoleAssignmentScheduleRequests Validate. */
public final class RoleAssignmentScheduleRequestsValidateSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2022-06-02/examples/ValidateRoleAssignmentScheduleRequestByName.json
     */
    /**
     * Sample code: ValidateRoleAssignmentScheduleRequestByName.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void validateRoleAssignmentScheduleRequestByName(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleAssignmentScheduleRequests()
            .validateWithResponse(
                "subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f",
                "fea7a502-9a96-4806-a26f-eee560e52045",
                new RoleAssignmentScheduleRequestInner()
                    .withRoleDefinitionId(
                        "/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f/providers/Microsoft.Authorization/roleDefinitions/c8d4ff99-41c3-41a8-9f60-21dfdad59608")
                    .withPrincipalId("a3bb8764-cb92-4276-9d2a-ca1e895e55ea")
                    .withRequestType(RequestType.SELF_ACTIVATE)
                    .withScheduleInfo(
                        new RoleAssignmentScheduleRequestPropertiesScheduleInfo()
                            .withStartDateTime(OffsetDateTime.parse("2020-09-09T21:35:27.91Z"))
                            .withExpiration(
                                new RoleAssignmentScheduleRequestPropertiesScheduleInfoExpiration()
                                    .withType(Type.AFTER_DURATION)
                                    .withDuration("PT8H")))
                    .withLinkedRoleEligibilityScheduleId("b1477448-2cc6-4ceb-93b4-54a202a89413")
                    .withCondition(
                        "@Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName]"
                            + " StringEqualsIgnoreCase 'foo_storage_container'")
                    .withConditionVersion("1.0"),
                Context.NONE);
    }
}
```

### RoleEligibilityScheduleRequests_Cancel

```java
import com.azure.core.util.Context;

/** Samples for RoleEligibilityScheduleRequests Cancel. */
public final class RoleEligibilityScheduleRequestsCancelSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2022-06-02/examples/CancelRoleEligibilityScheduleRequestByName.json
     */
    /**
     * Sample code: CancelRoleEligibilityScheduleRequestByName.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void cancelRoleEligibilityScheduleRequestByName(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleEligibilityScheduleRequests()
            .cancelWithResponse(
                "providers/Microsoft.Subscription/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f",
                "64caffb6-55c0-4deb-a585-68e948ea1ad6",
                Context.NONE);
    }
}
```

### RoleEligibilityScheduleRequests_Create

```java
import com.azure.resourcemanager.authorization.generated.models.RequestType;
import com.azure.resourcemanager.authorization.generated.models.RoleEligibilityScheduleRequestPropertiesScheduleInfo;
import com.azure.resourcemanager.authorization.generated.models.RoleEligibilityScheduleRequestPropertiesScheduleInfoExpiration;
import com.azure.resourcemanager.authorization.generated.models.Type;
import java.time.OffsetDateTime;

/** Samples for RoleEligibilityScheduleRequests Create. */
public final class RoleEligibilityScheduleRequestsCreateSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2022-06-02/examples/PutRoleEligibilityScheduleRequest.json
     */
    /**
     * Sample code: PutRoleEligibilityScheduleRequest.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void putRoleEligibilityScheduleRequest(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleEligibilityScheduleRequests()
            .define("64caffb6-55c0-4deb-a585-68e948ea1ad6")
            .withExistingScope("providers/Microsoft.Subscription/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f")
            .withRoleDefinitionId(
                "/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f/providers/Microsoft.Authorization/roleDefinitions/c8d4ff99-41c3-41a8-9f60-21dfdad59608")
            .withPrincipalId("a3bb8764-cb92-4276-9d2a-ca1e895e55ea")
            .withRequestType(RequestType.ADMIN_ASSIGN)
            .withScheduleInfo(
                new RoleEligibilityScheduleRequestPropertiesScheduleInfo()
                    .withStartDateTime(OffsetDateTime.parse("2020-09-09T21:31:27.91Z"))
                    .withExpiration(
                        new RoleEligibilityScheduleRequestPropertiesScheduleInfoExpiration()
                            .withType(Type.AFTER_DURATION)
                            .withDuration("P365D")))
            .withCondition(
                "@Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName]"
                    + " StringEqualsIgnoreCase 'foo_storage_container'")
            .withConditionVersion("1.0")
            .create();
    }
}
```

### RoleEligibilityScheduleRequests_Get

```java
import com.azure.core.util.Context;

/** Samples for RoleEligibilityScheduleRequests Get. */
public final class RoleEligibilityScheduleRequestsGetSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2022-06-02/examples/GetRoleEligibilityScheduleRequestByName.json
     */
    /**
     * Sample code: GetRoleEligibilityScheduleRequestByName.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getRoleEligibilityScheduleRequestByName(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleEligibilityScheduleRequests()
            .getWithResponse(
                "providers/Microsoft.Subscription/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f",
                "64caffb6-55c0-4deb-a585-68e948ea1ad6",
                Context.NONE);
    }
}
```

### RoleEligibilityScheduleRequests_ListForScope

```java
import com.azure.core.util.Context;

/** Samples for RoleEligibilityScheduleRequests ListForScope. */
public final class RoleEligibilityScheduleRequestsListForScopeSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2022-06-02/examples/GetRoleEligibilityScheduleRequestByScope.json
     */
    /**
     * Sample code: GetRoleEligibilityScheduleRequestByScope.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getRoleEligibilityScheduleRequestByScope(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleEligibilityScheduleRequests()
            .listForScope(
                "providers/Microsoft.Subscription/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f",
                "assignedTo('A3BB8764-CB92-4276-9D2A-CA1E895E55EA')",
                Context.NONE);
    }
}
```

### RoleEligibilityScheduleRequests_Validate

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.generated.fluent.models.RoleEligibilityScheduleRequestInner;
import com.azure.resourcemanager.authorization.generated.models.RequestType;
import com.azure.resourcemanager.authorization.generated.models.RoleEligibilityScheduleRequestPropertiesScheduleInfo;
import com.azure.resourcemanager.authorization.generated.models.RoleEligibilityScheduleRequestPropertiesScheduleInfoExpiration;
import com.azure.resourcemanager.authorization.generated.models.Type;
import java.time.OffsetDateTime;

/** Samples for RoleEligibilityScheduleRequests Validate. */
public final class RoleEligibilityScheduleRequestsValidateSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2022-06-02/examples/ValidateRoleEligibilityScheduleRequestByName.json
     */
    /**
     * Sample code: ValidateRoleEligibilityScheduleRequestByName.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void validateRoleEligibilityScheduleRequestByName(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleEligibilityScheduleRequests()
            .validateWithResponse(
                "subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f",
                "64caffb6-55c0-4deb-a585-68e948ea1ad6",
                new RoleEligibilityScheduleRequestInner()
                    .withRoleDefinitionId(
                        "/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f/providers/Microsoft.Authorization/roleDefinitions/c8d4ff99-41c3-41a8-9f60-21dfdad59608")
                    .withPrincipalId("a3bb8764-cb92-4276-9d2a-ca1e895e55ea")
                    .withRequestType(RequestType.ADMIN_ASSIGN)
                    .withScheduleInfo(
                        new RoleEligibilityScheduleRequestPropertiesScheduleInfo()
                            .withStartDateTime(OffsetDateTime.parse("2020-09-09T21:31:27.91Z"))
                            .withExpiration(
                                new RoleEligibilityScheduleRequestPropertiesScheduleInfoExpiration()
                                    .withType(Type.AFTER_DURATION)
                                    .withDuration("P365D")))
                    .withCondition(
                        "@Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName]"
                            + " StringEqualsIgnoreCase 'foo_storage_container'")
                    .withConditionVersion("1.0"),
                Context.NONE);
    }
}
```

