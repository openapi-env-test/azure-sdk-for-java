// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for MongoDBResources ListMongoDBCollections. */
public final class MongoDBResourcesListMongoDBCollectionsSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2022-07-15-preview/examples/CosmosDBMongoDBCollectionList.json
     */
    /**
     * Sample code: CosmosDBMongoDBCollectionList.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBMongoDBCollectionList(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.mongoDBResources().listMongoDBCollections("rgName", "ddb1", "databaseName", Context.NONE);
    }
}
