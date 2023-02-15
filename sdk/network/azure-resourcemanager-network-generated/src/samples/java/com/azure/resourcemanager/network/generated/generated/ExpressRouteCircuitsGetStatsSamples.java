// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for ExpressRouteCircuits GetStats. */
public final class ExpressRouteCircuitsGetStatsSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/ExpressRouteCircuitStats.json
     */
    /**
     * Sample code: Get ExpressRoute Circuit Traffic Stats.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getExpressRouteCircuitTrafficStats(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.expressRouteCircuits().getStatsWithResponse("rg1", "circuitName", com.azure.core.util.Context.NONE);
    }
}
