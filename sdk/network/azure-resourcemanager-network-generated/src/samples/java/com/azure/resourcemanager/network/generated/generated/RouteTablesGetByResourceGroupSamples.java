// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for RouteTables GetByResourceGroup. */
public final class RouteTablesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/RouteTableGet.json
     */
    /**
     * Sample code: Get route table.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getRouteTable(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.routeTables().getByResourceGroupWithResponse("rg1", "testrt", null, Context.NONE);
    }
}
