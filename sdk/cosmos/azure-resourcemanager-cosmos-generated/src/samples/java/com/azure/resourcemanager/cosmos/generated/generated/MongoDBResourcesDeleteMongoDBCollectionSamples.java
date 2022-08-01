// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for MongoDBResources DeleteMongoDBCollection. */
public final class MongoDBResourcesDeleteMongoDBCollectionSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2022-05-15-preview/examples/CosmosDBMongoDBCollectionDelete.json
     */
    /**
     * Sample code: CosmosDBMongoDBCollectionDelete.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBMongoDBCollectionDelete(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager
            .mongoDBResources()
            .deleteMongoDBCollection("rg1", "ddb1", "databaseName", "collectionName", Context.NONE);
    }
}
