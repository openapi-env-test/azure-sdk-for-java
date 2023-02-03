// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for ExpressRouteCircuits ListRoutesTable. */
public final class ExpressRouteCircuitsListRoutesTableSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/ExpressRouteCircuitRouteTableList.json
     */
    /**
     * Sample code: List Route Tables.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void listRouteTables(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.expressRouteCircuits().listRoutesTable("rg1", "circuitName", "peeringName", "devicePath", Context.NONE);
    }
}
