// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.ConnectionSharedKeyInner;

/** Samples for VirtualNetworkGatewayConnections SetSharedKey. */
public final class VirtualNetworkGatewayConnectionsSetSharedKeySamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/VirtualNetworkGatewayConnectionSetSharedKey.json
     */
    /**
     * Sample code: SetVirtualNetworkGatewayConnectionSharedKey.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void setVirtualNetworkGatewayConnectionSharedKey(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .virtualNetworkGatewayConnections()
            .setSharedKey("rg1", "connS2S", new ConnectionSharedKeyInner().withValue("AzureAbc123"), Context.NONE);
    }
}
