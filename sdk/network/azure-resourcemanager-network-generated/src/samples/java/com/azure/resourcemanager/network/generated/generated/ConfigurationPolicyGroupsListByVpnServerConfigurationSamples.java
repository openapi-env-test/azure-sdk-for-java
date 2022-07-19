// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for ConfigurationPolicyGroups ListByVpnServerConfiguration. */
public final class ConfigurationPolicyGroupsListByVpnServerConfigurationSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/ConfigurationPolicyGroupListByVpnServerConfiguration.json
     */
    /**
     * Sample code: ConfigurationPolicyGroupListByVpnServerConfiguration.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void configurationPolicyGroupListByVpnServerConfiguration(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .configurationPolicyGroups()
            .listByVpnServerConfiguration("rg1", "vpnServerConfiguration1", Context.NONE);
    }
}
