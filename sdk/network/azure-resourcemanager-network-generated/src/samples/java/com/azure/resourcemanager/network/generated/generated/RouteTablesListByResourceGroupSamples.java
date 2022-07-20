// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for RouteTables ListByResourceGroup. */
public final class RouteTablesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/RouteTableList.json
     */
    /**
     * Sample code: List route tables in resource group.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void listRouteTablesInResourceGroup(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.routeTables().listByResourceGroup("rg1", Context.NONE);
    }
}
