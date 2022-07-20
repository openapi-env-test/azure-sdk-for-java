// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for GremlinResources MigrateGremlinDatabaseToAutoscale. */
public final class GremlinResourcesMigrateGremlinDatabaseToAutoscaleSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2022-07-15/examples/CosmosDBGremlinDatabaseMigrateToAutoscale.json
     */
    /**
     * Sample code: CosmosDBGremlinDatabaseMigrateToAutoscale.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBGremlinDatabaseMigrateToAutoscale(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.gremlinResources().migrateGremlinDatabaseToAutoscale("rg1", "ddb1", "databaseName", Context.NONE);
    }
}
