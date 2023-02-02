// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for RoutingIntent Get. */
public final class RoutingIntentGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/RoutingIntentGet.json
     */
    /**
     * Sample code: RouteTableGet.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void routeTableGet(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.routingIntents().getWithResponse("rg1", "virtualHub1", "Intent1", Context.NONE);
    }
}
