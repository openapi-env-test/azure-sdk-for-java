// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.iothub.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.iothub.models.PrivateEndpointConnectionProperties;
import com.azure.resourcemanager.iothub.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.iothub.models.PrivateLinkServiceConnectionStatus;

/** Samples for PrivateEndpointConnections Update. */
public final class PrivateEndpointConnectionsUpdateSamples {
    /*
     * x-ms-original-file: specification/iothub/resource-manager/Microsoft.Devices/preview/2021-10-15-preview/examples/iothub_updateprivateendpointconnection.json
     */
    /**
     * Sample code: PrivateEndpointConnection_Update.
     *
     * @param manager Entry point to IotHubManager.
     */
    public static void privateEndpointConnectionUpdate(com.azure.resourcemanager.iothub.IotHubManager manager) {
        manager
            .privateEndpointConnections()
            .update(
                "myResourceGroup",
                "testHub",
                "myPrivateEndpointConnection",
                new PrivateEndpointConnectionInner()
                    .withProperties(
                        new PrivateEndpointConnectionProperties()
                            .withPrivateLinkServiceConnectionState(
                                new PrivateLinkServiceConnectionState()
                                    .withStatus(PrivateLinkServiceConnectionStatus.APPROVED)
                                    .withDescription("Approved by johndoe@contoso.com"))),
                Context.NONE);
    }
}
