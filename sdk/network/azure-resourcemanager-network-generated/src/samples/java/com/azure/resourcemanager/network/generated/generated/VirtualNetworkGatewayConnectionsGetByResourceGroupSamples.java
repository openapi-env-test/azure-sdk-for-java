// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualNetworkGatewayConnections GetByResourceGroup. */
public final class VirtualNetworkGatewayConnectionsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/VirtualNetworkGatewayConnectionGet.json
     */
    /**
     * Sample code: GetVirtualNetworkGatewayConnection.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getVirtualNetworkGatewayConnection(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.virtualNetworkGatewayConnections().getByResourceGroupWithResponse("rg1", "connS2S", Context.NONE);
    }
}
