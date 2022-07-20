// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for SqlResources DeleteSqlTrigger. */
public final class SqlResourcesDeleteSqlTriggerSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2022-07-15-preview/examples/CosmosDBSqlTriggerDelete.json
     */
    /**
     * Sample code: CosmosDBSqlTriggerDelete.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBSqlTriggerDelete(com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager
            .sqlResources()
            .deleteSqlTrigger("rg1", "ddb1", "databaseName", "containerName", "triggerName", Context.NONE);
    }
}
