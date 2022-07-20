// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for DatabaseAccounts Delete. */
public final class DatabaseAccountsDeleteSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2022-07-15/examples/CosmosDBDatabaseAccountDelete.json
     */
    /**
     * Sample code: CosmosDBDatabaseAccountDelete.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBDatabaseAccountDelete(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.databaseAccounts().delete("rg1", "ddb1", Context.NONE);
    }
}
