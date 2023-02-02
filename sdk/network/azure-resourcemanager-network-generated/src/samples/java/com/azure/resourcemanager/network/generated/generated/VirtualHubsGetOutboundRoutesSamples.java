// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.models.GetOutboundRoutesParameters;

/** Samples for VirtualHubs GetOutboundRoutes. */
public final class VirtualHubsGetOutboundRoutesSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/GetOutboundRoutes.json
     */
    /**
     * Sample code: Outbound Routes for the Virtual Hub on a Particular Connection.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void outboundRoutesForTheVirtualHubOnAParticularConnection(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .virtualHubs()
            .getOutboundRoutes(
                "rg1",
                "virtualHub1",
                new GetOutboundRoutesParameters()
                    .withResourceUri(
                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/expressRouteGateways/exrGw1/expressRouteConnections/exrConn1")
                    .withConnectionType("ExpressRouteConnection"),
                Context.NONE);
    }
}
