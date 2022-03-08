// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for CassandraDataCenters Delete. */
public final class CassandraDataCentersDeleteSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2021-11-15-preview/examples/CosmosDBManagedCassandraDataCenterDelete.json
     */
    /**
     * Sample code: CosmosDBManagedCassandraDataCenterDelete.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBManagedCassandraDataCenterDelete(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.cassandraDataCenters().delete("cassandra-prod-rg", "cassandra-prod", "dc1", Context.NONE);
    }
}
