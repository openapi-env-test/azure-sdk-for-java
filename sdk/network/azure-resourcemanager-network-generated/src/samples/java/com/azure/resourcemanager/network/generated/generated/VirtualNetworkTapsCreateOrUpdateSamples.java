// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.resourcemanager.network.generated.fluent.models.NetworkInterfaceIpConfigurationInner;

/** Samples for VirtualNetworkTaps CreateOrUpdate. */
public final class VirtualNetworkTapsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/VirtualNetworkTapCreate.json
     */
    /**
     * Sample code: Create Virtual Network Tap.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createVirtualNetworkTap(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .virtualNetworkTaps()
            .define("test-vtap")
            .withRegion("centraluseuap")
            .withExistingResourceGroup("rg1")
            .withDestinationNetworkInterfaceIpConfiguration(
                new NetworkInterfaceIpConfigurationInner()
                    .withId(
                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/networkInterfaces/testNetworkInterface/ipConfigurations/ipconfig1"))
            .create();
    }
}
