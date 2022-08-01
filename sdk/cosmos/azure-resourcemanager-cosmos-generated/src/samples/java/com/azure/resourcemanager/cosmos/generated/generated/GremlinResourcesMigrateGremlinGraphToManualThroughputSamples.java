// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for GremlinResources MigrateGremlinGraphToManualThroughput. */
public final class GremlinResourcesMigrateGremlinGraphToManualThroughputSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2022-05-15-preview/examples/CosmosDBGremlinGraphMigrateToManualThroughput.json
     */
    /**
     * Sample code: CosmosDBGremlinGraphMigrateToManualThroughput.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBGremlinGraphMigrateToManualThroughput(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager
            .gremlinResources()
            .migrateGremlinGraphToManualThroughput("rg1", "ddb1", "databaseName", "graphName", Context.NONE);
    }
}
