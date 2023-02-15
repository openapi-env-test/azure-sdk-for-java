// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for HubVirtualNetworkConnections List. */
public final class HubVirtualNetworkConnectionsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/HubVirtualNetworkConnectionList.json
     */
    /**
     * Sample code: HubVirtualNetworkConnectionList.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void hubVirtualNetworkConnectionList(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.hubVirtualNetworkConnections().list("rg1", "virtualHub1", com.azure.core.util.Context.NONE);
    }
}
