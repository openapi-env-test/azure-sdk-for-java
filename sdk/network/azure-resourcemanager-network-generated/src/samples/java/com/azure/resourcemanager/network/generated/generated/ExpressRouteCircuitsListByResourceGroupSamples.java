// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for ExpressRouteCircuits ListByResourceGroup. */
public final class ExpressRouteCircuitsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/ExpressRouteCircuitListByResourceGroup.json
     */
    /**
     * Sample code: List ExpressRouteCircuits in a resource group.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void listExpressRouteCircuitsInAResourceGroup(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.expressRouteCircuits().listByResourceGroup("rg1", Context.NONE);
    }
}
