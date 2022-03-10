// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for SqlResources GetSqlRoleDefinition. */
public final class SqlResourcesGetSqlRoleDefinitionSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2021-11-15-preview/examples/CosmosDBSqlRoleDefinitionGet.json
     */
    /**
     * Sample code: CosmosDBSqlRoleDefinitionGet.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBSqlRoleDefinitionGet(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager
            .sqlResources()
            .getSqlRoleDefinitionWithResponse(
                "myRoleDefinitionId", "myResourceGroupName", "myAccountName", Context.NONE);
    }
}
