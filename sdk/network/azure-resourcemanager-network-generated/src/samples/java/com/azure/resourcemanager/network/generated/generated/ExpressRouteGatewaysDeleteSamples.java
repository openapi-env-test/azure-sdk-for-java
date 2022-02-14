// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for ExpressRouteGateways Delete. */
public final class ExpressRouteGatewaysDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/ExpressRouteGatewayDelete.json
     */
    /**
     * Sample code: ExpressRouteGatewayDelete.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void expressRouteGatewayDelete(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.expressRouteGateways().delete("resourceGroupName", "expressRouteGatewayName", Context.NONE);
    }
}
