// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualHubs ListByResourceGroup. */
public final class VirtualHubsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/VirtualHubListByResourceGroup.json
     */
    /**
     * Sample code: VirtualHubListByResourceGroup.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void virtualHubListByResourceGroup(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.virtualHubs().listByResourceGroup("rg1", Context.NONE);
    }
}
