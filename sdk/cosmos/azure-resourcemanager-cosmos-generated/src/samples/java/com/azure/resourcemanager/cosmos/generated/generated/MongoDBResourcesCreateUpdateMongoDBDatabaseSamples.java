// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.resourcemanager.cosmos.generated.models.CreateUpdateOptions;
import com.azure.resourcemanager.cosmos.generated.models.MongoDBDatabaseResource;
import java.util.HashMap;
import java.util.Map;

/** Samples for MongoDBResources CreateUpdateMongoDBDatabase. */
public final class MongoDBResourcesCreateUpdateMongoDBDatabaseSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2022-07-15-preview/examples/CosmosDBMongoDBDatabaseCreateUpdate.json
     */
    /**
     * Sample code: CosmosDBMongoDBDatabaseCreateUpdate.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBMongoDBDatabaseCreateUpdate(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager
            .mongoDBResources()
            .defineUpdateMongoDBDatabase("databaseName")
            .withRegion("West US")
            .withExistingDatabaseAccount("rg1", "ddb1")
            .withResource(new MongoDBDatabaseResource().withId("databaseName"))
            .withTags(mapOf())
            .withOptions(new CreateUpdateOptions())
            .create();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
