// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for PrivateLinkServices GetPrivateEndpointConnection. */
public final class PrivateLinkServicesGetPrivateEndpointConnectionSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/PrivateLinkServiceGetPrivateEndpointConnection.json
     */
    /**
     * Sample code: Get private end point connection.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getPrivateEndPointConnection(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .privateLinkServices()
            .getPrivateEndpointConnectionWithResponse(
                "rg1", "testPls", "testPlePeConnection", null, com.azure.core.util.Context.NONE);
    }
}
