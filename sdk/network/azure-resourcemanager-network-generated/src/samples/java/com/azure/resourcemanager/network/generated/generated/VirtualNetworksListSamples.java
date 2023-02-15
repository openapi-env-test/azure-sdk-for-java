// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for VirtualNetworks List. */
public final class VirtualNetworksListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/VirtualNetworkListAll.json
     */
    /**
     * Sample code: List all virtual networks.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void listAllVirtualNetworks(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.virtualNetworks().list(com.azure.core.util.Context.NONE);
    }
}
