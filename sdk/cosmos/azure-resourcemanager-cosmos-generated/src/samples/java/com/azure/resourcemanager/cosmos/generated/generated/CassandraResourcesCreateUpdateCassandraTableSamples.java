// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.resourcemanager.cosmos.generated.models.CassandraPartitionKey;
import com.azure.resourcemanager.cosmos.generated.models.CassandraSchema;
import com.azure.resourcemanager.cosmos.generated.models.CassandraTableResource;
import com.azure.resourcemanager.cosmos.generated.models.ClusterKey;
import com.azure.resourcemanager.cosmos.generated.models.Column;
import com.azure.resourcemanager.cosmos.generated.models.CreateUpdateOptions;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for CassandraResources CreateUpdateCassandraTable. */
public final class CassandraResourcesCreateUpdateCassandraTableSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2022-07-15/examples/CosmosDBCassandraTableCreateUpdate.json
     */
    /**
     * Sample code: CosmosDBCassandraTableCreateUpdate.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBCassandraTableCreateUpdate(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager
            .cassandraResources()
            .defineUpdateCassandraTable("tableName")
            .withRegion("West US")
            .withExistingCassandraKeyspace("rg1", "ddb1", "keyspaceName")
            .withResource(
                new CassandraTableResource()
                    .withId("tableName")
                    .withDefaultTtl(100)
                    .withSchema(
                        new CassandraSchema()
                            .withColumns(Arrays.asList(new Column().withName("columnA").withType("Ascii")))
                            .withPartitionKeys(Arrays.asList(new CassandraPartitionKey().withName("columnA")))
                            .withClusterKeys(Arrays.asList(new ClusterKey().withName("columnA").withOrderBy("Asc")))))
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
