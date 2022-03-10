// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for RestorableDatabaseAccounts GetByLocation. */
public final class RestorableDatabaseAccountsGetByLocationSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2021-11-15-preview/examples/CosmosDBRestorableDatabaseAccountGet.json
     */
    /**
     * Sample code: CosmosDBRestorableDatabaseAccountGet.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBRestorableDatabaseAccountGet(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager
            .restorableDatabaseAccounts()
            .getByLocationWithResponse("West US", "d9b26648-2f53-4541-b3d8-3044f4f9810d", Context.NONE);
    }
}
