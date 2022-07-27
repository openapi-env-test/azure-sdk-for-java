// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.Context;

/** Samples for PrivateEndpointConnections Delete. */
public final class PrivateEndpointConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/postgresql/resource-manager/Microsoft.DBforPostgreSQL/stable/2018-06-01/examples/PrivateEndpointConnectionDelete.json
     */
    /**
     * Sample code: Deletes a private endpoint connection with a given name.
     *
     * @param manager Entry point to PostgreSqlManager.
     */
    public static void deletesAPrivateEndpointConnectionWithAGivenName(
        com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager) {
        manager
            .privateEndpointConnections()
            .delete("Default", "test-svr", "private-endpoint-connection-name", Context.NONE);
    }
}
