// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for MongoDBResources MigrateMongoDBDatabaseToManualThroughput. */
public final class MongoDBResourcesMigrateMongoDBDatabaseToManualThroughputSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2022-07-15/examples/CosmosDBMongoDBDatabaseMigrateToManualThroughput.json
     */
    /**
     * Sample code: CosmosDBMongoDBDatabaseMigrateToManualThroughput.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBMongoDBDatabaseMigrateToManualThroughput(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager
            .mongoDBResources()
            .migrateMongoDBDatabaseToManualThroughput("rg1", "ddb1", "databaseName", Context.NONE);
    }
}
