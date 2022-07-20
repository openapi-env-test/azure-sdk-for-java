// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for DatabaseAccountRegion ListMetrics. */
public final class DatabaseAccountRegionListMetricsSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2022-07-15/examples/CosmosDBDatabaseAccountRegionGetMetrics.json
     */
    /**
     * Sample code: CosmosDBDatabaseAccountRegionGetMetrics.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBDatabaseAccountRegionGetMetrics(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager
            .databaseAccountRegions()
            .listMetrics(
                "rg1",
                "ddb1",
                "North Europe",
                "$filter=(name.value eq 'Total Requests') and timeGrain eq duration'PT5M' and startTime eq"
                    + " '2017-11-19T23:53:55.2780000Z' and endTime eq '2017-11-20T00:13:55.2780000Z",
                Context.NONE);
    }
}
