// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vi.generated;

import com.azure.resourcemanager.vi.models.ManagedServiceIdentity;
import com.azure.resourcemanager.vi.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.vi.models.MediaServicesForPutRequest;
import com.azure.resourcemanager.vi.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;

/** Samples for Accounts CreateOrUpdate. */
public final class AccountsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2022-08-01/examples/ViAccountPut/ViAccountPut10.json
     */
    /**
     * Sample code: Put example #10.
     *
     * @param manager Entry point to ViManager.
     */
    public static void putExample10(com.azure.resourcemanager.vi.ViManager manager) {
        manager
            .accounts()
            .define("contosto-videoanalyzer")
            .withRegion("NorthEurope")
            .withExistingResourceGroup("contosto-videoanalyzer-rg")
            .withIdentity(
                new ManagedServiceIdentity()
                    .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(mapOf()))
            .withMediaServices(
                new MediaServicesForPutRequest()
                    .withResourceId(
                        "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.Media/mediaservices/contoso-videoanalyzer-ms")
                    .withUserAssignedIdentity(
                        "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi"))
            .create();
    }

    /*
     * x-ms-original-file: specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2022-08-01/examples/ViAccountPut/ViAccountPut8.json
     */
    /**
     * Sample code: Put example #8.
     *
     * @param manager Entry point to ViManager.
     */
    public static void putExample8(com.azure.resourcemanager.vi.ViManager manager) {
        manager
            .accounts()
            .define("contosto-videoanalyzer")
            .withRegion("NorthEurope")
            .withExistingResourceGroup("contosto-videoanalyzer-rg")
            .withIdentity(
                new ManagedServiceIdentity()
                    .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(
                        mapOf(
                            "subscriptions/24237b72-8546-4da5-b204-8c3cb76dd930/resourceGroups/uratzmon-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/talshoham",
                            new UserAssignedIdentity())))
            .withMediaServices(
                new MediaServicesForPutRequest()
                    .withResourceId(
                        "/subscriptions/24237b72-8546-4da5-b204-8c3cb76dd930/resourceGroups/uratzmon-rg/providers/Microsoft.Media/mediaservices/talshoham"))
            .create();
    }

    /*
     * x-ms-original-file: specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2022-08-01/examples/ViAccountPut/ViAccountPut9.json
     */
    /**
     * Sample code: Put example #9.
     *
     * @param manager Entry point to ViManager.
     */
    public static void putExample9(com.azure.resourcemanager.vi.ViManager manager) {
        manager
            .accounts()
            .define("contosto-videoanalyzer")
            .withRegion((String) null)
            .withExistingResourceGroup("contosto-videoanalyzer-rg")
            .create();
    }

    /*
     * x-ms-original-file: specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2022-08-01/examples/ViAccountPut/ViAccountPut4.json
     */
    /**
     * Sample code: Put example #4.
     *
     * @param manager Entry point to ViManager.
     */
    public static void putExample4(com.azure.resourcemanager.vi.ViManager manager) {
        manager
            .accounts()
            .define("contosto-videoanalyzer")
            .withRegion("NorthEurope")
            .withExistingResourceGroup("contosto-videoanalyzer-rg")
            .withIdentity(
                new ManagedServiceIdentity()
                    .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(
                        mapOf(
                            "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi",
                            new UserAssignedIdentity())))
            .withMediaServices(
                new MediaServicesForPutRequest()
                    .withResourceId(
                        "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.Media/mediaservices/contoso-videoanalyzer-ms")
                    .withUserAssignedIdentity(
                        "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi"))
            .create();
    }

    /*
     * x-ms-original-file: specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2022-08-01/examples/ViAccountPut/ViAccountPut5.json
     */
    /**
     * Sample code: Put example #5.
     *
     * @param manager Entry point to ViManager.
     */
    public static void putExample5(com.azure.resourcemanager.vi.ViManager manager) {
        manager
            .accounts()
            .define("contosto-videoanalyzer")
            .withRegion("NorthEurope")
            .withExistingResourceGroup("contosto-videoanalyzer-rg")
            .withIdentity(
                new ManagedServiceIdentity()
                    .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(
                        mapOf(
                            "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi",
                            new UserAssignedIdentity())))
            .withMediaServices(
                new MediaServicesForPutRequest()
                    .withResourceId(
                        "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.Media/mediaservices/contoso-videoanalyzer-ms")
                    .withUserAssignedIdentity(
                        "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi"))
            .create();
    }

    /*
     * x-ms-original-file: specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2022-08-01/examples/ViAccountPut/ViAccountPut6.json
     */
    /**
     * Sample code: Put example #6.
     *
     * @param manager Entry point to ViManager.
     */
    public static void putExample6(com.azure.resourcemanager.vi.ViManager manager) {
        manager
            .accounts()
            .define("contosto-videoanalyzer")
            .withRegion("NorthEurope")
            .withExistingResourceGroup("contosto-videoanalyzer-rg")
            .withIdentity(
                new ManagedServiceIdentity()
                    .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(
                        mapOf(
                            "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi",
                            new UserAssignedIdentity())))
            .withMediaServices(
                new MediaServicesForPutRequest()
                    .withResourceId(
                        "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.Media/mediaservices/contoso-videoanalyzer-ms")
                    .withUserAssignedIdentity(
                        "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi"))
            .create();
    }

    /*
     * x-ms-original-file: specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2022-08-01/examples/ViAccountPut/ViAccountPut7.json
     */
    /**
     * Sample code: Put example #7.
     *
     * @param manager Entry point to ViManager.
     */
    public static void putExample7(com.azure.resourcemanager.vi.ViManager manager) {
        manager
            .accounts()
            .define("contosto-videoanalyzer")
            .withRegion("NorthEurope")
            .withExistingResourceGroup("contosto-videoanalyzer-rg")
            .withIdentity(
                new ManagedServiceIdentity()
                    .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(
                        mapOf(
                            "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi",
                            new UserAssignedIdentity())))
            .withMediaServices(
                new MediaServicesForPutRequest()
                    .withResourceId(
                        "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.Media/mediaservices/contoso-videoanalyzer-ms")
                    .withUserAssignedIdentity(
                        "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi"))
            .create();
    }

    /*
     * x-ms-original-file: specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2022-08-01/examples/ViAccountPut/ViAccountPut1.json
     */
    /**
     * Sample code: Put example #1.
     *
     * @param manager Entry point to ViManager.
     */
    public static void putExample1(com.azure.resourcemanager.vi.ViManager manager) {
        manager
            .accounts()
            .define("contosto-videoanalyzer")
            .withRegion("NorthEurope")
            .withExistingResourceGroup("contosto-videoanalyzer-rg")
            .withIdentity(
                new ManagedServiceIdentity()
                    .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(
                        mapOf(
                            "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi",
                            new UserAssignedIdentity())))
            .withMediaServices(
                new MediaServicesForPutRequest()
                    .withResourceId(
                        "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.Media/mediaservices/contoso-videoanalyzer-ms")
                    .withUserAssignedIdentity(
                        "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi"))
            .create();
    }

    /*
     * x-ms-original-file: specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2022-08-01/examples/ViAccountPut/ViAccountPut2.json
     */
    /**
     * Sample code: Put example #2.
     *
     * @param manager Entry point to ViManager.
     */
    public static void putExample2(com.azure.resourcemanager.vi.ViManager manager) {
        manager
            .accounts()
            .define("contosto-videoanalyzer")
            .withRegion("NorthEurope")
            .withExistingResourceGroup("contosto-videoanalyzer-rg")
            .withIdentity(
                new ManagedServiceIdentity()
                    .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(
                        mapOf(
                            "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi",
                            new UserAssignedIdentity())))
            .withMediaServices(
                new MediaServicesForPutRequest()
                    .withResourceId(
                        "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.Media/mediaservices/contoso-videoanalyzer-ms")
                    .withUserAssignedIdentity(
                        "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi"))
            .create();
    }

    /*
     * x-ms-original-file: specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2022-08-01/examples/ViAccountPut/ViAccountPut3.json
     */
    /**
     * Sample code: Put example #3.
     *
     * @param manager Entry point to ViManager.
     */
    public static void putExample3(com.azure.resourcemanager.vi.ViManager manager) {
        manager
            .accounts()
            .define("contosto-videoanalyzer")
            .withRegion("NorthEurope")
            .withExistingResourceGroup("contosto-videoanalyzer-rg")
            .withIdentity(
                new ManagedServiceIdentity()
                    .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(
                        mapOf(
                            "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi",
                            new UserAssignedIdentity())))
            .withMediaServices(
                new MediaServicesForPutRequest()
                    .withResourceId(
                        "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.Media/mediaservices/contoso-videoanalyzer-ms")
                    .withUserAssignedIdentity(
                        "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi"))
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
