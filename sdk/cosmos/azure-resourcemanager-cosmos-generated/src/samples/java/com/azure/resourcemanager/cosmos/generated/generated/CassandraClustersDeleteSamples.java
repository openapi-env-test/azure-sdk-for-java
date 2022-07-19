// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for CassandraClusters Delete. */
public final class CassandraClustersDeleteSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2022-05-15-preview/examples/CosmosDBManagedCassandraClusterDelete.json
     */
    /**
     * Sample code: CosmosDBManagedCassandraClusterDelete.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBManagedCassandraClusterDelete(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.cassandraClusters().delete("cassandra-prod-rg", "cassandra-prod", Context.NONE);
    }
}
