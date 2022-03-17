// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.models.ManagedServiceIdentity;
import com.azure.resourcemanager.network.generated.models.ManagedServiceIdentityUserAssignedIdentities;
import com.azure.resourcemanager.network.generated.models.ResourceIdentityType;
import com.azure.resourcemanager.network.generated.models.VirtualApplianceSkuProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for NetworkVirtualAppliances CreateOrUpdate. */
public final class NetworkVirtualAppliancesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/NetworkVirtualAppliancePut.json
     */
    /**
     * Sample code: Create NetworkVirtualAppliance.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createNetworkVirtualAppliance(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .networkVirtualAppliances()
            .define("nva")
            .withRegion("West US")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("key1", "value1"))
            .withIdentity(
                new ManagedServiceIdentity()
                    .withType(ResourceIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(
                        mapOf(
                            "/subscriptions/subid/resourcegroups/rg1/providers/Microsoft.ManagedIdentity/userAssignedIdentities/identity1",
                            new ManagedServiceIdentityUserAssignedIdentities())))
            .withNvaSku(
                new VirtualApplianceSkuProperties()
                    .withVendor("Cisco SDWAN")
                    .withBundledScaleUnit("1")
                    .withMarketPlaceVersion("12.1"))
            .withBootStrapConfigurationBlobs(
                Arrays.asList("https://csrncvhdstorage1.blob.core.windows.net/csrncvhdstoragecont/csrbootstrapconfig"))
            .withVirtualHub(
                new SubResource()
                    .withId("/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualHubs/hub1"))
            .withCloudInitConfigurationBlobs(
                Arrays.asList("https://csrncvhdstorage1.blob.core.windows.net/csrncvhdstoragecont/csrcloudinitconfig"))
            .withVirtualApplianceAsn(10000L)
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
