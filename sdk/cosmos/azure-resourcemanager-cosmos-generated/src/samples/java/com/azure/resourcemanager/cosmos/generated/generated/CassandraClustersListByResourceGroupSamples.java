// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for CassandraClusters ListByResourceGroup. */
public final class CassandraClustersListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2022-07-15-preview/examples/CosmosDBManagedCassandraClusterListByResourceGroup.json
     */
    /**
     * Sample code: CosmosDBManagedCassandraClusterListByResourceGroup.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBManagedCassandraClusterListByResourceGroup(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.cassandraClusters().listByResourceGroup("cassandra-prod-rg", Context.NONE);
    }
}
