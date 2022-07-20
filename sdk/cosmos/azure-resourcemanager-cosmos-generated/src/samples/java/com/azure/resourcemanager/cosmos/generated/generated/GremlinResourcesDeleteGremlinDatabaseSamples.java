// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for GremlinResources DeleteGremlinDatabase. */
public final class GremlinResourcesDeleteGremlinDatabaseSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2022-07-15/examples/CosmosDBGremlinDatabaseDelete.json
     */
    /**
     * Sample code: CosmosDBGremlinDatabaseDelete.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBGremlinDatabaseDelete(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.gremlinResources().deleteGremlinDatabase("rg1", "ddb1", "databaseName", Context.NONE);
    }
}
