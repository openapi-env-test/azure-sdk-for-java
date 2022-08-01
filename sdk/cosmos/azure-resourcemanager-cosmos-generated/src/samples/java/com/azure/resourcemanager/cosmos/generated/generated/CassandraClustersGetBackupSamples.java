// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for CassandraClusters GetBackup. */
public final class CassandraClustersGetBackupSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2022-05-15-preview/examples/CosmosDBManagedCassandraBackup.json
     */
    /**
     * Sample code: CosmosDBManagedCassandraBackup.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBManagedCassandraBackup(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager
            .cassandraClusters()
            .getBackupWithResponse("cassandra-prod-rg", "cassandra-prod", "1611250348", Context.NONE);
    }
}
