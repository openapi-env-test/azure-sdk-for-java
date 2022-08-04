// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualNetworkGateways ListConnections. */
public final class VirtualNetworkGatewaysListConnectionsSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/VirtualNetworkGatewaysListConnections.json
     */
    /**
     * Sample code: VirtualNetworkGatewaysListConnections.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void virtualNetworkGatewaysListConnections(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.virtualNetworkGateways().listConnections("testrg", "test-vpn-gateway-1", Context.NONE);
    }
}
