// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for SqlResources ListSqlRoleAssignments. */
public final class SqlResourcesListSqlRoleAssignmentsSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2022-07-15/examples/CosmosDBSqlRoleAssignmentList.json
     */
    /**
     * Sample code: CosmosDBSqlRoleAssignmentList.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBSqlRoleAssignmentList(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.sqlResources().listSqlRoleAssignments("myResourceGroupName", "myAccountName", Context.NONE);
    }
}
