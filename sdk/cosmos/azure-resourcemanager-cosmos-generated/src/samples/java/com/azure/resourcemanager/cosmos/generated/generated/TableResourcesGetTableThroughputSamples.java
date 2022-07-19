// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for TableResources GetTableThroughput. */
public final class TableResourcesGetTableThroughputSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2022-05-15-preview/examples/CosmosDBTableThroughputGet.json
     */
    /**
     * Sample code: CosmosDBTableThroughputGet.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBTableThroughputGet(com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.tableResources().getTableThroughputWithResponse("rg1", "ddb1", "tableName", Context.NONE);
    }
}
