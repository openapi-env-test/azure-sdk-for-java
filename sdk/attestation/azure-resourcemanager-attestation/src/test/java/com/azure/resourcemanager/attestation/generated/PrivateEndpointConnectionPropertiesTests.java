// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.attestation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.attestation.fluent.models.PrivateEndpointConnectionProperties;
import com.azure.resourcemanager.attestation.models.PrivateEndpoint;
import com.azure.resourcemanager.attestation.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.attestation.models.PrivateLinkServiceConnectionState;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionProperties model =
            BinaryData
                .fromString(
                    "{\"privateEndpoint\":{\"id\":\"ryo\"},\"privateLinkServiceConnectionState\":{\"status\":\"Rejected\",\"description\":\"acctazakljla\",\"actionsRequired\":\"cr\"},\"provisioningState\":\"Deleting\"}")
                .toObject(PrivateEndpointConnectionProperties.class);
        Assertions
            .assertEquals(
                PrivateEndpointServiceConnectionStatus.REJECTED, model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("acctazakljla", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("cr", model.privateLinkServiceConnectionState().actionsRequired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionProperties model =
            new PrivateEndpointConnectionProperties()
                .withPrivateEndpoint(new PrivateEndpoint())
                .withPrivateLinkServiceConnectionState(
                    new PrivateLinkServiceConnectionState()
                        .withStatus(PrivateEndpointServiceConnectionStatus.REJECTED)
                        .withDescription("acctazakljla")
                        .withActionsRequired("cr"));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionProperties.class);
        Assertions
            .assertEquals(
                PrivateEndpointServiceConnectionStatus.REJECTED, model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("acctazakljla", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("cr", model.privateLinkServiceConnectionState().actionsRequired());
    }
}
