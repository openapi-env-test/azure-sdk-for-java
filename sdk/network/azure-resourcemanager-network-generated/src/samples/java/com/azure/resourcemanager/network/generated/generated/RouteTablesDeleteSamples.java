// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for RouteTables Delete. */
public final class RouteTablesDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/RouteTableDelete.json
     */
    /**
     * Sample code: Delete route table.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void deleteRouteTable(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.routeTables().delete("rg1", "testrt", Context.NONE);
    }
}
