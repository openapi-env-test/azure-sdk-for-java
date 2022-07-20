// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for CollectionPartitionRegion ListMetrics. */
public final class CollectionPartitionRegionListMetricsSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2022-07-15/examples/CosmosDBCollectionPartitionRegionGetMetrics.json
     */
    /**
     * Sample code: CosmosDBDatabaseAccountRegionGetMetrics.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBDatabaseAccountRegionGetMetrics(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager
            .collectionPartitionRegions()
            .listMetrics(
                "rg1",
                "ddb1",
                "North Europe",
                "databaseRid",
                "collectionRid",
                "$filter=(name.value eq 'Max RUs Per Second') and timeGrain eq duration'PT1M' and startTime eq"
                    + " '2017-11-19T23:53:55.2780000Z' and endTime eq '2017-11-20T23:58:55.2780000Z",
                Context.NONE);
    }
}
