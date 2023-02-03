// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for HubRouteTables Delete. */
public final class HubRouteTablesDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/HubRouteTableDelete.json
     */
    /**
     * Sample code: RouteTableDelete.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void routeTableDelete(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.hubRouteTables().delete("rg1", "virtualHub1", "hubRouteTable1", Context.NONE);
    }
}
