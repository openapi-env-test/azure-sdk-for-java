// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for NetworkWatchers GetByResourceGroup. */
public final class NetworkWatchersGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/NetworkWatcherGet.json
     */
    /**
     * Sample code: Get network watcher.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getNetworkWatcher(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.networkWatchers().getByResourceGroupWithResponse("rg1", "nw1", Context.NONE);
    }
}
