// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

/** Samples for SqlResources CreateUpdateSqlRoleAssignment. */
public final class SqlResourcesCreateUpdateSqlRoleAssignmentSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2022-07-15/examples/CosmosDBSqlRoleAssignmentCreateUpdate.json
     */
    /**
     * Sample code: CosmosDBSqlRoleAssignmentCreateUpdate.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBSqlRoleAssignmentCreateUpdate(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager
            .sqlResources()
            .defineUpdateSqlRoleAssignment("myRoleAssignmentId")
            .withExistingDatabaseAccount("myResourceGroupName", "myAccountName")
            .withRoleDefinitionId(
                "/subscriptions/mySubscriptionId/resourceGroups/myResourceGroupName/providers/Microsoft.DocumentDB/databaseAccounts/myAccountName/sqlRoleDefinitions/myRoleDefinitionId")
            .withScope(
                "/subscriptions/mySubscriptionId/resourceGroups/myResourceGroupName/providers/Microsoft.DocumentDB/databaseAccounts/myAccountName/dbs/purchases/colls/redmond-purchases")
            .withPrincipalId("myPrincipalId")
            .create();
    }
}
