// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayPrivateEndpointConnectionInner;
import com.azure.resourcemanager.network.generated.models.PrivateLinkServiceConnectionState;

/** Samples for ApplicationGatewayPrivateEndpointConnections Update. */
public final class ApplicationGatewayPrivateEndpointConnectionsUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/ApplicationGatewayPrivateEndpointConnectionUpdate.json
     */
    /**
     * Sample code: Update Application Gateway Private Endpoint Connection.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void updateApplicationGatewayPrivateEndpointConnection(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .applicationGatewayPrivateEndpointConnections()
            .update(
                "rg1",
                "appgw",
                "connection1",
                new ApplicationGatewayPrivateEndpointConnectionInner()
                    .withName("connection1")
                    .withPrivateLinkServiceConnectionState(
                        new PrivateLinkServiceConnectionState()
                            .withStatus("Approved")
                            .withDescription("approved it for some reason.")),
                Context.NONE);
    }
}
