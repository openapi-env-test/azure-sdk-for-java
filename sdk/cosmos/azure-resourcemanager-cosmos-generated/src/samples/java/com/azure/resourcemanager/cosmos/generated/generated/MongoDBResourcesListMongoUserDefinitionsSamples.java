// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for MongoDBResources ListMongoUserDefinitions. */
public final class MongoDBResourcesListMongoUserDefinitionsSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2021-11-15-preview/examples/CosmosDBMongoDBUserDefinitionList.json
     */
    /**
     * Sample code: CosmosDBMongoDBUserDefinitionList.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBMongoDBUserDefinitionList(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.mongoDBResources().listMongoUserDefinitions("myResourceGroupName", "myAccountName", Context.NONE);
    }
}
