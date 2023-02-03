// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for NetworkProfiles GetByResourceGroup. */
public final class NetworkProfilesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/NetworkProfileGetWithContainerNic.json
     */
    /**
     * Sample code: Get network profile with container network interfaces.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getNetworkProfileWithContainerNetworkInterfaces(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.networkProfiles().getByResourceGroupWithResponse("rg1", "networkProfile1", null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/NetworkProfileGetConfigOnly.json
     */
    /**
     * Sample code: Get network profile.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getNetworkProfile(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.networkProfiles().getByResourceGroupWithResponse("rg1", "networkProfile1", null, Context.NONE);
    }
}
