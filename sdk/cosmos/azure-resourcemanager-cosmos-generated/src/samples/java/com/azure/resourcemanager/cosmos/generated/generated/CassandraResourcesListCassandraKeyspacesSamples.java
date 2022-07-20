// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for CassandraResources ListCassandraKeyspaces. */
public final class CassandraResourcesListCassandraKeyspacesSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2022-07-15/examples/CosmosDBCassandraKeyspaceList.json
     */
    /**
     * Sample code: CosmosDBCassandraKeyspaceList.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBCassandraKeyspaceList(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.cassandraResources().listCassandraKeyspaces("rgName", "ddb1", Context.NONE);
    }
}
