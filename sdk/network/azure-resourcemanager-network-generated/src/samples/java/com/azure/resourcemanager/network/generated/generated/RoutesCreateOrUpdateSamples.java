// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.resourcemanager.network.generated.models.RouteNextHopType;

/** Samples for Routes CreateOrUpdate. */
public final class RoutesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/RouteTableRouteCreate.json
     */
    /**
     * Sample code: Create route.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createRoute(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .routes()
            .define("route1")
            .withExistingRouteTable("rg1", "testrt")
            .withAddressPrefix("10.0.3.0/24")
            .withNextHopType(RouteNextHopType.VIRTUAL_NETWORK_GATEWAY)
            .create();
    }
}
