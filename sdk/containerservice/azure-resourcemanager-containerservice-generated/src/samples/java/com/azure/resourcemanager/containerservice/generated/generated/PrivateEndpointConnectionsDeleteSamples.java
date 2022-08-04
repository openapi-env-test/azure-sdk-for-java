// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.generated;

import com.azure.core.util.Context;

/** Samples for PrivateEndpointConnections Delete. */
public final class PrivateEndpointConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/preview/2022-07-02-preview/examples/PrivateEndpointConnectionsDelete.json
     */
    /**
     * Sample code: Delete Private Endpoint Connection.
     *
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void deletePrivateEndpointConnection(
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager) {
        manager.privateEndpointConnections().delete("rg1", "clustername1", "privateendpointconnection1", Context.NONE);
    }
}
