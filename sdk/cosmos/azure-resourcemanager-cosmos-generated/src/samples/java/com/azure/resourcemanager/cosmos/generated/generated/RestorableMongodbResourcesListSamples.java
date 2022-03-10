// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for RestorableMongodbResources List. */
public final class RestorableMongodbResourcesListSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2021-11-15-preview/examples/CosmosDBRestorableMongodbResourceList.json
     */
    /**
     * Sample code: CosmosDBRestorableMongodbResourceList.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBRestorableMongodbResourceList(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager
            .restorableMongodbResources()
            .list("WestUS", "d9b26648-2f53-4541-b3d8-3044f4f9810d", "WestUS", "10/13/2020 4:56", Context.NONE);
    }
}
