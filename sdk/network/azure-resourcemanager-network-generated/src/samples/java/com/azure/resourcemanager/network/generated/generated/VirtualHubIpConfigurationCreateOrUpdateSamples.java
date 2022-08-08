// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.resourcemanager.network.generated.fluent.models.SubnetInner;

/** Samples for VirtualHubIpConfiguration CreateOrUpdate. */
public final class VirtualHubIpConfigurationCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/VirtualHubIpConfigurationPut.json
     */
    /**
     * Sample code: VirtualHubIpConfigurationPut.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void virtualHubIpConfigurationPut(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .virtualHubIpConfigurations()
            .define("ipconfig1")
            .withExistingVirtualHub("rg1", "hub1")
            .withSubnet(
                new SubnetInner()
                    .withId(
                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/vnet1/subnets/subnet1"))
            .create();
    }
}
