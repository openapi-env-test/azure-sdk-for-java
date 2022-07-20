// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for SqlResources GetSqlTrigger. */
public final class SqlResourcesGetSqlTriggerSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2022-05-15-preview/examples/CosmosDBSqlTriggerGet.json
     */
    /**
     * Sample code: CosmosDBSqlTriggerGet.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBSqlTriggerGet(com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager
            .sqlResources()
            .getSqlTriggerWithResponse("rgName", "ddb1", "databaseName", "containerName", "triggerName", Context.NONE);
    }
}
