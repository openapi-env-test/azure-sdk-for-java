// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for SqlResources GetSqlDatabase. */
public final class SqlResourcesGetSqlDatabaseSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2021-11-15-preview/examples/CosmosDBSqlDatabaseGet.json
     */
    /**
     * Sample code: CosmosDBSqlDatabaseGet.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBSqlDatabaseGet(com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.sqlResources().getSqlDatabaseWithResponse("rg1", "ddb1", "databaseName", Context.NONE);
    }
}
