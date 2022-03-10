// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.resourcemanager.cosmos.generated.models.CreateUpdateOptions;
import com.azure.resourcemanager.cosmos.generated.models.SqlStoredProcedureResource;

/** Samples for SqlResources CreateUpdateSqlStoredProcedure. */
public final class SqlResourcesCreateUpdateSqlStoredProcedureSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2021-11-15-preview/examples/CosmosDBSqlStoredProcedureCreateUpdate.json
     */
    /**
     * Sample code: CosmosDBSqlStoredProcedureCreateUpdate.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBSqlStoredProcedureCreateUpdate(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager
            .sqlResources()
            .defineUpdateSqlStoredProcedure("storedProcedureName")
            .withRegion((String) null)
            .withExistingContainer("rg1", "ddb1", "databaseName", "containerName")
            .withResource(new SqlStoredProcedureResource().withId("storedProcedureName").withBody("body"))
            .withOptions(new CreateUpdateOptions())
            .create();
    }
}
