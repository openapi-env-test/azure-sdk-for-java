// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.resourcemanager.network.generated.fluent.models.RouteInner;
import com.azure.resourcemanager.network.generated.models.RouteNextHopType;
import java.util.Arrays;

/** Samples for RouteTables CreateOrUpdate. */
public final class RouteTablesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/RouteTableCreate.json
     */
    /**
     * Sample code: Create route table.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createRouteTable(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.routeTables().define("testrt").withRegion("westus").withExistingResourceGroup("rg1").create();
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/RouteTableCreateWithRoute.json
     */
    /**
     * Sample code: Create route table with route.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createRouteTableWithRoute(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .routeTables()
            .define("testrt")
            .withRegion("westus")
            .withExistingResourceGroup("rg1")
            .withRoutes(
                Arrays
                    .asList(
                        new RouteInner()
                            .withName("route1")
                            .withAddressPrefix("10.0.3.0/24")
                            .withNextHopType(RouteNextHopType.VIRTUAL_NETWORK_GATEWAY)))
            .withDisableBgpRoutePropagation(true)
            .create();
    }
}
