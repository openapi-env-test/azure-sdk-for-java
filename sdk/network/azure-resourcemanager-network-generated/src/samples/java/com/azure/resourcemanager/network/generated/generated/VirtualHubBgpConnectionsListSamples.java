// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for VirtualHubBgpConnections List. */
public final class VirtualHubBgpConnectionsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/VirtualHubBgpConnectionList.json
     */
    /**
     * Sample code: VirtualHubRouteTableV2List.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void virtualHubRouteTableV2List(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.virtualHubBgpConnections().list("rg1", "hub1", com.azure.core.util.Context.NONE);
    }
}
