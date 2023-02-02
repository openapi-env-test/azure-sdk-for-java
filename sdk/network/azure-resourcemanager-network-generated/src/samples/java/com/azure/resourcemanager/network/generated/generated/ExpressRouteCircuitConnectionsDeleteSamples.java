// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for ExpressRouteCircuitConnections Delete. */
public final class ExpressRouteCircuitConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/ExpressRouteCircuitConnectionDelete.json
     */
    /**
     * Sample code: Delete ExpressRouteCircuit.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void deleteExpressRouteCircuit(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .expressRouteCircuitConnections()
            .delete("rg1", "ExpressRouteARMCircuitA", "AzurePrivatePeering", "circuitConnectionUSAUS", Context.NONE);
    }
}
