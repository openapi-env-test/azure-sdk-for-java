// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for CassandraClusters Deallocate. */
public final class CassandraClustersDeallocateSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2021-11-15-preview/examples/CosmosDBManagedCassandraClusterDeallocate.json
     */
    /**
     * Sample code: CosmosDBManagedCassandraClusterDeallocate.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBManagedCassandraClusterDeallocate(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.cassandraClusters().deallocate("cassandra-prod-rg", "cassandra-prod", Context.NONE);
    }
}
