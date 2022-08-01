// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualNetworks Delete. */
public final class VirtualNetworksDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/VirtualNetworkDelete.json
     */
    /**
     * Sample code: Delete virtual network.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void deleteVirtualNetwork(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.virtualNetworks().delete("rg1", "test-vnet", Context.NONE);
    }
}
