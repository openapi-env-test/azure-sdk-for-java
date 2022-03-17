// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for ExpressRouteCircuitPeerings List. */
public final class ExpressRouteCircuitPeeringsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/ExpressRouteCircuitPeeringList.json
     */
    /**
     * Sample code: List ExpressRouteCircuit Peerings.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void listExpressRouteCircuitPeerings(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.expressRouteCircuitPeerings().list("rg1", "circuitName", Context.NONE);
    }
}
