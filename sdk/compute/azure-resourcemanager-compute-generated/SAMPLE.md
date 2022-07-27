# Code snippets and samples


## DiskAccesses

- [CreateOrUpdate](#diskaccesses_createorupdate)
- [Delete](#diskaccesses_delete)
- [DeleteAPrivateEndpointConnection](#diskaccesses_deleteaprivateendpointconnection)
- [GetAPrivateEndpointConnection](#diskaccesses_getaprivateendpointconnection)
- [GetByResourceGroup](#diskaccesses_getbyresourcegroup)
- [GetPrivateLinkResources](#diskaccesses_getprivatelinkresources)
- [List](#diskaccesses_list)
- [ListByResourceGroup](#diskaccesses_listbyresourcegroup)
- [ListPrivateEndpointConnections](#diskaccesses_listprivateendpointconnections)
- [Update](#diskaccesses_update)
- [UpdateAPrivateEndpointConnection](#diskaccesses_updateaprivateendpointconnection)

## DiskEncryptionSets

- [CreateOrUpdate](#diskencryptionsets_createorupdate)
- [Delete](#diskencryptionsets_delete)
- [GetByResourceGroup](#diskencryptionsets_getbyresourcegroup)
- [List](#diskencryptionsets_list)
- [ListAssociatedResources](#diskencryptionsets_listassociatedresources)
- [ListByResourceGroup](#diskencryptionsets_listbyresourcegroup)
- [Update](#diskencryptionsets_update)

## DiskRestorePoint

- [Get](#diskrestorepoint_get)
- [GrantAccess](#diskrestorepoint_grantaccess)
- [ListByRestorePoint](#diskrestorepoint_listbyrestorepoint)
- [RevokeAccess](#diskrestorepoint_revokeaccess)

## Disks

- [CreateOrUpdate](#disks_createorupdate)
- [Delete](#disks_delete)
- [GetByResourceGroup](#disks_getbyresourcegroup)
- [GrantAccess](#disks_grantaccess)
- [List](#disks_list)
- [ListByResourceGroup](#disks_listbyresourcegroup)
- [RevokeAccess](#disks_revokeaccess)
- [Update](#disks_update)

## Snapshots

- [CreateOrUpdate](#snapshots_createorupdate)
- [Delete](#snapshots_delete)
- [GetByResourceGroup](#snapshots_getbyresourcegroup)
- [GrantAccess](#snapshots_grantaccess)
- [List](#snapshots_list)
- [ListByResourceGroup](#snapshots_listbyresourcegroup)
- [RevokeAccess](#snapshots_revokeaccess)
- [Update](#snapshots_update)
### DiskAccesses_CreateOrUpdate

```java
/** Samples for DiskAccesses CreateOrUpdate. */
public final class DiskAccessesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/CreateADiskAccess.json
     */
    /**
     * Sample code: Create a disk access resource.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createADiskAccessResource(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .diskAccesses()
            .define("myDiskAccess")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .create();
    }
}
```

### DiskAccesses_Delete

```java
import com.azure.core.util.Context;

/** Samples for DiskAccesses Delete. */
public final class DiskAccessesDeleteSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/DeleteADiskAccess.json
     */
    /**
     * Sample code: Delete a disk access resource.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void deleteADiskAccessResource(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.diskAccesses().delete("myResourceGroup", "myDiskAccess", Context.NONE);
    }
}
```

### DiskAccesses_DeleteAPrivateEndpointConnection

```java
import com.azure.core.util.Context;

/** Samples for DiskAccesses DeleteAPrivateEndpointConnection. */
public final class DiskAccessesDeleteAPrivateEndpointConnectionSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/DeleteAPrivateEndpointConnection.json
     */
    /**
     * Sample code: Delete a private endpoint connection under a disk access resource.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void deleteAPrivateEndpointConnectionUnderADiskAccessResource(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .diskAccesses()
            .deleteAPrivateEndpointConnection(
                "myResourceGroup", "myDiskAccess", "myPrivateEndpointConnection", Context.NONE);
    }
}
```

### DiskAccesses_GetAPrivateEndpointConnection

```java
import com.azure.core.util.Context;

/** Samples for DiskAccesses GetAPrivateEndpointConnection. */
public final class DiskAccessesGetAPrivateEndpointConnectionSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/GetInformationAboutAPrivateEndpointConnection.json
     */
    /**
     * Sample code: Get information about a private endpoint connection under a disk access resource.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getInformationAboutAPrivateEndpointConnectionUnderADiskAccessResource(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .diskAccesses()
            .getAPrivateEndpointConnectionWithResponse(
                "myResourceGroup", "myDiskAccess", "myPrivateEndpointConnection", Context.NONE);
    }
}
```

### DiskAccesses_GetByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for DiskAccesses GetByResourceGroup. */
public final class DiskAccessesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/GetInformationAboutADiskAccess.json
     */
    /**
     * Sample code: Get information about a disk access resource.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getInformationAboutADiskAccessResource(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.diskAccesses().getByResourceGroupWithResponse("myResourceGroup", "myDiskAccess", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/GetInformationAboutADiskAccessWithPrivateEndpoints.json
     */
    /**
     * Sample code: Get information about a disk access resource with private endpoints.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getInformationAboutADiskAccessResourceWithPrivateEndpoints(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.diskAccesses().getByResourceGroupWithResponse("myResourceGroup", "myDiskAccess", Context.NONE);
    }
}
```

### DiskAccesses_GetPrivateLinkResources

```java
import com.azure.core.util.Context;

/** Samples for DiskAccesses GetPrivateLinkResources. */
public final class DiskAccessesGetPrivateLinkResourcesSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/GetDiskAccessPrivateLinkResources.json
     */
    /**
     * Sample code: List all possible private link resources under disk access resource.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listAllPossiblePrivateLinkResourcesUnderDiskAccessResource(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.diskAccesses().getPrivateLinkResourcesWithResponse("myResourceGroup", "myDiskAccess", Context.NONE);
    }
}
```

### DiskAccesses_List

```java
import com.azure.core.util.Context;

/** Samples for DiskAccesses List. */
public final class DiskAccessesListSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/ListDiskAccessesInASubscription.json
     */
    /**
     * Sample code: List all disk access resources in a subscription.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listAllDiskAccessResourcesInASubscription(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.diskAccesses().list(Context.NONE);
    }
}
```

### DiskAccesses_ListByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for DiskAccesses ListByResourceGroup. */
public final class DiskAccessesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/ListDiskAccessesInAResourceGroup.json
     */
    /**
     * Sample code: List all disk access resources in a resource group.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listAllDiskAccessResourcesInAResourceGroup(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.diskAccesses().listByResourceGroup("myResourceGroup", Context.NONE);
    }
}
```

### DiskAccesses_ListPrivateEndpointConnections

```java
import com.azure.core.util.Context;

/** Samples for DiskAccesses ListPrivateEndpointConnections. */
public final class DiskAccessesListPrivateEndpointConnectionsSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/ListPrivateEndpointConnectionsInADiskAccess.json
     */
    /**
     * Sample code: Get information about a private endpoint connection under a disk access resource.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getInformationAboutAPrivateEndpointConnectionUnderADiskAccessResource(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.diskAccesses().listPrivateEndpointConnections("myResourceGroup", "myDiskAccess", Context.NONE);
    }
}
```

### DiskAccesses_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.models.DiskAccess;
import java.util.HashMap;
import java.util.Map;

/** Samples for DiskAccesses Update. */
public final class DiskAccessesUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/UpdateADiskAccess.json
     */
    /**
     * Sample code: Update a disk access resource.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void updateADiskAccessResource(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        DiskAccess resource =
            manager
                .diskAccesses()
                .getByResourceGroupWithResponse("myResourceGroup", "myDiskAccess", Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("department", "Development", "project", "PrivateEndpoints")).apply();
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

### DiskAccesses_UpdateAPrivateEndpointConnection

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.compute.generated.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.compute.generated.models.PrivateLinkServiceConnectionState;

/** Samples for DiskAccesses UpdateAPrivateEndpointConnection. */
public final class DiskAccessesUpdateAPrivateEndpointConnectionSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/ApprovePrivateEndpointConnection.json
     */
    /**
     * Sample code: Approve a Private Endpoint Connection under a disk access resource.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void approveAPrivateEndpointConnectionUnderADiskAccessResource(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .diskAccesses()
            .updateAPrivateEndpointConnection(
                "myResourceGroup",
                "myDiskAccess",
                "myPrivateEndpointConnection",
                new PrivateEndpointConnectionInner()
                    .withPrivateLinkServiceConnectionState(
                        new PrivateLinkServiceConnectionState()
                            .withStatus(PrivateEndpointServiceConnectionStatus.APPROVED)
                            .withDescription("Approving myPrivateEndpointConnection")),
                Context.NONE);
    }
}
```

### DiskEncryptionSets_CreateOrUpdate

```java
import com.azure.resourcemanager.compute.generated.models.DiskEncryptionSetIdentityType;
import com.azure.resourcemanager.compute.generated.models.DiskEncryptionSetType;
import com.azure.resourcemanager.compute.generated.models.EncryptionSetIdentity;
import com.azure.resourcemanager.compute.generated.models.KeyForDiskEncryptionSet;
import com.azure.resourcemanager.compute.generated.models.SourceVault;

/** Samples for DiskEncryptionSets CreateOrUpdate. */
public final class DiskEncryptionSetsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/CreateADiskEncryptionSet.json
     */
    /**
     * Sample code: Create a disk encryption set.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createADiskEncryptionSet(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .diskEncryptionSets()
            .define("myDiskEncryptionSet")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withIdentity(new EncryptionSetIdentity().withType(DiskEncryptionSetIdentityType.SYSTEM_ASSIGNED))
            .withEncryptionType(DiskEncryptionSetType.ENCRYPTION_AT_REST_WITH_CUSTOMER_KEY)
            .withActiveKey(
                new KeyForDiskEncryptionSet()
                    .withSourceVault(
                        new SourceVault()
                            .withId(
                                "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.KeyVault/vaults/myVMVault"))
                    .withKeyUrl("https://myvmvault.vault-int.azure-int.net/keys/{key}"))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/CreateADiskEncryptionSetWithKeyVaultFromADifferentSubscription.json
     */
    /**
     * Sample code: Create a disk encryption set with key vault from a different subscription.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createADiskEncryptionSetWithKeyVaultFromADifferentSubscription(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .diskEncryptionSets()
            .define("myDiskEncryptionSet")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withIdentity(new EncryptionSetIdentity().withType(DiskEncryptionSetIdentityType.SYSTEM_ASSIGNED))
            .withEncryptionType(DiskEncryptionSetType.ENCRYPTION_AT_REST_WITH_CUSTOMER_KEY)
            .withActiveKey(
                new KeyForDiskEncryptionSet()
                    .withKeyUrl("https://myvaultdifferentsub.vault-int.azure-int.net/keys/{key}"))
            .create();
    }
}
```

### DiskEncryptionSets_Delete

```java
import com.azure.core.util.Context;

/** Samples for DiskEncryptionSets Delete. */
public final class DiskEncryptionSetsDeleteSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/DeleteADiskEncryptionSet.json
     */
    /**
     * Sample code: Delete a disk encryption set.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void deleteADiskEncryptionSet(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.diskEncryptionSets().delete("myResourceGroup", "myDiskEncryptionSet", Context.NONE);
    }
}
```

### DiskEncryptionSets_GetByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for DiskEncryptionSets GetByResourceGroup. */
public final class DiskEncryptionSetsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/GetInformationAboutADiskEncryptionSet.json
     */
    /**
     * Sample code: Get information about a disk encryption set.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getInformationAboutADiskEncryptionSet(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .diskEncryptionSets()
            .getByResourceGroupWithResponse("myResourceGroup", "myDiskEncryptionSet", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/GetInformationAboutADiskEncryptionSetWithAutoKeyRotationError.json
     */
    /**
     * Sample code: Get information about a disk encryption set when auto-key rotation failed.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getInformationAboutADiskEncryptionSetWhenAutoKeyRotationFailed(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .diskEncryptionSets()
            .getByResourceGroupWithResponse("myResourceGroup", "myDiskEncryptionSet", Context.NONE);
    }
}
```

### DiskEncryptionSets_List

```java
import com.azure.core.util.Context;

/** Samples for DiskEncryptionSets List. */
public final class DiskEncryptionSetsListSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/ListDiskEncryptionSetsInASubscription.json
     */
    /**
     * Sample code: List all disk encryption sets in a subscription.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listAllDiskEncryptionSetsInASubscription(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.diskEncryptionSets().list(Context.NONE);
    }
}
```

### DiskEncryptionSets_ListAssociatedResources

```java
import com.azure.core.util.Context;

/** Samples for DiskEncryptionSets ListAssociatedResources. */
public final class DiskEncryptionSetsListAssociatedResourcesSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/ListDiskEncryptionSetAssociatedResources.json
     */
    /**
     * Sample code: List all resources that are encrypted with this disk encryption set.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listAllResourcesThatAreEncryptedWithThisDiskEncryptionSet(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.diskEncryptionSets().listAssociatedResources("myResourceGroup", "myDiskEncryptionSet", Context.NONE);
    }
}
```

### DiskEncryptionSets_ListByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for DiskEncryptionSets ListByResourceGroup. */
public final class DiskEncryptionSetsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/ListDiskEncryptionSetsInAResourceGroup.json
     */
    /**
     * Sample code: List all disk encryption sets in a resource group.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listAllDiskEncryptionSetsInAResourceGroup(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.diskEncryptionSets().listByResourceGroup("myResourceGroup", Context.NONE);
    }
}
```

### DiskEncryptionSets_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.models.DiskEncryptionSet;
import com.azure.resourcemanager.compute.generated.models.DiskEncryptionSetIdentityType;
import com.azure.resourcemanager.compute.generated.models.DiskEncryptionSetType;
import com.azure.resourcemanager.compute.generated.models.EncryptionSetIdentity;
import com.azure.resourcemanager.compute.generated.models.KeyForDiskEncryptionSet;
import com.azure.resourcemanager.compute.generated.models.SourceVault;
import java.util.HashMap;
import java.util.Map;

/** Samples for DiskEncryptionSets Update. */
public final class DiskEncryptionSetsUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/UpdateADiskEncryptionSetWithRotationToLatestKeyVersionEnabled.json
     */
    /**
     * Sample code: Update a disk encryption set with rotationToLatestKeyVersionEnabled set to true - Succeeded.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void updateADiskEncryptionSetWithRotationToLatestKeyVersionEnabledSetToTrueSucceeded(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        DiskEncryptionSet resource =
            manager
                .diskEncryptionSets()
                .getByResourceGroupWithResponse("myResourceGroup", "myDiskEncryptionSet", Context.NONE)
                .getValue();
        resource
            .update()
            .withIdentity(new EncryptionSetIdentity().withType(DiskEncryptionSetIdentityType.SYSTEM_ASSIGNED))
            .withEncryptionType(DiskEncryptionSetType.ENCRYPTION_AT_REST_WITH_CUSTOMER_KEY)
            .withActiveKey(
                new KeyForDiskEncryptionSet()
                    .withKeyUrl("https://myvaultdifferentsub.vault-int.azure-int.net/keys/keyName/keyVersion1"))
            .withRotationToLatestKeyVersionEnabled(true)
            .apply();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/UpdateADiskEncryptionSetWithRotationToLatestKeyVersionEnabledInProgress.json
     */
    /**
     * Sample code: Update a disk encryption set with rotationToLatestKeyVersionEnabled set to true - Updating.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void updateADiskEncryptionSetWithRotationToLatestKeyVersionEnabledSetToTrueUpdating(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        DiskEncryptionSet resource =
            manager
                .diskEncryptionSets()
                .getByResourceGroupWithResponse("myResourceGroup", "myDiskEncryptionSet", Context.NONE)
                .getValue();
        resource
            .update()
            .withIdentity(new EncryptionSetIdentity().withType(DiskEncryptionSetIdentityType.SYSTEM_ASSIGNED))
            .withEncryptionType(DiskEncryptionSetType.ENCRYPTION_AT_REST_WITH_CUSTOMER_KEY)
            .withActiveKey(
                new KeyForDiskEncryptionSet()
                    .withKeyUrl("https://myvaultdifferentsub.vault-int.azure-int.net/keys/keyName/keyVersion1"))
            .withRotationToLatestKeyVersionEnabled(true)
            .apply();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/UpdateADiskEncryptionSet.json
     */
    /**
     * Sample code: Update a disk encryption set.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void updateADiskEncryptionSet(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        DiskEncryptionSet resource =
            manager
                .diskEncryptionSets()
                .getByResourceGroupWithResponse("myResourceGroup", "myDiskEncryptionSet", Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("department", "Development", "project", "Encryption"))
            .withEncryptionType(DiskEncryptionSetType.ENCRYPTION_AT_REST_WITH_CUSTOMER_KEY)
            .withActiveKey(
                new KeyForDiskEncryptionSet()
                    .withSourceVault(
                        new SourceVault()
                            .withId(
                                "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.KeyVault/vaults/myVMVault"))
                    .withKeyUrl("https://myvmvault.vault-int.azure-int.net/keys/keyName/keyVersion"))
            .apply();
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

### DiskRestorePoint_Get

```java
import com.azure.core.util.Context;

/** Samples for DiskRestorePoint Get. */
public final class DiskRestorePointGetSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/GetDiskRestorePointWhenSourceResourceIsFromDifferentRegion.json
     */
    /**
     * Sample code: Get an incremental disk restorePoint when source resource is from a different region.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getAnIncrementalDiskRestorePointWhenSourceResourceIsFromADifferentRegion(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .diskRestorePoints()
            .getWithResponse(
                "myResourceGroup",
                "rpc",
                "vmrp",
                "TestDisk45ceb03433006d1baee0_b70cd924-3362-4a80-93c2-9415eaa12745",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/GetDiskRestorePointResources.json
     */
    /**
     * Sample code: Get an incremental disk restorePoint resource.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getAnIncrementalDiskRestorePointResource(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .diskRestorePoints()
            .getWithResponse(
                "myResourceGroup",
                "rpc",
                "vmrp",
                "TestDisk45ceb03433006d1baee0_b70cd924-3362-4a80-93c2-9415eaa12745",
                Context.NONE);
    }
}
```

### DiskRestorePoint_GrantAccess

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.models.AccessLevel;
import com.azure.resourcemanager.compute.generated.models.GrantAccessData;

/** Samples for DiskRestorePoint GrantAccess. */
public final class DiskRestorePointGrantAccessSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/BeginGetAccessDiskRestorePoint.json
     */
    /**
     * Sample code: Grants access to a diskRestorePoint.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void grantsAccessToADiskRestorePoint(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .diskRestorePoints()
            .grantAccess(
                "myResourceGroup",
                "rpc",
                "vmrp",
                "TestDisk45ceb03433006d1baee0_b70cd924-3362-4a80-93c2-9415eaa12745",
                new GrantAccessData().withAccess(AccessLevel.READ).withDurationInSeconds(300),
                Context.NONE);
    }
}
```

### DiskRestorePoint_ListByRestorePoint

```java
import com.azure.core.util.Context;

/** Samples for DiskRestorePoint ListByRestorePoint. */
public final class DiskRestorePointListByRestorePointSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/ListDiskRestorePointsInVmRestorePoint.json
     */
    /**
     * Sample code: Get an incremental disk restorePoint resource.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getAnIncrementalDiskRestorePointResource(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.diskRestorePoints().listByRestorePoint("myResourceGroup", "rpc", "vmrp", Context.NONE);
    }
}
```

### DiskRestorePoint_RevokeAccess

```java
import com.azure.core.util.Context;

/** Samples for DiskRestorePoint RevokeAccess. */
public final class DiskRestorePointRevokeAccessSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/EndGetAccessDiskRestorePoint.json
     */
    /**
     * Sample code: Revokes access to a diskRestorePoint.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void revokesAccessToADiskRestorePoint(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .diskRestorePoints()
            .revokeAccess(
                "myResourceGroup",
                "rpc",
                "vmrp",
                "TestDisk45ceb03433006d1baee0_b70cd924-3362-4a80-93c2-9415eaa12745",
                Context.NONE);
    }
}
```

### Disks_CreateOrUpdate

```java
import com.azure.resourcemanager.compute.generated.models.CreationData;
import com.azure.resourcemanager.compute.generated.models.DataAccessAuthMode;
import com.azure.resourcemanager.compute.generated.models.DiskCreateOption;
import com.azure.resourcemanager.compute.generated.models.DiskSecurityProfile;
import com.azure.resourcemanager.compute.generated.models.DiskSecurityTypes;
import com.azure.resourcemanager.compute.generated.models.DiskSku;
import com.azure.resourcemanager.compute.generated.models.DiskStorageAccountTypes;
import com.azure.resourcemanager.compute.generated.models.Encryption;
import com.azure.resourcemanager.compute.generated.models.ExtendedLocation;
import com.azure.resourcemanager.compute.generated.models.ExtendedLocationTypes;
import com.azure.resourcemanager.compute.generated.models.ImageDiskReference;
import com.azure.resourcemanager.compute.generated.models.NetworkAccessPolicy;
import com.azure.resourcemanager.compute.generated.models.OperatingSystemTypes;

/** Samples for Disks CreateOrUpdate. */
public final class DisksCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/CreateAManagedDiskByImportingAnUnmanagedBlobFromADifferentSubscription.json
     */
    /**
     * Sample code: Create a managed disk by importing an unmanaged blob from a different subscription.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAManagedDiskByImportingAnUnmanagedBlobFromADifferentSubscription(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(
                new CreationData()
                    .withCreateOption(DiskCreateOption.IMPORT)
                    .withStorageAccountId(
                        "subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Storage/storageAccounts/myStorageAccount")
                    .withSourceUri("https://mystorageaccount.blob.core.windows.net/osimages/osimage.vhd"))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/CreateAManagedDiskFromImportSecure.json
     */
    /**
     * Sample code: Create a managed disk from ImportSecure create option.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAManagedDiskFromImportSecureCreateOption(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withOsType(OperatingSystemTypes.WINDOWS)
            .withCreationData(
                new CreationData()
                    .withCreateOption(DiskCreateOption.IMPORT_SECURE)
                    .withStorageAccountId(
                        "subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Storage/storageAccounts/myStorageAccount")
                    .withSourceUri("https://mystorageaccount.blob.core.windows.net/osimages/osimage.vhd")
                    .withSecurityDataUri("https://mystorageaccount.blob.core.windows.net/osimages/vmgs.vhd"))
            .withSecurityProfile(
                new DiskSecurityProfile()
                    .withSecurityType(DiskSecurityTypes.CONFIDENTIAL_VM_VMGUEST_STATE_ONLY_ENCRYPTED_WITH_PLATFORM_KEY))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/CreateAManagedDiskWithDiskAccess.json
     */
    /**
     * Sample code: Create a managed disk and associate with disk access resource.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAManagedDiskAndAssociateWithDiskAccessResource(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.EMPTY))
            .withDiskSizeGB(200)
            .withNetworkAccessPolicy(NetworkAccessPolicy.ALLOW_PRIVATE)
            .withDiskAccessId(
                "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskAccesses/{existing-diskAccess-name}")
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/CreateAManagedDiskWithDiskEncryptionSet.json
     */
    /**
     * Sample code: Create a managed disk and associate with disk encryption set.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAManagedDiskAndAssociateWithDiskEncryptionSet(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.EMPTY))
            .withDiskSizeGB(200)
            .withEncryption(
                new Encryption()
                    .withDiskEncryptionSetId(
                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSets/{existing-diskEncryptionSet-name}"))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/CreateAManagedDiskFromAnExistingManagedDisk.json
     */
    /**
     * Sample code: Create a managed disk from an existing managed disk in the same or different subscription.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAManagedDiskFromAnExistingManagedDiskInTheSameOrDifferentSubscription(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .disks()
            .define("myDisk2")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(
                new CreationData()
                    .withCreateOption(DiskCreateOption.COPY)
                    .withSourceResourceId(
                        "subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/disks/myDisk1"))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/CreateAManagedDiskWithSecurityProfile.json
     */
    /**
     * Sample code: Create a managed disk with security profile.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAManagedDiskWithSecurityProfile(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .disks()
            .define("myDisk")
            .withRegion("North Central US")
            .withExistingResourceGroup("myResourceGroup")
            .withOsType(OperatingSystemTypes.WINDOWS)
            .withCreationData(
                new CreationData()
                    .withCreateOption(DiskCreateOption.FROM_IMAGE)
                    .withImageReference(
                        new ImageDiskReference()
                            .withId(
                                "/Subscriptions/{subscriptionId}/Providers/Microsoft.Compute/Locations/uswest/Publishers/Microsoft/ArtifactTypes/VMImage/Offers/{offer}")))
            .withSecurityProfile(new DiskSecurityProfile().withSecurityType(DiskSecurityTypes.TRUSTED_LAUNCH))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/CreateAManagedDiskWithLogicalSectorSize.json
     */
    /**
     * Sample code: Create an ultra managed disk with logicalSectorSize 512E.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAnUltraManagedDiskWithLogicalSectorSize512E(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withSku(new DiskSku().withName(DiskStorageAccountTypes.ULTRA_SSD_LRS))
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.EMPTY).withLogicalSectorSize(512))
            .withDiskSizeGB(200)
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/CreateAManagedDiskFromAPlatformImage.json
     */
    /**
     * Sample code: Create a managed disk from a platform image.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAManagedDiskFromAPlatformImage(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withOsType(OperatingSystemTypes.WINDOWS)
            .withCreationData(
                new CreationData()
                    .withCreateOption(DiskCreateOption.FROM_IMAGE)
                    .withImageReference(
                        new ImageDiskReference()
                            .withId(
                                "/Subscriptions/{subscriptionId}/Providers/Microsoft.Compute/Locations/westus/Publishers/{publisher}/ArtifactTypes/VMImage/Offers/{offer}/Skus/{sku}/Versions/1.0.0")))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/CreateAnEmptyManagedDisk.json
     */
    /**
     * Sample code: Create an empty managed disk.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAnEmptyManagedDisk(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.EMPTY))
            .withDiskSizeGB(200)
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/CreateAManagedDiskByImportingAnUnmanagedBlobFromTheSameSubscription.json
     */
    /**
     * Sample code: Create a managed disk by importing an unmanaged blob from the same subscription.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAManagedDiskByImportingAnUnmanagedBlobFromTheSameSubscription(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(
                new CreationData()
                    .withCreateOption(DiskCreateOption.IMPORT)
                    .withSourceUri("https://mystorageaccount.blob.core.windows.net/osimages/osimage.vhd"))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/CreateAManagedDiskFromUploadPreparedSecure.json
     */
    /**
     * Sample code: Create a managed disk from UploadPreparedSecure create option.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAManagedDiskFromUploadPreparedSecureCreateOption(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withOsType(OperatingSystemTypes.WINDOWS)
            .withCreationData(
                new CreationData()
                    .withCreateOption(DiskCreateOption.UPLOAD_PREPARED_SECURE)
                    .withUploadSizeBytes(10737418752L))
            .withSecurityProfile(new DiskSecurityProfile().withSecurityType(DiskSecurityTypes.TRUSTED_LAUNCH))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/CreateAManagedDiskByCopyingASnapshot.json
     */
    /**
     * Sample code: Create a managed disk by copying a snapshot.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAManagedDiskByCopyingASnapshot(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(
                new CreationData()
                    .withCreateOption(DiskCreateOption.COPY)
                    .withSourceResourceId(
                        "subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/snapshots/mySnapshot"))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/CreateAConfidentialVMDiskEncryptedWithCMK.json
     */
    /**
     * Sample code: Create a confidential VM supported disk encrypted with customer managed key.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAConfidentialVMSupportedDiskEncryptedWithCustomerManagedKey(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withOsType(OperatingSystemTypes.WINDOWS)
            .withCreationData(
                new CreationData()
                    .withCreateOption(DiskCreateOption.FROM_IMAGE)
                    .withImageReference(
                        new ImageDiskReference()
                            .withId(
                                "/Subscriptions/{subscriptionId}/Providers/Microsoft.Compute/Locations/westus/Publishers/{publisher}/ArtifactTypes/VMImage/Offers/{offer}/Skus/{sku}/Versions/1.0.0")))
            .withSecurityProfile(
                new DiskSecurityProfile()
                    .withSecurityType(DiskSecurityTypes.CONFIDENTIAL_VM_DISK_ENCRYPTED_WITH_CUSTOMER_KEY)
                    .withSecureVMDiskEncryptionSetId(
                        "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSets/{diskEncryptionSetName}"))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/CreateAManagedDiskWithSSDZRSAccountType.json
     */
    /**
     * Sample code: Create a managed disk with ssd zrs account type.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAManagedDiskWithSsdZrsAccountType(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withSku(new DiskSku().withName(DiskStorageAccountTypes.PREMIUM_ZRS))
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.EMPTY))
            .withDiskSizeGB(200)
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/CreateAnEmptyManagedDiskInExtendedLocation.json
     */
    /**
     * Sample code: Create an empty managed disk in extended location.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAnEmptyManagedDiskInExtendedLocation(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withExtendedLocation(
                new ExtendedLocation().withName("{edge-zone-id}").withType(ExtendedLocationTypes.EDGE_ZONE))
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.EMPTY))
            .withDiskSizeGB(200)
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/CreateAManagedUploadDisk.json
     */
    /**
     * Sample code: Create a managed upload disk.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAManagedUploadDisk(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(
                new CreationData().withCreateOption(DiskCreateOption.UPLOAD).withUploadSizeBytes(10737418752L))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/CreateAManagedDiskWithDataAccessAuthMode.json
     */
    /**
     * Sample code: Create a managed disk with dataAccessAuthMode.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAManagedDiskWithDataAccessAuthMode(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.EMPTY))
            .withDiskSizeGB(200)
            .withDataAccessAuthMode(DataAccessAuthMode.AZURE_ACTIVE_DIRECTORY)
            .create();
    }
}
```

### Disks_Delete

```java
import com.azure.core.util.Context;

/** Samples for Disks Delete. */
public final class DisksDeleteSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/DeleteAManagedDisk.json
     */
    /**
     * Sample code: Delete a managed disk.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void deleteAManagedDisk(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.disks().delete("myResourceGroup", "myDisk", Context.NONE);
    }
}
```

### Disks_GetByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for Disks GetByResourceGroup. */
public final class DisksGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/GetInformationAboutAManagedDisk.json
     */
    /**
     * Sample code: Get information about a managed disk.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getInformationAboutAManagedDisk(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.disks().getByResourceGroupWithResponse("myResourceGroup", "myManagedDisk", Context.NONE);
    }
}
```

### Disks_GrantAccess

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.models.AccessLevel;
import com.azure.resourcemanager.compute.generated.models.GrantAccessData;

/** Samples for Disks GrantAccess. */
public final class DisksGrantAccessSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/BeginGetAccessManagedDisk.json
     */
    /**
     * Sample code: Get a sas on a managed disk.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getASasOnAManagedDisk(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .disks()
            .grantAccess(
                "myResourceGroup",
                "myDisk",
                new GrantAccessData().withAccess(AccessLevel.READ).withDurationInSeconds(300),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/BeginGetAccessManagedDiskWithVMGuestState.json
     */
    /**
     * Sample code: Get sas on managed disk and VM guest state.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getSasOnManagedDiskAndVMGuestState(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .disks()
            .grantAccess(
                "myResourceGroup",
                "myDisk",
                new GrantAccessData()
                    .withAccess(AccessLevel.READ)
                    .withDurationInSeconds(300)
                    .withGetSecureVMGuestStateSas(true),
                Context.NONE);
    }
}
```

### Disks_List

```java
import com.azure.core.util.Context;

/** Samples for Disks List. */
public final class DisksListSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/ListManagedDisksInASubscription.json
     */
    /**
     * Sample code: List all managed disks in a subscription.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listAllManagedDisksInASubscription(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.disks().list(Context.NONE);
    }
}
```

### Disks_ListByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for Disks ListByResourceGroup. */
public final class DisksListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/ListManagedDisksInAResourceGroup.json
     */
    /**
     * Sample code: List all managed disks in a resource group.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listAllManagedDisksInAResourceGroup(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.disks().listByResourceGroup("myResourceGroup", Context.NONE);
    }
}
```

### Disks_RevokeAccess

```java
import com.azure.core.util.Context;

/** Samples for Disks RevokeAccess. */
public final class DisksRevokeAccessSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/EndGetAccessManagedDisk.json
     */
    /**
     * Sample code: Revoke access to a managed disk.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void revokeAccessToAManagedDisk(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.disks().revokeAccess("myResourceGroup", "myDisk", Context.NONE);
    }
}
```

### Disks_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.models.Architecture;
import com.azure.resourcemanager.compute.generated.models.Disk;
import com.azure.resourcemanager.compute.generated.models.NetworkAccessPolicy;
import com.azure.resourcemanager.compute.generated.models.PurchasePlan;
import com.azure.resourcemanager.compute.generated.models.SupportedCapabilities;

/** Samples for Disks Update. */
public final class DisksUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/UpdateAManagedDiskToAddArchitecture.json
     */
    /**
     * Sample code: Update a managed disk to add architecture.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void updateAManagedDiskToAddArchitecture(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        Disk resource =
            manager.disks().getByResourceGroupWithResponse("myResourceGroup", "myDisk", Context.NONE).getValue();
        resource
            .update()
            .withSupportedCapabilities(new SupportedCapabilities().withArchitecture(Architecture.ARM64))
            .apply();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/UpdateAManagedDiskToDisableBursting.json
     */
    /**
     * Sample code: Update a managed disk to disable bursting.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void updateAManagedDiskToDisableBursting(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        Disk resource =
            manager.disks().getByResourceGroupWithResponse("myResourceGroup", "myDisk", Context.NONE).getValue();
        resource.update().withBurstingEnabled(false).apply();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/UpdateAManagedDiskToAddPurchasePlan.json
     */
    /**
     * Sample code: Update a managed disk to add purchase plan.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void updateAManagedDiskToAddPurchasePlan(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        Disk resource =
            manager.disks().getByResourceGroupWithResponse("myResourceGroup", "myDisk", Context.NONE).getValue();
        resource
            .update()
            .withPurchasePlan(
                new PurchasePlan()
                    .withName("myPurchasePlanName")
                    .withPublisher("myPurchasePlanPublisher")
                    .withProduct("myPurchasePlanProduct")
                    .withPromotionCode("myPurchasePlanPromotionCode"))
            .apply();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/UpdateAManagedDiskToChangeTier.json
     */
    /**
     * Sample code: Update a managed disk to change tier.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void updateAManagedDiskToChangeTier(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        Disk resource =
            manager.disks().getByResourceGroupWithResponse("myResourceGroup", "myDisk", Context.NONE).getValue();
        resource.update().withTier("P30").apply();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/CreateOrUpdateABurstingEnabledManagedDisk.json
     */
    /**
     * Sample code: Create or update a bursting enabled managed disk.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createOrUpdateABurstingEnabledManagedDisk(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        Disk resource =
            manager.disks().getByResourceGroupWithResponse("myResourceGroup", "myDisk", Context.NONE).getValue();
        resource.update().withDiskSizeGB(1024).withBurstingEnabled(true).apply();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/UpdateAManagedDiskToAddSupportsHibernation.json
     */
    /**
     * Sample code: Update a managed disk to add supportsHibernation.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void updateAManagedDiskToAddSupportsHibernation(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        Disk resource =
            manager.disks().getByResourceGroupWithResponse("myResourceGroup", "myDisk", Context.NONE).getValue();
        resource.update().withSupportsHibernation(true).apply();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/UpdateAManagedDiskToRemoveDiskAccess.json
     */
    /**
     * Sample code: Update managed disk to remove disk access resource association.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void updateManagedDiskToRemoveDiskAccessResourceAssociation(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        Disk resource =
            manager.disks().getByResourceGroupWithResponse("myResourceGroup", "myDisk", Context.NONE).getValue();
        resource.update().withNetworkAccessPolicy(NetworkAccessPolicy.ALLOW_ALL).apply();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/UpdateAManagedDiskToAddAcceleratedNetworking.json
     */
    /**
     * Sample code: Update a managed disk to add accelerated networking.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void updateAManagedDiskToAddAcceleratedNetworking(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        Disk resource =
            manager.disks().getByResourceGroupWithResponse("myResourceGroup", "myDisk", Context.NONE).getValue();
        resource.update().withSupportedCapabilities(new SupportedCapabilities().withAcceleratedNetwork(false)).apply();
    }
}
```

### Snapshots_CreateOrUpdate

```java
import com.azure.resourcemanager.compute.generated.models.CreationData;
import com.azure.resourcemanager.compute.generated.models.DiskCreateOption;

/** Samples for Snapshots CreateOrUpdate. */
public final class SnapshotsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/CreateASnapshotFromAnExistingSnapshot.json
     */
    /**
     * Sample code: Create a snapshot from an existing snapshot in the same or a different subscription.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createASnapshotFromAnExistingSnapshotInTheSameOrADifferentSubscription(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .snapshots()
            .define("mySnapshot2")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(
                new CreationData()
                    .withCreateOption(DiskCreateOption.COPY)
                    .withSourceResourceId(
                        "subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/snapshots/mySnapshot1"))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/CreateASnapshotFromAnExistingSnapshotInDifferentRegion.json
     */
    /**
     * Sample code: Create a snapshot from an existing snapshot in the same or a different subscription in a different
     * region.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createASnapshotFromAnExistingSnapshotInTheSameOrADifferentSubscriptionInADifferentRegion(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .snapshots()
            .define("mySnapshot2")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(
                new CreationData()
                    .withCreateOption(DiskCreateOption.COPY_START)
                    .withSourceResourceId(
                        "subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/snapshots/mySnapshot1"))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/CreateASnapshotByImportingAnUnmanagedBlobFromTheSameSubscription.json
     */
    /**
     * Sample code: Create a snapshot by importing an unmanaged blob from the same subscription.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createASnapshotByImportingAnUnmanagedBlobFromTheSameSubscription(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .snapshots()
            .define("mySnapshot1")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(
                new CreationData()
                    .withCreateOption(DiskCreateOption.IMPORT)
                    .withSourceUri("https://mystorageaccount.blob.core.windows.net/osimages/osimage.vhd"))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/CreateASnapshotByImportingAnUnmanagedBlobFromADifferentSubscription.json
     */
    /**
     * Sample code: Create a snapshot by importing an unmanaged blob from a different subscription.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createASnapshotByImportingAnUnmanagedBlobFromADifferentSubscription(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .snapshots()
            .define("mySnapshot1")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(
                new CreationData()
                    .withCreateOption(DiskCreateOption.IMPORT)
                    .withStorageAccountId(
                        "subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Storage/storageAccounts/myStorageAccount")
                    .withSourceUri("https://mystorageaccount.blob.core.windows.net/osimages/osimage.vhd"))
            .create();
    }
}
```

### Snapshots_Delete

```java
import com.azure.core.util.Context;

/** Samples for Snapshots Delete. */
public final class SnapshotsDeleteSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/DeleteASnapshot.json
     */
    /**
     * Sample code: Delete a snapshot.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void deleteASnapshot(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.snapshots().delete("myResourceGroup", "mySnapshot", Context.NONE);
    }
}
```

### Snapshots_GetByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for Snapshots GetByResourceGroup. */
public final class SnapshotsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/GetInformationAboutASnapshot.json
     */
    /**
     * Sample code: Get information about a snapshot.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getInformationAboutASnapshot(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.snapshots().getByResourceGroupWithResponse("myResourceGroup", "mySnapshot", Context.NONE);
    }
}
```

### Snapshots_GrantAccess

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.models.AccessLevel;
import com.azure.resourcemanager.compute.generated.models.GrantAccessData;

/** Samples for Snapshots GrantAccess. */
public final class SnapshotsGrantAccessSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/BeginGetAccessSnapshot.json
     */
    /**
     * Sample code: Get a sas on a snapshot.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getASasOnASnapshot(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .snapshots()
            .grantAccess(
                "myResourceGroup",
                "mySnapshot",
                new GrantAccessData().withAccess(AccessLevel.READ).withDurationInSeconds(300),
                Context.NONE);
    }
}
```

### Snapshots_List

```java
import com.azure.core.util.Context;

/** Samples for Snapshots List. */
public final class SnapshotsListSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/ListSnapshotsInASubscription.json
     */
    /**
     * Sample code: List all snapshots in a subscription.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listAllSnapshotsInASubscription(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.snapshots().list(Context.NONE);
    }
}
```

### Snapshots_ListByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for Snapshots ListByResourceGroup. */
public final class SnapshotsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/ListSnapshotsInAResourceGroup.json
     */
    /**
     * Sample code: List all snapshots in a resource group.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listAllSnapshotsInAResourceGroup(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.snapshots().listByResourceGroup("myResourceGroup", Context.NONE);
    }
}
```

### Snapshots_RevokeAccess

```java
import com.azure.core.util.Context;

/** Samples for Snapshots RevokeAccess. */
public final class SnapshotsRevokeAccessSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/EndGetAccessSnapshot.json
     */
    /**
     * Sample code: Revoke access to a snapshot.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void revokeAccessToASnapshot(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.snapshots().revokeAccess("myResourceGroup", "mySnapshot", Context.NONE);
    }
}
```

### Snapshots_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.models.Snapshot;
import com.azure.resourcemanager.compute.generated.models.SupportedCapabilities;
import java.util.HashMap;
import java.util.Map;

/** Samples for Snapshots Update. */
public final class SnapshotsUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/UpdateASnapshotWithAcceleratedNetwork.json
     */
    /**
     * Sample code: Update a snapshot with accelerated networking.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void updateASnapshotWithAcceleratedNetworking(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        Snapshot resource =
            manager
                .snapshots()
                .getByResourceGroupWithResponse("myResourceGroup", "mySnapshot", Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("department", "Development", "project", "UpdateSnapshots"))
            .withDiskSizeGB(20)
            .withSupportedCapabilities(new SupportedCapabilities().withAcceleratedNetwork(false))
            .apply();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/UpdateASnapshot.json
     */
    /**
     * Sample code: Update a snapshot.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void updateASnapshot(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        Snapshot resource =
            manager
                .snapshots()
                .getByResourceGroupWithResponse("myResourceGroup", "mySnapshot", Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("department", "Development", "project", "UpdateSnapshots"))
            .withDiskSizeGB(20)
            .apply();
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

