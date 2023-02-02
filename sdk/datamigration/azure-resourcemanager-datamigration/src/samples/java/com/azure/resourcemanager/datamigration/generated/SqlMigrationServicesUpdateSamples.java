// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.datamigration.models.SqlMigrationService;
import java.util.HashMap;
import java.util.Map;

/** Samples for SqlMigrationServices Update. */
public final class SqlMigrationServicesUpdateSamples {
    /*
     * x-ms-original-file: specification/datamigration/resource-manager/Microsoft.DataMigration/preview/2022-03-30-preview/examples/UpdateMigrationService.json
     */
    /**
     * Sample code: Update SQL Migration Service.
     *
     * @param manager Entry point to DataMigrationManager.
     */
    public static void updateSQLMigrationService(com.azure.resourcemanager.datamigration.DataMigrationManager manager) {
        SqlMigrationService resource =
            manager
                .sqlMigrationServices()
                .getByResourceGroupWithResponse("testrg", "testagent", Context.NONE)
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
