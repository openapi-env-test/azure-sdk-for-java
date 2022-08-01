// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for CassandraResources GetCassandraTableThroughput. */
public final class CassandraResourcesGetCassandraTableThroughputSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2022-05-15-preview/examples/CosmosDBCassandraTableThroughputGet.json
     */
    /**
     * Sample code: CosmosDBCassandraTableThroughputGet.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBCassandraTableThroughputGet(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager
            .cassandraResources()
            .getCassandraTableThroughputWithResponse("rg1", "ddb1", "keyspaceName", "tableName", Context.NONE);
    }
}
