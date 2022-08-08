// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.models.NetworkInterface;
import java.util.HashMap;
import java.util.Map;

/** Samples for NetworkInterfaces UpdateTags. */
public final class NetworkInterfacesUpdateTagsSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/NetworkInterfaceUpdateTags.json
     */
    /**
     * Sample code: Update network interface tags.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void updateNetworkInterfaceTags(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        NetworkInterface resource =
            manager
                .networkInterfaces()
                .getByResourceGroupWithResponse("rg1", "test-nic", null, Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
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
