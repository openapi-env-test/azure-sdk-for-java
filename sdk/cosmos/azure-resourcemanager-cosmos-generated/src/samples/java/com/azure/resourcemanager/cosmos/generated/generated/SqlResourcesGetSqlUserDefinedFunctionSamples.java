// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for SqlResources GetSqlUserDefinedFunction. */
public final class SqlResourcesGetSqlUserDefinedFunctionSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2022-05-15-preview/examples/CosmosDBSqlUserDefinedFunctionGet.json
     */
    /**
     * Sample code: CosmosDBSqlUserDefinedFunctionGet.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBSqlUserDefinedFunctionGet(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager
            .sqlResources()
            .getSqlUserDefinedFunctionWithResponse(
                "rgName", "ddb1", "databaseName", "containerName", "userDefinedFunctionName", Context.NONE);
    }
}
