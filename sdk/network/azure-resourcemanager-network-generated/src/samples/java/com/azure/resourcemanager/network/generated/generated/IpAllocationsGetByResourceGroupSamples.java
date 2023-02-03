// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for IpAllocations GetByResourceGroup. */
public final class IpAllocationsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/IpAllocationGet.json
     */
    /**
     * Sample code: Get IpAllocation.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getIpAllocation(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.ipAllocations().getByResourceGroupWithResponse("rg1", "test-ipallocation", null, Context.NONE);
    }
}
