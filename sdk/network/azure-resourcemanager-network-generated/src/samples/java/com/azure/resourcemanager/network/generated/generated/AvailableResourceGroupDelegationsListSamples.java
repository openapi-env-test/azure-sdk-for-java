// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for AvailableResourceGroupDelegations List. */
public final class AvailableResourceGroupDelegationsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/AvailableDelegationsResourceGroupGet.json
     */
    /**
     * Sample code: Get available delegations in the resource group.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getAvailableDelegationsInTheResourceGroup(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.availableResourceGroupDelegations().list("westcentralus", "rg1", Context.NONE);
    }
}
