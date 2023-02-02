// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for ExpressRouteCrossConnections ListRoutesTableSummary. */
public final class ExpressRouteCrossConnectionsListRoutesTableSummarySamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/ExpressRouteCrossConnectionsRouteTableSummary.json
     */
    /**
     * Sample code: GetExpressRouteCrossConnectionsRouteTableSummary.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getExpressRouteCrossConnectionsRouteTableSummary(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .expressRouteCrossConnections()
            .listRoutesTableSummary(
                "CrossConnection-SiliconValley", "<circuitServiceKey>", "AzurePrivatePeering", "primary", Context.NONE);
    }
}
