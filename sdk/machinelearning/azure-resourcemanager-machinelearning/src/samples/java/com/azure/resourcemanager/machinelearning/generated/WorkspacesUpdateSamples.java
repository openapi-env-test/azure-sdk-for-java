// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.models.PublicNetworkAccess;
import com.azure.resourcemanager.machinelearning.models.Workspace;

/** Samples for Workspaces Update. */
public final class WorkspacesUpdateSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-06-01-preview/examples/Workspace/update.json
     */
    /**
     * Sample code: Update Workspace.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void updateWorkspace(com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        Workspace resource =
            manager
                .workspaces()
                .getByResourceGroupWithResponse("workspace-1234", "testworkspace", Context.NONE)
                .getValue();
        resource
            .update()
            .withDescription("new description")
            .withFriendlyName("New friendly name")
            .withPublicNetworkAccess(PublicNetworkAccess.DISABLED)
            .apply();
    }
}
