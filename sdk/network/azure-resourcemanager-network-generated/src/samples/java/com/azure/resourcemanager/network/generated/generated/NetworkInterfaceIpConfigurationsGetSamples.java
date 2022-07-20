// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for NetworkInterfaceIpConfigurations Get. */
public final class NetworkInterfaceIpConfigurationsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/NetworkInterfaceIPConfigurationGet.json
     */
    /**
     * Sample code: NetworkInterfaceIPConfigurationGet.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void networkInterfaceIPConfigurationGet(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.networkInterfaceIpConfigurations().getWithResponse("testrg", "mynic", "ipconfig1", Context.NONE);
    }
}
