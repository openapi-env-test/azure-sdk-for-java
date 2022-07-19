// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for CustomIpPrefixes ListByResourceGroup. */
public final class CustomIpPrefixesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/CustomIpPrefixList.json
     */
    /**
     * Sample code: List resource group Custom IP prefixes.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void listResourceGroupCustomIPPrefixes(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.customIpPrefixes().listByResourceGroup("rg1", Context.NONE);
    }
}
