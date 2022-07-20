// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for GremlinResources GetGremlinGraph. */
public final class GremlinResourcesGetGremlinGraphSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2022-05-15-preview/examples/CosmosDBGremlinGraphGet.json
     */
    /**
     * Sample code: CosmosDBGremlinGraphGet.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBGremlinGraphGet(com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager
            .gremlinResources()
            .getGremlinGraphWithResponse("rgName", "ddb1", "databaseName", "graphName", Context.NONE);
    }
}
