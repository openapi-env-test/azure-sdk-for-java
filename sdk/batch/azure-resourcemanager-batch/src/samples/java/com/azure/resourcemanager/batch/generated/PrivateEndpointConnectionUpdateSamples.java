// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.batch.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.batch.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.batch.models.PrivateLinkServiceConnectionStatus;

/** Samples for PrivateEndpointConnection Update. */
public final class PrivateEndpointConnectionUpdateSamples {
    /*
     * x-ms-original-file: specification/batch/resource-manager/Microsoft.Batch/stable/2022-06-01/examples/PrivateEndpointConnectionUpdate.json
     */
    /**
     * Sample code: UpdatePrivateEndpointConnection.
     *
     * @param manager Entry point to BatchManager.
     */
    public static void updatePrivateEndpointConnection(com.azure.resourcemanager.batch.BatchManager manager) {
        manager
            .privateEndpointConnections()
            .update(
                "default-azurebatch-japaneast",
                "sampleacct",
                "testprivateEndpointConnection5.24d6b4b5-e65c-4330-bbe9-3a290d62f8e0",
                new PrivateEndpointConnectionInner()
                    .withPrivateLinkServiceConnectionState(
                        new PrivateLinkServiceConnectionState()
                            .withStatus(PrivateLinkServiceConnectionStatus.APPROVED)
                            .withDescription("Approved by xyz.abc@company.com")),
                null,
                Context.NONE);
    }
}
