// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayConnection;
import java.util.HashMap;
import java.util.Map;

/** Samples for VirtualNetworkGatewayConnections UpdateTags. */
public final class VirtualNetworkGatewayConnectionsUpdateTagsSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/VirtualNetworkGatewayConnectionUpdateTags.json
     */
    /**
     * Sample code: UpdateVirtualNetworkGatewayConnectionTags.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void updateVirtualNetworkGatewayConnectionTags(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        VirtualNetworkGatewayConnection resource =
            manager
                .virtualNetworkGatewayConnections()
                .getByResourceGroupWithResponse("rg1", "test", Context.NONE)
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
