// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for HubVirtualNetworkConnections Delete. */
public final class HubVirtualNetworkConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/HubVirtualNetworkConnectionDelete.json
     */
    /**
     * Sample code: HubVirtualNetworkConnectionDelete.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void hubVirtualNetworkConnectionDelete(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.hubVirtualNetworkConnections().delete("rg1", "virtualHub1", "connection1", Context.NONE);
    }
}
