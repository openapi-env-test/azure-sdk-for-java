// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.models.P2SVpnConnectionRequest;
import java.util.Arrays;

/** Samples for VirtualNetworkGateways DisconnectVirtualNetworkGatewayVpnConnections. */
public final class VirtualNetworkGatewaysDisconnectVirtualNetworkGatewayVpnConnectionsSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/VirtualNetworkGatewaysDisconnectP2sVpnConnections.json
     */
    /**
     * Sample code: Disconnect VpnConnections from Virtual Network Gateway.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void disconnectVpnConnectionsFromVirtualNetworkGateway(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .virtualNetworkGateways()
            .disconnectVirtualNetworkGatewayVpnConnections(
                "vpn-gateway-test",
                "vpngateway",
                new P2SVpnConnectionRequest().withVpnConnectionIds(Arrays.asList("vpnconnId1", "vpnconnId2")),
                Context.NONE);
    }
}
