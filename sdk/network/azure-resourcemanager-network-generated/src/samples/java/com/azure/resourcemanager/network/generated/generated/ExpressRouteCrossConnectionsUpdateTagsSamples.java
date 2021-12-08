// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCrossConnection;
import java.util.HashMap;
import java.util.Map;

/** Samples for ExpressRouteCrossConnections UpdateTags. */
public final class ExpressRouteCrossConnectionsUpdateTagsSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/ExpressRouteCrossConnectionUpdateTags.json
     */
    /**
     * Sample code: UpdateExpressRouteCrossConnectionTags.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void updateExpressRouteCrossConnectionTags(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        ExpressRouteCrossConnection resource =
            manager
                .expressRouteCrossConnections()
                .getByResourceGroupWithResponse("CrossConnection-SiliconValley", "<circuitServiceKey>", Context.NONE)
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
