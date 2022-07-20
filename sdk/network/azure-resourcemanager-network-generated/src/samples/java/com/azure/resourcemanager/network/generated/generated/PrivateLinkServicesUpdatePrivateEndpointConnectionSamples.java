// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.network.generated.models.PrivateLinkServiceConnectionState;

/** Samples for PrivateLinkServices UpdatePrivateEndpointConnection. */
public final class PrivateLinkServicesUpdatePrivateEndpointConnectionSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/PrivateLinkServiceUpdatePrivateEndpointConnection.json
     */
    /**
     * Sample code: approve or reject private end point connection for a private link service.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void approveOrRejectPrivateEndPointConnectionForAPrivateLinkService(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .privateLinkServices()
            .updatePrivateEndpointConnectionWithResponse(
                "rg1",
                "testPls",
                "testPlePeConnection",
                new PrivateEndpointConnectionInner()
                    .withName("testPlePeConnection")
                    .withPrivateLinkServiceConnectionState(
                        new PrivateLinkServiceConnectionState()
                            .withStatus("Approved")
                            .withDescription("approved it for some reason.")),
                Context.NONE);
    }
}
