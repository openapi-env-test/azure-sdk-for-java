// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualNetworkGatewayConnections Delete. */
public final class VirtualNetworkGatewayConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/VirtualNetworkGatewayConnectionDelete.json
     */
    /**
     * Sample code: DeleteVirtualNetworkGatewayConnection.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void deleteVirtualNetworkGatewayConnection(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.virtualNetworkGatewayConnections().delete("rg1", "conn1", Context.NONE);
    }
}
