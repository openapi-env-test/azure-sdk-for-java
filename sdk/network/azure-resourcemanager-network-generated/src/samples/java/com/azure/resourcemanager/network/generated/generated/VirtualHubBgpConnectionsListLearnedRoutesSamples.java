// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for VirtualHubBgpConnections ListLearnedRoutes. */
public final class VirtualHubBgpConnectionsListLearnedRoutesSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/VirtualRouterPeerListLearnedRoute.json
     */
    /**
     * Sample code: VirtualRouterPeerListLearnedRoutes.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void virtualRouterPeerListLearnedRoutes(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .virtualHubBgpConnections()
            .listLearnedRoutes("rg1", "virtualRouter1", "peer1", com.azure.core.util.Context.NONE);
    }
}
