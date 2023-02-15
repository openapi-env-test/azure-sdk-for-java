// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for ExpressRouteCircuitPeerings Get. */
public final class ExpressRouteCircuitPeeringsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/ExpressRouteCircuitPeeringGet.json
     */
    /**
     * Sample code: Get ExpressRouteCircuit Peering.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getExpressRouteCircuitPeering(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .expressRouteCircuitPeerings()
            .getWithResponse("rg1", "circuitName", "MicrosoftPeering", com.azure.core.util.Context.NONE);
    }
}
