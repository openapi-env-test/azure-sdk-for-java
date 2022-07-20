// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.cosmos.generated.models.ThroughputSettingsResource;
import com.azure.resourcemanager.cosmos.generated.models.ThroughputSettingsUpdateParameters;
import java.util.HashMap;
import java.util.Map;

/** Samples for SqlResources UpdateSqlDatabaseThroughput. */
public final class SqlResourcesUpdateSqlDatabaseThroughputSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2022-07-15/examples/CosmosDBSqlDatabaseThroughputUpdate.json
     */
    /**
     * Sample code: CosmosDBSqlDatabaseThroughputUpdate.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBSqlDatabaseThroughputUpdate(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager
            .sqlResources()
            .updateSqlDatabaseThroughput(
                "rg1",
                "ddb1",
                "databaseName",
                new ThroughputSettingsUpdateParameters()
                    .withLocation("West US")
                    .withTags(mapOf())
                    .withResource(new ThroughputSettingsResource().withThroughput(400)),
                Context.NONE);
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
