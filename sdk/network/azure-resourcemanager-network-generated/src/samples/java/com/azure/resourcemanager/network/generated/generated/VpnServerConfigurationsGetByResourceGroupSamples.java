// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for VpnServerConfigurations GetByResourceGroup. */
public final class VpnServerConfigurationsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/VpnServerConfigurationGet.json
     */
    /**
     * Sample code: VpnServerConfigurationGet.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void vpnServerConfigurationGet(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .vpnServerConfigurations()
            .getByResourceGroupWithResponse("rg1", "vpnServerConfiguration1", Context.NONE);
    }
}
