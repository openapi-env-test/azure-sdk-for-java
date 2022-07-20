// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for SqlResources MigrateSqlDatabaseToAutoscale. */
public final class SqlResourcesMigrateSqlDatabaseToAutoscaleSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2022-07-15-preview/examples/CosmosDBSqlDatabaseMigrateToAutoscale.json
     */
    /**
     * Sample code: CosmosDBSqlDatabaseMigrateToAutoscale.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBSqlDatabaseMigrateToAutoscale(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.sqlResources().migrateSqlDatabaseToAutoscale("rg1", "ddb1", "databaseName", Context.NONE);
    }
}
