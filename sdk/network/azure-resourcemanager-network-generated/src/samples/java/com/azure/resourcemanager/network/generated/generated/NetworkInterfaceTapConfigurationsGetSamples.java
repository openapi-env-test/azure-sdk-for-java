// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for NetworkInterfaceTapConfigurations Get. */
public final class NetworkInterfaceTapConfigurationsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/NetworkInterfaceTapConfigurationGet.json
     */
    /**
     * Sample code: Get Network Interface Tap Configurations.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getNetworkInterfaceTapConfigurations(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .networkInterfaceTapConfigurations()
            .getWithResponse("testrg", "mynic", "tapconfiguration1", Context.NONE);
    }
}
