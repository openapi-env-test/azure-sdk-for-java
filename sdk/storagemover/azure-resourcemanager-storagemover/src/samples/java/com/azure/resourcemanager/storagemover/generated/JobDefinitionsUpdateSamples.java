// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.storagemover.models.JobDefinition;

/** Samples for JobDefinitions Update. */
public final class JobDefinitionsUpdateSamples {
    /*
     * x-ms-original-file: specification/storagemover/resource-manager/Microsoft.StorageMover/preview/2022-07-01-preview/examples/JobDefinitions_Update.json
     */
    /**
     * Sample code: JobDefinitions_Update.
     *
     * @param manager Entry point to StorageMoverManager.
     */
    public static void jobDefinitionsUpdate(com.azure.resourcemanager.storagemover.StorageMoverManager manager) {
        JobDefinition resource =
            manager
                .jobDefinitions()
                .getWithResponse(
                    "examples-rg",
                    "examples-storageMoverName",
                    "examples-projectName",
                    "examples-jobDefinitionName",
                    Context.NONE)
                .getValue();
        resource
            .update()
            .withDescription("Updated Job Definition Description")
            .withAgentName("updatedAgentName")
            .apply();
    }
}
