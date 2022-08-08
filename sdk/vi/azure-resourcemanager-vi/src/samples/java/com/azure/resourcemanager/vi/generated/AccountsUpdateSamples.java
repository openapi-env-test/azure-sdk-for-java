// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vi.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.vi.models.Account;
import com.azure.resourcemanager.vi.models.ManagedServiceIdentity;
import com.azure.resourcemanager.vi.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.vi.models.MediaServicesForPatchRequest;
import com.azure.resourcemanager.vi.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;

/** Samples for Accounts Update. */
public final class AccountsUpdateSamples {
    /*
     * x-ms-original-file: specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2022-08-01/examples/ViAccountPatch/ViAccountPatch3.json
     */
    /**
     * Sample code: Patch example #3.
     *
     * @param manager Entry point to ViManager.
     */
    public static void patchExample3(com.azure.resourcemanager.vi.ViManager manager) {
        Account resource =
            manager
                .accounts()
                .getByResourceGroupWithResponse("contosto-videoanalyzer-rg", "contosto-videoanalyzer", Context.NONE)
                .getValue();
        resource
            .update()
            .withIdentity(
                new ManagedServiceIdentity()
                    .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(
                        mapOf(
                            "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi",
                            new UserAssignedIdentity())))
            .withMediaServices(
                new MediaServicesForPatchRequest()
                    .withUserAssignedIdentity(
                        "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi"))
            .apply();
    }

    /*
     * x-ms-original-file: specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2022-08-01/examples/ViAccountPatch/ViAccountPatch4.json
     */
    /**
     * Sample code: Patch example #4.
     *
     * @param manager Entry point to ViManager.
     */
    public static void patchExample4(com.azure.resourcemanager.vi.ViManager manager) {
        Account resource =
            manager
                .accounts()
                .getByResourceGroupWithResponse("contosto-videoanalyzer-rg", "contosto-videoanalyzer", Context.NONE)
                .getValue();
        resource
            .update()
            .withIdentity(
                new ManagedServiceIdentity()
                    .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(
                        mapOf(
                            "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi",
                            new UserAssignedIdentity())))
            .withMediaServices(
                new MediaServicesForPatchRequest()
                    .withUserAssignedIdentity(
                        "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi"))
            .apply();
    }

    /*
     * x-ms-original-file: specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2022-08-01/examples/ViAccountPatch/ViAccountPatch1.json
     */
    /**
     * Sample code: Patch example #1.
     *
     * @param manager Entry point to ViManager.
     */
    public static void patchExample1(com.azure.resourcemanager.vi.ViManager manager) {
        Account resource =
            manager
                .accounts()
                .getByResourceGroupWithResponse("contosto-videoanalyzer-rg", "contosto-videoanalyzer", Context.NONE)
                .getValue();
        resource
            .update()
            .withIdentity(
                new ManagedServiceIdentity()
                    .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(
                        mapOf(
                            "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi",
                            new UserAssignedIdentity())))
            .withMediaServices(
                new MediaServicesForPatchRequest()
                    .withUserAssignedIdentity(
                        "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi"))
            .apply();
    }

    /*
     * x-ms-original-file: specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2022-08-01/examples/ViAccountPatch/ViAccountPatch2.json
     */
    /**
     * Sample code: Patch example #2.
     *
     * @param manager Entry point to ViManager.
     */
    public static void patchExample2(com.azure.resourcemanager.vi.ViManager manager) {
        Account resource =
            manager
                .accounts()
                .getByResourceGroupWithResponse("contosto-videoanalyzer-rg", "contosto-videoanalyzer", Context.NONE)
                .getValue();
        resource
            .update()
            .withIdentity(
                new ManagedServiceIdentity()
                    .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(
                        mapOf(
                            "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi",
                            new UserAssignedIdentity())))
            .withMediaServices(
                new MediaServicesForPatchRequest()
                    .withUserAssignedIdentity(
                        "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi"))
            .apply();
    }

    /*
     * x-ms-original-file: specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2022-08-01/examples/ViAccountPatch/ViAccountPatch7.json
     */
    /**
     * Sample code: Patch example #7.
     *
     * @param manager Entry point to ViManager.
     */
    public static void patchExample7(com.azure.resourcemanager.vi.ViManager manager) {
        Account resource =
            manager
                .accounts()
                .getByResourceGroupWithResponse("contosto-videoanalyzer-rg", "contosto-videoanalyzer", Context.NONE)
                .getValue();
        resource
            .update()
            .withIdentity(
                new ManagedServiceIdentity()
                    .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(
                        mapOf(
                            "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi",
                            new UserAssignedIdentity())))
            .apply();
    }

    /*
     * x-ms-original-file: specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2022-08-01/examples/ViAccountPatch/ViAccountPatch8.json
     */
    /**
     * Sample code: Patch example #8.
     *
     * @param manager Entry point to ViManager.
     */
    public static void patchExample8(com.azure.resourcemanager.vi.ViManager manager) {
        Account resource =
            manager
                .accounts()
                .getByResourceGroupWithResponse("contosto-videoanalyzer-rg", "contosto-videoanalyzer", Context.NONE)
                .getValue();
        resource
            .update()
            .withIdentity(
                new ManagedServiceIdentity()
                    .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(mapOf()))
            .withMediaServices(
                new MediaServicesForPatchRequest()
                    .withUserAssignedIdentity(
                        "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi"))
            .apply();
    }

    /*
     * x-ms-original-file: specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2022-08-01/examples/ViAccountPatch/ViAccountPatch5.json
     */
    /**
     * Sample code: Patch example #5.
     *
     * @param manager Entry point to ViManager.
     */
    public static void patchExample5(com.azure.resourcemanager.vi.ViManager manager) {
        Account resource =
            manager
                .accounts()
                .getByResourceGroupWithResponse("contosto-videoanalyzer-rg", "contosto-videoanalyzer", Context.NONE)
                .getValue();
        resource
            .update()
            .withIdentity(
                new ManagedServiceIdentity()
                    .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(
                        mapOf(
                            "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi",
                            new UserAssignedIdentity())))
            .withMediaServices(
                new MediaServicesForPatchRequest()
                    .withUserAssignedIdentity(
                        "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi"))
            .apply();
    }

    /*
     * x-ms-original-file: specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2022-08-01/examples/ViAccountPatch/ViAccountPatch6.json
     */
    /**
     * Sample code: Patch example #6.
     *
     * @param manager Entry point to ViManager.
     */
    public static void patchExample6(com.azure.resourcemanager.vi.ViManager manager) {
        Account resource =
            manager
                .accounts()
                .getByResourceGroupWithResponse("contosto-videoanalyzer-rg", "contosto-videoanalyzer", Context.NONE)
                .getValue();
        resource.update().apply();
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
