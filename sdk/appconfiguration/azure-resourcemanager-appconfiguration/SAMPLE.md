# Code snippets and samples


## ConfigurationStores

- [Create](#configurationstores_create)
- [Delete](#configurationstores_delete)
- [GetByResourceGroup](#configurationstores_getbyresourcegroup)
- [List](#configurationstores_list)
- [ListByResourceGroup](#configurationstores_listbyresourcegroup)
- [ListKeyValue](#configurationstores_listkeyvalue)
- [ListKeys](#configurationstores_listkeys)
- [RegenerateKey](#configurationstores_regeneratekey)
- [Update](#configurationstores_update)

## Operations

- [CheckNameAvailability](#operations_checknameavailability)

## PrivateEndpointConnections

- [CreateOrUpdate](#privateendpointconnections_createorupdate)
- [Delete](#privateendpointconnections_delete)
- [Get](#privateendpointconnections_get)
- [ListByConfigurationStore](#privateendpointconnections_listbyconfigurationstore)

## PrivateLinkResources

- [Get](#privatelinkresources_get)
- [ListByConfigurationStore](#privatelinkresources_listbyconfigurationstore)
### ConfigurationStores_Create

```java
import com.azure.resourcemanager.appconfiguration.models.IdentityType;
import com.azure.resourcemanager.appconfiguration.models.ResourceIdentity;
import com.azure.resourcemanager.appconfiguration.models.Sku;
import com.azure.resourcemanager.appconfiguration.models.UserIdentity;
import java.util.HashMap;
import java.util.Map;

/** Samples for ConfigurationStores Create. */
public final class ConfigurationStoresCreateSamples {
    /*
     * x-ms-original-file: specification/appconfiguration/resource-manager/Microsoft.AppConfiguration/stable/2011-01-01/examples/ConfigurationStoresCreate.json
     */
    /**
     * Sample code: ConfigurationStores_Create.
     *
     * @param manager Entry point to AppConfigurationManager.
     */
    public static void configurationStoresCreate(
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager manager) {
        manager
            .configurationStores()
            .define("contoso")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withSku(new Sku().withName("Standard"))
            .withTags(mapOf("myTag", "myTagValue"))
            .create();
    }

    /*
     * x-ms-original-file: specification/appconfiguration/resource-manager/Microsoft.AppConfiguration/stable/2011-01-01/examples/ConfigurationStoresCreateWithIdentity.json
     */
    /**
     * Sample code: ConfigurationStores_Create_WithIdentity.
     *
     * @param manager Entry point to AppConfigurationManager.
     */
    public static void configurationStoresCreateWithIdentity(
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager manager) {
        manager
            .configurationStores()
            .define("contoso")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withSku(new Sku().withName("Standard"))
            .withTags(mapOf("myTag", "myTagValue"))
            .withIdentity(
                new ResourceIdentity()
                    .withType(IdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                    .withUserAssignedIdentities(
                        mapOf(
                            "/subscriptions/c80fb759-c965-4c6a-9110-9b2b2d038882/resourcegroups/myResourceGroup1/providers/Microsoft.ManagedIdentity/userAssignedIdentities/identity2",
                            new UserIdentity())))
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

### ConfigurationStores_Delete

```java
import com.azure.core.util.Context;

/** Samples for ConfigurationStores Delete. */
public final class ConfigurationStoresDeleteSamples {
    /*
     * x-ms-original-file: specification/appconfiguration/resource-manager/Microsoft.AppConfiguration/stable/2011-01-01/examples/ConfigurationStoresDelete.json
     */
    /**
     * Sample code: ConfigurationStores_Delete.
     *
     * @param manager Entry point to AppConfigurationManager.
     */
    public static void configurationStoresDelete(
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager manager) {
        manager.configurationStores().delete("myResourceGroup", "contoso", Context.NONE);
    }
}
```

### ConfigurationStores_GetByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for ConfigurationStores GetByResourceGroup. */
public final class ConfigurationStoresGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/appconfiguration/resource-manager/Microsoft.AppConfiguration/stable/2011-01-01/examples/ConfigurationStoresGet.json
     */
    /**
     * Sample code: ConfigurationStores_Get.
     *
     * @param manager Entry point to AppConfigurationManager.
     */
    public static void configurationStoresGet(
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager manager) {
        manager.configurationStores().getByResourceGroupWithResponse("myResourceGroup", "contoso", Context.NONE);
    }
}
```

### ConfigurationStores_List

```java
import com.azure.core.util.Context;

/** Samples for ConfigurationStores List. */
public final class ConfigurationStoresListSamples {
    /*
     * x-ms-original-file: specification/appconfiguration/resource-manager/Microsoft.AppConfiguration/stable/2011-01-01/examples/ConfigurationStoresList.json
     */
    /**
     * Sample code: ConfigurationStores_List.
     *
     * @param manager Entry point to AppConfigurationManager.
     */
    public static void configurationStoresList(
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager manager) {
        manager.configurationStores().list(null, Context.NONE);
    }
}
```

### ConfigurationStores_ListByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for ConfigurationStores ListByResourceGroup. */
public final class ConfigurationStoresListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/appconfiguration/resource-manager/Microsoft.AppConfiguration/stable/2011-01-01/examples/ConfigurationStoresListByResourceGroup.json
     */
    /**
     * Sample code: ConfigurationStores_ListByResourceGroup.
     *
     * @param manager Entry point to AppConfigurationManager.
     */
    public static void configurationStoresListByResourceGroup(
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager manager) {
        manager.configurationStores().listByResourceGroup("myResourceGroup", null, Context.NONE);
    }
}
```

### ConfigurationStores_ListKeyValue

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.appconfiguration.models.ListKeyValueParameters;

/** Samples for ConfigurationStores ListKeyValue. */
public final class ConfigurationStoresListKeyValueSamples {
    /*
     * x-ms-original-file: specification/appconfiguration/resource-manager/Microsoft.AppConfiguration/stable/2011-01-01/examples/ConfigurationStoresListKeyValue.json
     */
    /**
     * Sample code: ConfigurationStores_ListKeyValue.
     *
     * @param manager Entry point to AppConfigurationManager.
     */
    public static void configurationStoresListKeyValue(
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager manager) {
        manager
            .configurationStores()
            .listKeyValueWithResponse(
                "myResourceGroup",
                "fayeh",
                new ListKeyValueParameters().withKey("MaxRequests").withLabel("dev"),
                Context.NONE);
    }
}
```

### ConfigurationStores_ListKeys

```java
import com.azure.core.util.Context;

/** Samples for ConfigurationStores ListKeys. */
public final class ConfigurationStoresListKeysSamples {
    /*
     * x-ms-original-file: specification/appconfiguration/resource-manager/Microsoft.AppConfiguration/stable/2011-01-01/examples/ConfigurationStoresListKeys.json
     */
    /**
     * Sample code: ConfigurationStores_ListKeys.
     *
     * @param manager Entry point to AppConfigurationManager.
     */
    public static void configurationStoresListKeys(
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager manager) {
        manager.configurationStores().listKeys("myResourceGroup", "contoso", null, Context.NONE);
    }
}
```

### ConfigurationStores_RegenerateKey

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.appconfiguration.models.RegenerateKeyParameters;

/** Samples for ConfigurationStores RegenerateKey. */
public final class ConfigurationStoresRegenerateKeySamples {
    /*
     * x-ms-original-file: specification/appconfiguration/resource-manager/Microsoft.AppConfiguration/stable/2011-01-01/examples/ConfigurationStoresRegenerateKey.json
     */
    /**
     * Sample code: ConfigurationStores_RegenerateKey.
     *
     * @param manager Entry point to AppConfigurationManager.
     */
    public static void configurationStoresRegenerateKey(
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager manager) {
        manager
            .configurationStores()
            .regenerateKeyWithResponse(
                "myResourceGroup", "contoso", new RegenerateKeyParameters().withId("439AD01B4BE67DB1"), Context.NONE);
    }
}
```

### ConfigurationStores_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.appconfiguration.models.ConfigurationStore;
import com.azure.resourcemanager.appconfiguration.models.IdentityType;
import com.azure.resourcemanager.appconfiguration.models.ResourceIdentity;
import com.azure.resourcemanager.appconfiguration.models.Sku;
import com.azure.resourcemanager.appconfiguration.models.UserIdentity;
import java.util.HashMap;
import java.util.Map;

/** Samples for ConfigurationStores Update. */
public final class ConfigurationStoresUpdateSamples {
    /*
     * x-ms-original-file: specification/appconfiguration/resource-manager/Microsoft.AppConfiguration/stable/2011-01-01/examples/ConfigurationStoresUpdate.json
     */
    /**
     * Sample code: ConfigurationStores_Update.
     *
     * @param manager Entry point to AppConfigurationManager.
     */
    public static void configurationStoresUpdate(
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager manager) {
        ConfigurationStore resource =
            manager
                .configurationStores()
                .getByResourceGroupWithResponse("myResourceGroup", "contoso", Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("Category", "Marketing")).withSku(new Sku().withName("Standard")).apply();
    }

    /*
     * x-ms-original-file: specification/appconfiguration/resource-manager/Microsoft.AppConfiguration/stable/2011-01-01/examples/ConfigurationStoresUpdateWithIdentity.json
     */
    /**
     * Sample code: ConfigurationStores_Update_WithIdentity.
     *
     * @param manager Entry point to AppConfigurationManager.
     */
    public static void configurationStoresUpdateWithIdentity(
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager manager) {
        ConfigurationStore resource =
            manager
                .configurationStores()
                .getByResourceGroupWithResponse("myResourceGroup", "contoso", Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("Category", "Marketing"))
            .withIdentity(
                new ResourceIdentity()
                    .withType(IdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                    .withUserAssignedIdentities(
                        mapOf(
                            "/subscriptions/c80fb759-c965-4c6a-9110-9b2b2d038882/resourcegroups/myResourceGroup1/providers/Microsoft.ManagedIdentity/userAssignedIdentities/identity2",
                            new UserIdentity())))
            .withSku(new Sku().withName("Standard"))
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

### Operations_CheckNameAvailability

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.appconfiguration.models.CheckNameAvailabilityParameters;
import com.azure.resourcemanager.appconfiguration.models.ConfigurationResourceType;

/** Samples for Operations CheckNameAvailability. */
public final class OperationsCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/appconfiguration/resource-manager/Microsoft.AppConfiguration/stable/2011-01-01/examples/CheckNameAvailable.json
     */
    /**
     * Sample code: ConfigurationStores_CheckNameAvailable.
     *
     * @param manager Entry point to AppConfigurationManager.
     */
    public static void configurationStoresCheckNameAvailable(
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager manager) {
        manager
            .operations()
            .checkNameAvailabilityWithResponse(
                new CheckNameAvailabilityParameters()
                    .withName("contoso")
                    .withType(ConfigurationResourceType.MICROSOFT_APP_CONFIGURATION_CONFIGURATION_STORES),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/appconfiguration/resource-manager/Microsoft.AppConfiguration/stable/2011-01-01/examples/CheckNameNotAvailable.json
     */
    /**
     * Sample code: ConfigurationStores_CheckNameNotAvailable.
     *
     * @param manager Entry point to AppConfigurationManager.
     */
    public static void configurationStoresCheckNameNotAvailable(
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager manager) {
        manager
            .operations()
            .checkNameAvailabilityWithResponse(
                new CheckNameAvailabilityParameters()
                    .withName("contoso")
                    .withType(ConfigurationResourceType.MICROSOFT_APP_CONFIGURATION_CONFIGURATION_STORES),
                Context.NONE);
    }
}
```

### PrivateEndpointConnections_CreateOrUpdate

```java
import com.azure.resourcemanager.appconfiguration.models.ConnectionStatus;
import com.azure.resourcemanager.appconfiguration.models.PrivateLinkServiceConnectionState;

/** Samples for PrivateEndpointConnections CreateOrUpdate. */
public final class PrivateEndpointConnectionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/appconfiguration/resource-manager/Microsoft.AppConfiguration/stable/2011-01-01/examples/ConfigurationStoresCreatePrivateEndpointConnection.json
     */
    /**
     * Sample code: PrivateEndpointConnection_CreateOrUpdate.
     *
     * @param manager Entry point to AppConfigurationManager.
     */
    public static void privateEndpointConnectionCreateOrUpdate(
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager manager) {
        manager
            .privateEndpointConnections()
            .define("myConnection")
            .withExistingConfigurationStore("myResourceGroup", "contoso")
            .withPrivateLinkServiceConnectionState(
                new PrivateLinkServiceConnectionState()
                    .withStatus(ConnectionStatus.APPROVED)
                    .withDescription("Auto-Approved"))
            .create();
    }
}
```

### PrivateEndpointConnections_Delete

```java
import com.azure.core.util.Context;

/** Samples for PrivateEndpointConnections Delete. */
public final class PrivateEndpointConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/appconfiguration/resource-manager/Microsoft.AppConfiguration/stable/2011-01-01/examples/ConfigurationStoresDeletePrivateEndpointConnection.json
     */
    /**
     * Sample code: PrivateEndpointConnections_Delete.
     *
     * @param manager Entry point to AppConfigurationManager.
     */
    public static void privateEndpointConnectionsDelete(
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager manager) {
        manager.privateEndpointConnections().delete("myResourceGroup", "contoso", "myConnection", Context.NONE);
    }
}
```

### PrivateEndpointConnections_Get

```java
import com.azure.core.util.Context;

/** Samples for PrivateEndpointConnections Get. */
public final class PrivateEndpointConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/appconfiguration/resource-manager/Microsoft.AppConfiguration/stable/2011-01-01/examples/ConfigurationStoresGetPrivateEndpointConnection.json
     */
    /**
     * Sample code: PrivateEndpointConnection_GetConnection.
     *
     * @param manager Entry point to AppConfigurationManager.
     */
    public static void privateEndpointConnectionGetConnection(
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager manager) {
        manager
            .privateEndpointConnections()
            .getWithResponse("myResourceGroup", "contoso", "myConnection", Context.NONE);
    }
}
```

### PrivateEndpointConnections_ListByConfigurationStore

```java
import com.azure.core.util.Context;

/** Samples for PrivateEndpointConnections ListByConfigurationStore. */
public final class PrivateEndpointConnectionsListByConfigurationStoreSamples {
    /*
     * x-ms-original-file: specification/appconfiguration/resource-manager/Microsoft.AppConfiguration/stable/2011-01-01/examples/ConfigurationStoresListPrivateEndpointConnections.json
     */
    /**
     * Sample code: PrivateEndpointConnection_List.
     *
     * @param manager Entry point to AppConfigurationManager.
     */
    public static void privateEndpointConnectionList(
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager manager) {
        manager.privateEndpointConnections().listByConfigurationStore("myResourceGroup", "contoso", Context.NONE);
    }
}
```

### PrivateLinkResources_Get

```java
import com.azure.core.util.Context;

/** Samples for PrivateLinkResources Get. */
public final class PrivateLinkResourcesGetSamples {
    /*
     * x-ms-original-file: specification/appconfiguration/resource-manager/Microsoft.AppConfiguration/stable/2011-01-01/examples/PrivateLinkResourceGet.json
     */
    /**
     * Sample code: PrivateLinkResources_Get.
     *
     * @param manager Entry point to AppConfigurationManager.
     */
    public static void privateLinkResourcesGet(
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager manager) {
        manager
            .privateLinkResources()
            .getWithResponse("myResourceGroup", "contoso", "configurationStores", Context.NONE);
    }
}
```

### PrivateLinkResources_ListByConfigurationStore

```java
import com.azure.core.util.Context;

/** Samples for PrivateLinkResources ListByConfigurationStore. */
public final class PrivateLinkResourcesListByConfigurationStoreSamples {
    /*
     * x-ms-original-file: specification/appconfiguration/resource-manager/Microsoft.AppConfiguration/stable/2011-01-01/examples/PrivateLinkResourcesListByConfigurationStore.json
     */
    /**
     * Sample code: PrivateLinkResources_ListGroupIds.
     *
     * @param manager Entry point to AppConfigurationManager.
     */
    public static void privateLinkResourcesListGroupIds(
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager manager) {
        manager.privateLinkResources().listByConfigurationStore("myResourceGroup", "contoso", Context.NONE);
    }
}
```

