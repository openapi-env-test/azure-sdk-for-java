// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.models.VirtualHub;
import java.util.HashMap;
import java.util.Map;

/** Samples for VirtualHubs UpdateTags. */
public final class VirtualHubsUpdateTagsSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/VirtualHubUpdateTags.json
     */
    /**
     * Sample code: VirtualHubUpdate.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void virtualHubUpdate(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        VirtualHub resource =
            manager.virtualHubs().getByResourceGroupWithResponse("rg1", "virtualHub2", Context.NONE).getValue();
        resource.update().withTags(mapOf("key1", "value1", "key2", "value2")).apply();
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
