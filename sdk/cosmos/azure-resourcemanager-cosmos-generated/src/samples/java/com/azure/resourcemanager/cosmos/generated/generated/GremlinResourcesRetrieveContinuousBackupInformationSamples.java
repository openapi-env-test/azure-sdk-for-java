// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.cosmos.generated.models.ContinuousBackupRestoreLocation;

/** Samples for GremlinResources RetrieveContinuousBackupInformation. */
public final class GremlinResourcesRetrieveContinuousBackupInformationSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2022-07-15-preview/examples/CosmosDBGremlinGraphBackupInformation.json
     */
    /**
     * Sample code: CosmosDBGremlinGraphBackupInformation.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBGremlinGraphBackupInformation(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager
            .gremlinResources()
            .retrieveContinuousBackupInformation(
                "rgName",
                "ddb1",
                "databaseName",
                "graphName",
                new ContinuousBackupRestoreLocation().withLocation("North Europe"),
                Context.NONE);
    }
}
