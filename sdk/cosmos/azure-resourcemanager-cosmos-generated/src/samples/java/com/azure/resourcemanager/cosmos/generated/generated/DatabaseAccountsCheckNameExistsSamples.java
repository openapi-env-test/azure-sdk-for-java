// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for DatabaseAccounts CheckNameExists. */
public final class DatabaseAccountsCheckNameExistsSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2022-07-15-preview/examples/CosmosDBDatabaseAccountCheckNameExists.json
     */
    /**
     * Sample code: CosmosDBDatabaseAccountCheckNameExists.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBDatabaseAccountCheckNameExists(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.databaseAccounts().checkNameExistsWithResponse("ddb1", Context.NONE);
    }
}
