// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for HubRouteTables Get. */
public final class HubRouteTablesGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/HubRouteTableGet.json
     */
    /**
     * Sample code: RouteTableGet.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void routeTableGet(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .hubRouteTables()
            .getWithResponse("rg1", "virtualHub1", "hubRouteTable1", com.azure.core.util.Context.NONE);
    }
}
