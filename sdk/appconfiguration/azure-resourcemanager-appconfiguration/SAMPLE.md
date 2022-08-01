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
### ConfigurationStores_Create

```java
import java.util.HashMap;
import java.util.Map;

/** Samples for ConfigurationStores Create. */
public final class ConfigurationStoresCreateSamples {
    /*
     * x-ms-original-file: specification/appconfiguration/resource-manager/Microsoft.AppConfiguration/preview/2022-01-11/examples/ConfigurationStoresCreate.json
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
            .define("fayeh")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withTags(mapOf("myTag", "myTagValue"))
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
     * x-ms-original-file: specification/appconfiguration/resource-manager/Microsoft.AppConfiguration/preview/2022-01-11/examples/ConfigurationStoresDelete.json
     */
    /**
     * Sample code: ConfigurationStores_Delete.
     *
     * @param manager Entry point to AppConfigurationManager.
     */
    public static void configurationStoresDelete(
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager manager) {
        manager.configurationStores().delete("myResourceGroup", "fayeh", Context.NONE);
    }
}
```

### ConfigurationStores_GetByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for ConfigurationStores GetByResourceGroup. */
public final class ConfigurationStoresGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/appconfiguration/resource-manager/Microsoft.AppConfiguration/preview/2022-01-11/examples/ConfigurationStoresGet.json
     */
    /**
     * Sample code: ConfigurationStores_Get.
     *
     * @param manager Entry point to AppConfigurationManager.
     */
    public static void configurationStoresGet(
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager manager) {
        manager.configurationStores().getByResourceGroupWithResponse("myResourceGroup", "fayeh", Context.NONE);
    }
}
```

### ConfigurationStores_List

```java
import com.azure.core.util.Context;

/** Samples for ConfigurationStores List. */
public final class ConfigurationStoresListSamples {
    /*
     * x-ms-original-file: specification/appconfiguration/resource-manager/Microsoft.AppConfiguration/preview/2022-01-11/examples/ConfigurationStoresList.json
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
     * x-ms-original-file: specification/appconfiguration/resource-manager/Microsoft.AppConfiguration/preview/2022-01-11/examples/ConfigurationStoresListByResourceGroup.json
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
     * x-ms-original-file: specification/appconfiguration/resource-manager/Microsoft.AppConfiguration/preview/2022-01-11/examples/ConfigurationStoresListKeyValue.json
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
     * x-ms-original-file: specification/appconfiguration/resource-manager/Microsoft.AppConfiguration/preview/2022-01-11/examples/ConfigurationStoresListKeys.json
     */
    /**
     * Sample code: ConfigurationStores_ListKeys.
     *
     * @param manager Entry point to AppConfigurationManager.
     */
    public static void configurationStoresListKeys(
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager manager) {
        manager.configurationStores().listKeys("myResourceGroup", "fayeh", null, Context.NONE);
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
     * x-ms-original-file: specification/appconfiguration/resource-manager/Microsoft.AppConfiguration/preview/2022-01-11/examples/ConfigurationStoresRegenerateKey.json
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
                "myResourceGroup", "fayeh", new RegenerateKeyParameters().withId("439AD01B4BE67DB1"), Context.NONE);
    }
}
```

### ConfigurationStores_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.appconfiguration.models.ConfigurationStore;
import java.util.HashMap;
import java.util.Map;

/** Samples for ConfigurationStores Update. */
public final class ConfigurationStoresUpdateSamples {
    /*
     * x-ms-original-file: specification/appconfiguration/resource-manager/Microsoft.AppConfiguration/preview/2022-01-11/examples/ConfigurationStoresUpdate.json
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
                .getByResourceGroupWithResponse("myResourceGroup", "fayeh", Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("Category", "Marketing")).apply();
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
     * x-ms-original-file: specification/appconfiguration/resource-manager/Microsoft.AppConfiguration/preview/2022-01-11/examples/CheckNameAvailable.json
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
                    .withName("fayeh")
                    .withType(ConfigurationResourceType.MICROSOFT_APP_CONFIGURATION_CONFIGURATION_STORES),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/appconfiguration/resource-manager/Microsoft.AppConfiguration/preview/2022-01-11/examples/CheckNameNotAvailable.json
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
                    .withName("fayeh")
                    .withType(ConfigurationResourceType.MICROSOFT_APP_CONFIGURATION_CONFIGURATION_STORES),
                Context.NONE);
    }
}
```

