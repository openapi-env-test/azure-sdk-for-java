// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for ApplicationGatewayPrivateEndpointConnections Get. */
public final class ApplicationGatewayPrivateEndpointConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/ApplicationGatewayPrivateEndpointConnectionGet.json
     */
    /**
     * Sample code: Get Application Gateway Private Endpoint Connection.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getApplicationGatewayPrivateEndpointConnection(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .applicationGatewayPrivateEndpointConnections()
            .getWithResponse("rg1", "appgw", "connection1", Context.NONE);
    }
}
