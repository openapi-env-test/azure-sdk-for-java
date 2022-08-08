// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualRouterPeerings Get. */
public final class VirtualRouterPeeringsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/VirtualRouterPeeringGet.json
     */
    /**
     * Sample code: Get Virtual Router Peering.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getVirtualRouterPeering(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.virtualRouterPeerings().getWithResponse("rg1", "virtualRouter", "peering1", Context.NONE);
    }
}
