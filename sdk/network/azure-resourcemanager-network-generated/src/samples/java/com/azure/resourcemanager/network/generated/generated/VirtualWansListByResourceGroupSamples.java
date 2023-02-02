// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualWans ListByResourceGroup. */
public final class VirtualWansListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/VirtualWANListByResourceGroup.json
     */
    /**
     * Sample code: VirtualWANListByResourceGroup.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void virtualWANListByResourceGroup(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.virtualWans().listByResourceGroup("rg1", Context.NONE);
    }
}
