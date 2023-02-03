// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for NetworkWatchers List. */
public final class NetworkWatchersListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/NetworkWatcherListAll.json
     */
    /**
     * Sample code: List all network watchers.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void listAllNetworkWatchers(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.networkWatchers().list(Context.NONE);
    }
}
