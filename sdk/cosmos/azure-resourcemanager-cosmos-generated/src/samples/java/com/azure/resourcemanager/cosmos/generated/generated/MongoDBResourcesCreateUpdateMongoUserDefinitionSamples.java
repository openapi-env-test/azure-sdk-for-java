// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.resourcemanager.cosmos.generated.models.Role;
import java.util.Arrays;

/** Samples for MongoDBResources CreateUpdateMongoUserDefinition. */
public final class MongoDBResourcesCreateUpdateMongoUserDefinitionSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2022-07-15-preview/examples/CosmosDBMongoDBUserDefinitionCreateUpdate.json
     */
    /**
     * Sample code: CosmosDBMongoDBUserDefinitionCreateUpdate.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBMongoDBUserDefinitionCreateUpdate(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager
            .mongoDBResources()
            .defineUpdateMongoUserDefinition("myMongoUserDefinitionId")
            .withExistingDatabaseAccount("myResourceGroupName", "myAccountName")
            .withUsername("myUserName")
            .withPassword("myPassword")
            .withDatabaseName("sales")
            .withCustomData("My custom data")
            .withRoles(Arrays.asList(new Role().withDb("sales").withRole("myReadRole")))
            .withMechanisms("SCRAM-SHA-256")
            .create();
    }
}
