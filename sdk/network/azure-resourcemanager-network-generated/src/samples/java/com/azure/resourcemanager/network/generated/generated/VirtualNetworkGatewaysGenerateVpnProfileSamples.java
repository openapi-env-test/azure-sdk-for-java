// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.models.VpnClientParameters;

/** Samples for VirtualNetworkGateways GenerateVpnProfile. */
public final class VirtualNetworkGatewaysGenerateVpnProfileSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/VirtualNetworkGatewayGenerateVpnProfile.json
     */
    /**
     * Sample code: GenerateVirtualNetworkGatewayVPNProfile.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void generateVirtualNetworkGatewayVPNProfile(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.virtualNetworkGateways().generateVpnProfile("rg1", "vpngw", new VpnClientParameters(), Context.NONE);
    }
}
