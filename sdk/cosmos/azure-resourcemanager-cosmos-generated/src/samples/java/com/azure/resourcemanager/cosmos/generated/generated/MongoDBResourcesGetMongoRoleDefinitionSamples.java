// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for MongoDBResources GetMongoRoleDefinition. */
public final class MongoDBResourcesGetMongoRoleDefinitionSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2022-07-15/examples/CosmosDBMongoDBRoleDefinitionGet.json
     */
    /**
     * Sample code: CosmosDBMongoRoleDefinitionGet.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBMongoRoleDefinitionGet(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager
            .mongoDBResources()
            .getMongoRoleDefinitionWithResponse(
                "myMongoRoleDefinitionId", "myResourceGroupName", "myAccountName", Context.NONE);
    }
}
