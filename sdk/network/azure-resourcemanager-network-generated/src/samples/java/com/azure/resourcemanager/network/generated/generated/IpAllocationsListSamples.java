// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for IpAllocations List. */
public final class IpAllocationsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/IpAllocationList.json
     */
    /**
     * Sample code: List all IpAllocations.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void listAllIpAllocations(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.ipAllocations().list(Context.NONE);
    }
}
