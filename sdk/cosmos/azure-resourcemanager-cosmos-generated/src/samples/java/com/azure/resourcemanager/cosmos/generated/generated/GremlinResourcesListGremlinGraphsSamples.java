// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for GremlinResources ListGremlinGraphs. */
public final class GremlinResourcesListGremlinGraphsSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2022-07-15/examples/CosmosDBGremlinGraphList.json
     */
    /**
     * Sample code: CosmosDBGremlinGraphList.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBGremlinGraphList(com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.gremlinResources().listGremlinGraphs("rgName", "ddb1", "databaseName", Context.NONE);
    }
}
