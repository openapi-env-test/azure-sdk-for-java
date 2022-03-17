// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualHubRouteTableV2S Get. */
public final class VirtualHubRouteTableV2SGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/VirtualHubRouteTableV2Get.json
     */
    /**
     * Sample code: VirtualHubVirtualHubRouteTableV2Get.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void virtualHubVirtualHubRouteTableV2Get(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.virtualHubRouteTableV2S().getWithResponse("rg1", "virtualHub1", "virtualHubRouteTable1a", Context.NONE);
    }
}
