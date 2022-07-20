// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for MongoDBResources MigrateMongoDBCollectionToManualThroughput. */
public final class MongoDBResourcesMigrateMongoDBCollectionToManualThroughputSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2022-07-15/examples/CosmosDBMongoDBCollectionMigrateToManualThroughput.json
     */
    /**
     * Sample code: CosmosDBMongoDBCollectionMigrateToManualThroughput.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBMongoDBCollectionMigrateToManualThroughput(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager
            .mongoDBResources()
            .migrateMongoDBCollectionToManualThroughput("rg1", "ddb1", "databaseName", "collectionName", Context.NONE);
    }
}
