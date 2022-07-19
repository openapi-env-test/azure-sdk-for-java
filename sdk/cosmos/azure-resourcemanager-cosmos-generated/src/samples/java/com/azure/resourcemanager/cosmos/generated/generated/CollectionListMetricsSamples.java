// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for Collection ListMetrics. */
public final class CollectionListMetricsSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2022-05-15-preview/examples/CosmosDBCollectionGetMetrics.json
     */
    /**
     * Sample code: CosmosDBCollectionGetMetrics.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBCollectionGetMetrics(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager
            .collections()
            .listMetrics(
                "rg1",
                "ddb1",
                "databaseRid",
                "collectionRid",
                "$filter=(name.value eq 'Total Requests') and timeGrain eq duration'PT5M' and startTime eq"
                    + " '2017-11-19T23:53:55.2780000Z' and endTime eq '2017-11-20T00:13:55.2780000Z",
                Context.NONE);
    }
}
