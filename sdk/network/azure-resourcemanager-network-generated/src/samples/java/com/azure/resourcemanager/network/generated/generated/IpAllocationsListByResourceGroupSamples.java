// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for IpAllocations ListByResourceGroup. */
public final class IpAllocationsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/IpAllocationListByResourceGroup.json
     */
    /**
     * Sample code: List IpAllocations in resource group.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void listIpAllocationsInResourceGroup(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.ipAllocations().listByResourceGroup("rg1", Context.NONE);
    }
}
