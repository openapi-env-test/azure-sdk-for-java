// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualNetworkGateways GetBgpPeerStatus. */
public final class VirtualNetworkGatewaysGetBgpPeerStatusSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/VirtualNetworkGatewayGetBGPPeerStatus.json
     */
    /**
     * Sample code: GetVirtualNetworkGatewayBGPPeerStatus.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getVirtualNetworkGatewayBGPPeerStatus(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.virtualNetworkGateways().getBgpPeerStatus("rg1", "vpngw", null, Context.NONE);
    }
}
