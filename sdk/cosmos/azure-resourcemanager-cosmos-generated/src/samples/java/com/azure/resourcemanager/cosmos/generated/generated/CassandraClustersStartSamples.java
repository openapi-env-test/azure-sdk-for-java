// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for CassandraClusters Start. */
public final class CassandraClustersStartSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2022-07-15-preview/examples/CosmosDBManagedCassandraClusterStart.json
     */
    /**
     * Sample code: CosmosDBManagedCassandraClusterStart.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBManagedCassandraClusterStart(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.cassandraClusters().start("cassandra-prod-rg", "cassandra-prod", Context.NONE);
    }
}
