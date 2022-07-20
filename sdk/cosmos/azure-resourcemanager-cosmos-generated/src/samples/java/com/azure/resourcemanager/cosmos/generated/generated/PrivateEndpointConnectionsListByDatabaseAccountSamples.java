// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for PrivateEndpointConnections ListByDatabaseAccount. */
public final class PrivateEndpointConnectionsListByDatabaseAccountSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2022-05-15-preview/examples/CosmosDBPrivateEndpointConnectionListGet.json
     */
    /**
     * Sample code: Gets private endpoint connection.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void getsPrivateEndpointConnection(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.privateEndpointConnections().listByDatabaseAccount("rg1", "ddb1", Context.NONE);
    }
}
