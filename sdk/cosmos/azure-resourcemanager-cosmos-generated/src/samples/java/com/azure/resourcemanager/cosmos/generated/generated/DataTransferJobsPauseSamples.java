// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for DataTransferJobs Pause. */
public final class DataTransferJobsPauseSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2022-05-15-preview/examples/data-transfer-service/CosmosDBDataTransferJobPause.json
     */
    /**
     * Sample code: CosmosDBDataTransferJobPause.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBDataTransferJobPause(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.dataTransferJobs().pauseWithResponse("rg1", "ddb1", "j1", Context.NONE);
    }
}
