// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.resourcemanager.cosmos.generated.models.CreateUpdateOptions;
import com.azure.resourcemanager.cosmos.generated.models.TableResource;
import java.util.HashMap;
import java.util.Map;

/** Samples for TableResources CreateUpdateTable. */
public final class TableResourcesCreateUpdateTableSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2022-05-15-preview/examples/CosmosDBTableCreateUpdate.json
     */
    /**
     * Sample code: CosmosDBTableReplace.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBTableReplace(com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager
            .tableResources()
            .define("tableName")
            .withRegion("West US")
            .withExistingDatabaseAccount("rg1", "ddb1")
            .withResource(new TableResource().withId("tableName"))
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
