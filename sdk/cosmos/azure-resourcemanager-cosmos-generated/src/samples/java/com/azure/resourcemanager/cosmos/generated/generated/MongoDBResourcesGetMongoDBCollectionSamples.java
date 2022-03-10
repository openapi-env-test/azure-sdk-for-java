// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for MongoDBResources GetMongoDBCollection. */
public final class MongoDBResourcesGetMongoDBCollectionSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2021-11-15-preview/examples/CosmosDBMongoDBCollectionGet.json
     */
    /**
     * Sample code: CosmosDBMongoDBCollectionGet.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBMongoDBCollectionGet(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager
            .mongoDBResources()
            .getMongoDBCollectionWithResponse("rgName", "ddb1", "databaseName", "collectionName", Context.NONE);
    }
}
