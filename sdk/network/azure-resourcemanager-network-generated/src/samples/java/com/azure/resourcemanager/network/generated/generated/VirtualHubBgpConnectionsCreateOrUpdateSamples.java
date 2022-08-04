// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.management.SubResource;

/** Samples for VirtualHubBgpConnections CreateOrUpdate. */
public final class VirtualHubBgpConnectionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/VirtualHubBgpConnectionPut.json
     */
    /**
     * Sample code: VirtualHubRouteTableV2Put.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void virtualHubRouteTableV2Put(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .virtualHubBgpConnections()
            .define("conn1")
            .withExistingVirtualHub("rg1", "hub1")
            .withPeerAsn(20000L)
            .withPeerIp("192.168.1.5")
            .withHubVirtualNetworkConnection(
                new SubResource()
                    .withId(
                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualHubs/hub1/hubVirtualNetworkConnections/hubVnetConn1"))
            .create();
    }
}
