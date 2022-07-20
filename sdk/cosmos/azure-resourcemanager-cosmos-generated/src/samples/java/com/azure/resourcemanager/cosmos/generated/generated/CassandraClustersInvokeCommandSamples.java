// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.cosmos.generated.models.CommandPostBody;
import java.util.HashMap;
import java.util.Map;

/** Samples for CassandraClusters InvokeCommand. */
public final class CassandraClustersInvokeCommandSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2022-07-15-preview/examples/CosmosDBManagedCassandraCommand.json
     */
    /**
     * Sample code: CosmosDBManagedCassandraCommand.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBManagedCassandraCommand(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager
            .cassandraClusters()
            .invokeCommand(
                "cassandra-prod-rg",
                "cassandra-prod",
                new CommandPostBody().withCommand("nodetool").withArguments(mapOf("status", "")).withHost("10.0.1.12"),
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
