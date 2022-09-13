// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.azurearcdata.models.PostgresInstance;
import java.util.HashMap;
import java.util.Map;

/** Samples for PostgresInstances Update. */
public final class PostgresInstancesUpdateSamples {
    /*
     * x-ms-original-file: specification/azurearcdata/resource-manager/Microsoft.AzureArcData/preview/2022-03-01-preview/examples/UpdatePostgresInstance.json
     */
    /**
     * Sample code: Updates a postgres Instances tags.
     *
     * @param manager Entry point to AzureArcDataManager.
     */
    public static void updatesAPostgresInstancesTags(
        com.azure.resourcemanager.azurearcdata.AzureArcDataManager manager) {
        PostgresInstance resource =
            manager
                .postgresInstances()
                .getByResourceGroupWithResponse("testrg", "testpostgresInstance", Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("mytag", "myval")).apply();
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
