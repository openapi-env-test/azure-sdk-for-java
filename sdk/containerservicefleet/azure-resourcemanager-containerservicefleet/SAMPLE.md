# Code snippets and samples


## FleetMembers

- [CreateOrUpdate](#fleetmembers_createorupdate)
- [Delete](#fleetmembers_delete)
- [Get](#fleetmembers_get)
- [ListByFleet](#fleetmembers_listbyfleet)

## Fleets

- [CreateOrUpdate](#fleets_createorupdate)
- [Delete](#fleets_delete)
- [GetByResourceGroup](#fleets_getbyresourcegroup)
- [List](#fleets_list)
- [ListByResourceGroup](#fleets_listbyresourcegroup)
- [ListCredentials](#fleets_listcredentials)
- [Update](#fleets_update)
### FleetMembers_CreateOrUpdate

```java
/** Samples for FleetMembers CreateOrUpdate. */
public final class FleetMembersCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/fleet/preview/2022-09-02-preview/examples/FleetMembers_Create.json
     */
    /**
     * Sample code: Create a fleet member resource. Joins an existing cluster to the fleet.
     *
     * @param manager Entry point to ContainerServiceFleetManager.
     */
    public static void createAFleetMemberResourceJoinsAnExistingClusterToTheFleet(
        com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager manager) {
        manager
            .fleetMembers()
            .define("member-1")
            .withExistingFleet("rg1", "fleet-1")
            .withClusterResourceId(
                "/subscriptions/subid1/resourcegroups/rg1/providers/Microsoft.ContainerService/managedClusters/cluster-1")
            .create();
    }
}
```

### FleetMembers_Delete

```java
/** Samples for FleetMembers Delete. */
public final class FleetMembersDeleteSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/fleet/preview/2022-09-02-preview/examples/FleetMembers_Delete.json
     */
    /**
     * Sample code: Deletes a fleet member resource.
     *
     * @param manager Entry point to ContainerServiceFleetManager.
     */
    public static void deletesAFleetMemberResource(
        com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager manager) {
        manager.fleetMembers().delete("rg1", "fleet-1", "member-1", null, com.azure.core.util.Context.NONE);
    }
}
```

### FleetMembers_Get

```java
/** Samples for FleetMembers Get. */
public final class FleetMembersGetSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/fleet/preview/2022-09-02-preview/examples/FleetMembers_Get.json
     */
    /**
     * Sample code: Gets a fleet member resource.
     *
     * @param manager Entry point to ContainerServiceFleetManager.
     */
    public static void getsAFleetMemberResource(
        com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager manager) {
        manager.fleetMembers().getWithResponse("rg1", "fleet-1", "member-1", com.azure.core.util.Context.NONE);
    }
}
```

### FleetMembers_ListByFleet

```java
/** Samples for FleetMembers ListByFleet. */
public final class FleetMembersListByFleetSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/fleet/preview/2022-09-02-preview/examples/FleetMembers_List.json
     */
    /**
     * Sample code: Lists the members of a fleet.
     *
     * @param manager Entry point to ContainerServiceFleetManager.
     */
    public static void listsTheMembersOfAFleet(
        com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager manager) {
        manager.fleetMembers().listByFleet("rg1", "fleet-1", com.azure.core.util.Context.NONE);
    }
}
```

### Fleets_CreateOrUpdate

```java
import com.azure.resourcemanager.containerservicefleet.models.FleetHubProfile;
import java.util.HashMap;
import java.util.Map;

/** Samples for Fleets CreateOrUpdate. */
public final class FleetsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/fleet/preview/2022-09-02-preview/examples/Fleets_CreateOrUpdate.json
     */
    /**
     * Sample code: Creates or update a fleet resource.
     *
     * @param manager Entry point to ContainerServiceFleetManager.
     */
    public static void createsOrUpdateAFleetResource(
        com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager manager) {
        manager
            .fleets()
            .define("fleet-1")
            .withRegion("East US")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("archv2", "", "tier", "production"))
            .withHubProfile(new FleetHubProfile().withDnsPrefix("dnsprefix1"))
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

### Fleets_Delete

```java
/** Samples for Fleets Delete. */
public final class FleetsDeleteSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/fleet/preview/2022-09-02-preview/examples/Fleets_Delete.json
     */
    /**
     * Sample code: Delete a fleet resource.
     *
     * @param manager Entry point to ContainerServiceFleetManager.
     */
    public static void deleteAFleetResource(
        com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager manager) {
        manager.fleets().delete("rg1", "fleet-1", null, com.azure.core.util.Context.NONE);
    }
}
```

### Fleets_GetByResourceGroup

```java
/** Samples for Fleets GetByResourceGroup. */
public final class FleetsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/fleet/preview/2022-09-02-preview/examples/Fleets_Get.json
     */
    /**
     * Sample code: Gets a fleet resource.
     *
     * @param manager Entry point to ContainerServiceFleetManager.
     */
    public static void getsAFleetResource(
        com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager manager) {
        manager.fleets().getByResourceGroupWithResponse("rg1", "fleet-1", com.azure.core.util.Context.NONE);
    }
}
```

### Fleets_List

```java
/** Samples for Fleets List. */
public final class FleetsListSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/fleet/preview/2022-09-02-preview/examples/Fleets_ListBySub.json
     */
    /**
     * Sample code: List fleet resources in a given subscription.
     *
     * @param manager Entry point to ContainerServiceFleetManager.
     */
    public static void listFleetResourcesInAGivenSubscription(
        com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager manager) {
        manager.fleets().list(com.azure.core.util.Context.NONE);
    }
}
```

### Fleets_ListByResourceGroup

```java
/** Samples for Fleets ListByResourceGroup. */
public final class FleetsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/fleet/preview/2022-09-02-preview/examples/Fleets_ListByResourceGroup.json
     */
    /**
     * Sample code: List fleet resources in a given resource group.
     *
     * @param manager Entry point to ContainerServiceFleetManager.
     */
    public static void listFleetResourcesInAGivenResourceGroup(
        com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager manager) {
        manager.fleets().listByResourceGroup("rg1", com.azure.core.util.Context.NONE);
    }
}
```

### Fleets_ListCredentials

```java
/** Samples for Fleets ListCredentials. */
public final class FleetsListCredentialsSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/fleet/preview/2022-09-02-preview/examples/Fleets_ListCredentialsResult.json
     */
    /**
     * Sample code: List Fleet Credentials.
     *
     * @param manager Entry point to ContainerServiceFleetManager.
     */
    public static void listFleetCredentials(
        com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager manager) {
        manager.fleets().listCredentialsWithResponse("rg1", "fleet", com.azure.core.util.Context.NONE);
    }
}
```

### Fleets_Update

```java
import com.azure.resourcemanager.containerservicefleet.models.Fleet;
import java.util.HashMap;
import java.util.Map;

/** Samples for Fleets Update. */
public final class FleetsUpdateSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/fleet/preview/2022-09-02-preview/examples/Fleets_PatchTags.json
     */
    /**
     * Sample code: Patches a fleet resource.
     *
     * @param manager Entry point to ContainerServiceFleetManager.
     */
    public static void patchesAFleetResource(
        com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager manager) {
        Fleet resource =
            manager
                .fleets()
                .getByResourceGroupWithResponse("rg1", "fleet-1", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("env", "prod", "tier", "secure")).withIfMatch("dfjkwelr7384").apply();
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

