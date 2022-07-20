// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for DatabaseAccounts ListConnectionStrings. */
public final class DatabaseAccountsListConnectionStringsSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2022-07-15-preview/examples/CosmosDBDatabaseAccountListConnectionStrings.json
     */
    /**
     * Sample code: CosmosDBDatabaseAccountListConnectionStrings.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBDatabaseAccountListConnectionStrings(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.databaseAccounts().listConnectionStringsWithResponse("rg1", "ddb1", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2022-07-15-preview/examples/CosmosDBDatabaseAccountListConnectionStringsMongo.json
     */
    /**
     * Sample code: CosmosDBDatabaseAccountListConnectionStringsMongo.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBDatabaseAccountListConnectionStringsMongo(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.databaseAccounts().listConnectionStringsWithResponse("rg1", "mongo-ddb1", Context.NONE);
    }
}
