// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.models.NetworkWatcher;
import java.util.HashMap;
import java.util.Map;

/** Samples for NetworkWatchers UpdateTags. */
public final class NetworkWatchersUpdateTagsSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/NetworkWatcherUpdateTags.json
     */
    /**
     * Sample code: Update network watcher tags.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void updateNetworkWatcherTags(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        NetworkWatcher resource =
            manager.networkWatchers().getByResourceGroupWithResponse("rg1", "nw1", Context.NONE).getValue();
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
