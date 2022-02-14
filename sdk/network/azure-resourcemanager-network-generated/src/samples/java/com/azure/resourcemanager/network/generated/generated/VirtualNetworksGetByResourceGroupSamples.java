// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualNetworks GetByResourceGroup. */
public final class VirtualNetworksGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/VirtualNetworkGetWithSubnetDelegation.json
     */
    /**
     * Sample code: Get virtual network with a delegated subnet.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getVirtualNetworkWithADelegatedSubnet(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.virtualNetworks().getByResourceGroupWithResponse("rg1", "test-vnet", null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/VirtualNetworkGetWithServiceAssociationLink.json
     */
    /**
     * Sample code: Get virtual network with service association links.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getVirtualNetworkWithServiceAssociationLinks(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.virtualNetworks().getByResourceGroupWithResponse("rg1", "test-vnet", null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/VirtualNetworkGet.json
     */
    /**
     * Sample code: Get virtual network.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getVirtualNetwork(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.virtualNetworks().getByResourceGroupWithResponse("rg1", "test-vnet", null, Context.NONE);
    }
}
