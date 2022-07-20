// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for RestorableSqlDatabases List. */
public final class RestorableSqlDatabasesListSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2022-07-15-preview/examples/CosmosDBRestorableSqlDatabaseList.json
     */
    /**
     * Sample code: CosmosDBRestorableSqlDatabaseList.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBRestorableSqlDatabaseList(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.restorableSqlDatabases().list("WestUS", "d9b26648-2f53-4541-b3d8-3044f4f9810d", Context.NONE);
    }
}
