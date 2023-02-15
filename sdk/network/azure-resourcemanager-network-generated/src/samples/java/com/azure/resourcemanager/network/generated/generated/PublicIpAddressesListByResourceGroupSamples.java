// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for PublicIpAddresses ListByResourceGroup. */
public final class PublicIpAddressesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/PublicIpAddressList.json
     */
    /**
     * Sample code: List resource group public IP addresses.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void listResourceGroupPublicIPAddresses(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.publicIpAddresses().listByResourceGroup("rg1", com.azure.core.util.Context.NONE);
    }
}
