// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.cosmos.generated.models.RegionForOnlineOffline;

/** Samples for DatabaseAccounts OfflineRegion. */
public final class DatabaseAccountsOfflineRegionSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2022-05-15-preview/examples/CosmosDBDatabaseAccountOfflineRegion.json
     */
    /**
     * Sample code: CosmosDBDatabaseAccountOfflineRegion.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBDatabaseAccountOfflineRegion(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.databaseAccounts().offlineRegion("rg1", "ddb1", new RegionForOnlineOffline(), Context.NONE);
    }
}
