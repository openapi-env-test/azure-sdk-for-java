// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.generated;

import com.azure.resourcemanager.relay.models.ConnectionState;
import com.azure.resourcemanager.relay.models.PrivateEndpoint;
import com.azure.resourcemanager.relay.models.PrivateLinkConnectionStatus;

/** Samples for PrivateEndpointConnections CreateOrUpdate. */
public final class PrivateEndpointConnectionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/relay/resource-manager/Microsoft.Relay/stable/2021-11-01/examples/PrivateEndpointConnections/PrivateEndpointConnectionsCreate.json
     */
    /**
     * Sample code: NameSpacePrivateEndPointConnectionCreate.
     *
     * @param manager Entry point to RelayManager.
     */
    public static void nameSpacePrivateEndPointConnectionCreate(com.azure.resourcemanager.relay.RelayManager manager) {
        manager
            .privateEndpointConnections()
            .define("{privateEndpointConnection name}")
            .withExistingNamespace("resourcegroup", "example-RelayNamespace-5849")
            .withPrivateEndpoint(
                new PrivateEndpoint()
                    .withId(
                        "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/resourcegroup/providers/Microsoft.Network/privateEndpoints/ali-relay-pve-1"))
            .withPrivateLinkServiceConnectionState(
                new ConnectionState().withStatus(PrivateLinkConnectionStatus.APPROVED).withDescription("You may pass"))
            .create();
    }
}
