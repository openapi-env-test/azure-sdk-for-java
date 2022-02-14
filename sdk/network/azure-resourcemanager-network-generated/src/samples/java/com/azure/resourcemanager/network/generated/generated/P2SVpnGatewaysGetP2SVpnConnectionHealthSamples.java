// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for P2SVpnGateways GetP2SVpnConnectionHealth. */
public final class P2SVpnGatewaysGetP2SVpnConnectionHealthSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/P2SVpnGatewayGetConnectionHealth.json
     */
    /**
     * Sample code: P2SVpnGatewayGetConnectionHealth.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void p2SVpnGatewayGetConnectionHealth(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.p2SVpnGateways().getP2SVpnConnectionHealth("rg1", "p2sVpnGateway1", Context.NONE);
    }
}
