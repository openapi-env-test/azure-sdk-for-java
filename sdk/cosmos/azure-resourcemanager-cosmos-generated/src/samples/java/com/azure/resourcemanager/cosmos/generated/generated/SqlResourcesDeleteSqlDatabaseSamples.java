// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for SqlResources DeleteSqlDatabase. */
public final class SqlResourcesDeleteSqlDatabaseSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2021-11-15-preview/examples/CosmosDBSqlDatabaseDelete.json
     */
    /**
     * Sample code: CosmosDBSqlDatabaseDelete.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBSqlDatabaseDelete(com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.sqlResources().deleteSqlDatabase("rg1", "ddb1", "databaseName", Context.NONE);
    }
}
