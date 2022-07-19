// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualHubRouteTableV2S List. */
public final class VirtualHubRouteTableV2SListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/VirtualHubRouteTableV2List.json
     */
    /**
     * Sample code: VirtualHubRouteTableV2List.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void virtualHubRouteTableV2List(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.virtualHubRouteTableV2S().list("rg1", "virtualHub1", Context.NONE);
    }
}
