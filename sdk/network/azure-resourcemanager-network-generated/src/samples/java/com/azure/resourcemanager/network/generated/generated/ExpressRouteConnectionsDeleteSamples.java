// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for ExpressRouteConnections Delete. */
public final class ExpressRouteConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/ExpressRouteConnectionDelete.json
     */
    /**
     * Sample code: ExpressRouteConnectionDelete.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void expressRouteConnectionDelete(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .expressRouteConnections()
            .delete("resourceGroupName", "expressRouteGatewayName", "connectionName", Context.NONE);
    }
}
