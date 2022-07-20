// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for TableResources MigrateTableToAutoscale. */
public final class TableResourcesMigrateTableToAutoscaleSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2022-07-15-preview/examples/CosmosDBTableMigrateToAutoscale.json
     */
    /**
     * Sample code: CosmosDBTableMigrateToAutoscale.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBTableMigrateToAutoscale(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.tableResources().migrateTableToAutoscale("rg1", "ddb1", "tableName", Context.NONE);
    }
}
