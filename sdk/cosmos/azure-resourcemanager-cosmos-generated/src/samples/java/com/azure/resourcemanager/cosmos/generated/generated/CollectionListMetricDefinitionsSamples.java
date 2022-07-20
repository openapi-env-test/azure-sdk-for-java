// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for Collection ListMetricDefinitions. */
public final class CollectionListMetricDefinitionsSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2022-07-15/examples/CosmosDBCollectionGetMetricDefinitions.json
     */
    /**
     * Sample code: CosmosDBCollectionGetMetricDefinitions.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBCollectionGetMetricDefinitions(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.collections().listMetricDefinitions("rg1", "ddb1", "databaseRid", "collectionRid", Context.NONE);
    }
}
