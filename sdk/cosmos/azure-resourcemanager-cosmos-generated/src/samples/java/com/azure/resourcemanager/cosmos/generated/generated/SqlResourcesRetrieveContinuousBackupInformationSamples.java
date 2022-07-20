// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.cosmos.generated.models.ContinuousBackupRestoreLocation;

/** Samples for SqlResources RetrieveContinuousBackupInformation. */
public final class SqlResourcesRetrieveContinuousBackupInformationSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2022-07-15/examples/CosmosDBSqlContainerBackupInformation.json
     */
    /**
     * Sample code: CosmosDBSqlContainerBackupInformation.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBSqlContainerBackupInformation(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager
            .sqlResources()
            .retrieveContinuousBackupInformation(
                "rgName",
                "ddb1",
                "databaseName",
                "containerName",
                new ContinuousBackupRestoreLocation().withLocation("North Europe"),
                Context.NONE);
    }
}
