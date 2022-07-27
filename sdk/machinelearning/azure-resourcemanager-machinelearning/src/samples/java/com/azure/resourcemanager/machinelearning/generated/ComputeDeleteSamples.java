// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.models.UnderlyingResourceAction;

/** Samples for Compute Delete. */
public final class ComputeDeleteSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-06-01-preview/examples/Compute/delete.json
     */
    /**
     * Sample code: Delete Compute.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void deleteCompute(com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager
            .computes()
            .delete("testrg123", "workspaces123", "compute123", UnderlyingResourceAction.DELETE, Context.NONE);
    }
}
