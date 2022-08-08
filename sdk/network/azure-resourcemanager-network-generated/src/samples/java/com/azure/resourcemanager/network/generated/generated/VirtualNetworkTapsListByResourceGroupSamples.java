// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualNetworkTaps ListByResourceGroup. */
public final class VirtualNetworkTapsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/VirtualNetworkTapList.json
     */
    /**
     * Sample code: List virtual network taps in resource group.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void listVirtualNetworkTapsInResourceGroup(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.virtualNetworkTaps().listByResourceGroup("rg1", Context.NONE);
    }
}
