// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for VirtualRouterPeerings Delete. */
public final class VirtualRouterPeeringsDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/VirtualRouterPeeringDelete.json
     */
    /**
     * Sample code: Delete VirtualRouterPeering.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void deleteVirtualRouterPeering(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.virtualRouterPeerings().delete("rg1", "virtualRouter", "peering1", com.azure.core.util.Context.NONE);
    }
}
