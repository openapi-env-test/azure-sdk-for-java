// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.management.SubResource;
import java.util.HashMap;
import java.util.Map;

/** Samples for VirtualHubs CreateOrUpdate. */
public final class VirtualHubsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/VirtualHubPut.json
     */
    /**
     * Sample code: VirtualHubPut.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void virtualHubPut(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .virtualHubs()
            .define("virtualHub2")
            .withRegion("West US")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("key1", "value1"))
            .withVirtualWan(
                new SubResource()
                    .withId(
                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualWans/virtualWan1"))
            .withAddressPrefix("10.168.0.0/24")
            .withSku("Basic")
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
