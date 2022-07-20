// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualNetworkGatewayConnections GetSharedKey. */
public final class VirtualNetworkGatewayConnectionsGetSharedKeySamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/VirtualNetworkGatewayConnectionGetSharedKey.json
     */
    /**
     * Sample code: GetVirtualNetworkGatewayConnectionSharedKey.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getVirtualNetworkGatewayConnectionSharedKey(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.virtualNetworkGatewayConnections().getSharedKeyWithResponse("rg1", "connS2S", Context.NONE);
    }
}
