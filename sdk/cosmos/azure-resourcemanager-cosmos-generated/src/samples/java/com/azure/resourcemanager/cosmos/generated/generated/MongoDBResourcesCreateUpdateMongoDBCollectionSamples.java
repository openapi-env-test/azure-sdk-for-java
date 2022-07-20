// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.resourcemanager.cosmos.generated.models.CreateUpdateOptions;
import com.azure.resourcemanager.cosmos.generated.models.MongoDBCollectionResource;
import com.azure.resourcemanager.cosmos.generated.models.MongoIndex;
import com.azure.resourcemanager.cosmos.generated.models.MongoIndexKeys;
import com.azure.resourcemanager.cosmos.generated.models.MongoIndexOptions;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for MongoDBResources CreateUpdateMongoDBCollection. */
public final class MongoDBResourcesCreateUpdateMongoDBCollectionSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2022-07-15/examples/CosmosDBMongoDBCollectionCreateUpdate.json
     */
    /**
     * Sample code: CosmosDBMongoDBCollectionCreateUpdate.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBMongoDBCollectionCreateUpdate(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager
            .mongoDBResources()
            .defineUpdateMongoDBCollection("collectionName")
            .withRegion("West US")
            .withExistingMongodbDatabase("rg1", "ddb1", "databaseName")
            .withResource(
                new MongoDBCollectionResource()
                    .withId("collectionName")
                    .withShardKey(mapOf("testKey", "Hash"))
                    .withIndexes(
                        Arrays
                            .asList(
                                new MongoIndex()
                                    .withKey(new MongoIndexKeys().withKeys(Arrays.asList("_ts")))
                                    .withOptions(new MongoIndexOptions().withExpireAfterSeconds(100).withUnique(true)),
                                new MongoIndex().withKey(new MongoIndexKeys().withKeys(Arrays.asList("_id"))))))
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
