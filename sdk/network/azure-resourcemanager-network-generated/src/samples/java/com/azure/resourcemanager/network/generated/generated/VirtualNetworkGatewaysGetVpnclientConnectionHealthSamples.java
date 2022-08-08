// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualNetworkGateways GetVpnclientConnectionHealth. */
public final class VirtualNetworkGatewaysGetVpnclientConnectionHealthSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/VirtualNetworkGatewayGetVpnclientConnectionHealth.json
     */
    /**
     * Sample code: GetVirtualNetworkGatewayVpnclientConnectionHealth.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getVirtualNetworkGatewayVpnclientConnectionHealth(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.virtualNetworkGateways().getVpnclientConnectionHealth("p2s-vnet-test", "vpnp2sgw", Context.NONE);
    }
}
