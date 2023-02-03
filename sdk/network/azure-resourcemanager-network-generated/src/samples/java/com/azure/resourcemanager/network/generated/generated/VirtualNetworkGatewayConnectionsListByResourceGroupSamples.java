// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualNetworkGatewayConnections ListByResourceGroup. */
public final class VirtualNetworkGatewayConnectionsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/VirtualNetworkGatewayConnectionsList.json
     */
    /**
     * Sample code: ListVirtualNetworkGatewayConnectionsinResourceGroup.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void listVirtualNetworkGatewayConnectionsinResourceGroup(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.virtualNetworkGatewayConnections().listByResourceGroup("rg1", Context.NONE);
    }
}
