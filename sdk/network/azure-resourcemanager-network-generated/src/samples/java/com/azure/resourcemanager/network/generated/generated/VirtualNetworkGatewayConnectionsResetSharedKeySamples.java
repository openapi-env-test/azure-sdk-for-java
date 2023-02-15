// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.resourcemanager.network.generated.fluent.models.ConnectionResetSharedKeyInner;

/** Samples for VirtualNetworkGatewayConnections ResetSharedKey. */
public final class VirtualNetworkGatewayConnectionsResetSharedKeySamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/VirtualNetworkGatewayConnectionResetSharedKey.json
     */
    /**
     * Sample code: ResetVirtualNetworkGatewayConnectionSharedKey.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void resetVirtualNetworkGatewayConnectionSharedKey(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .virtualNetworkGatewayConnections()
            .resetSharedKey(
                "rg1",
                "conn1",
                new ConnectionResetSharedKeyInner().withKeyLength(128),
                com.azure.core.util.Context.NONE);
    }
}
