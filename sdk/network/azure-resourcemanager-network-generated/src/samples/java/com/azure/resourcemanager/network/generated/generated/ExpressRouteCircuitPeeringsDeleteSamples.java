// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for ExpressRouteCircuitPeerings Delete. */
public final class ExpressRouteCircuitPeeringsDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/ExpressRouteCircuitPeeringDelete.json
     */
    /**
     * Sample code: Delete ExpressRouteCircuit Peerings.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void deleteExpressRouteCircuitPeerings(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.expressRouteCircuitPeerings().delete("rg1", "circuitName", "peeringName", Context.NONE);
    }
}
