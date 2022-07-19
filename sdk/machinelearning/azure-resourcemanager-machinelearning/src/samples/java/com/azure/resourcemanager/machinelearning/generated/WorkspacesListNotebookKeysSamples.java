// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.Context;

/** Samples for Workspaces ListNotebookKeys. */
public final class WorkspacesListNotebookKeysSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-06-01-preview/examples/Notebook/listKeys.json
     */
    /**
     * Sample code: List Workspace Keys.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void listWorkspaceKeys(com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager.workspaces().listNotebookKeysWithResponse("testrg123", "workspaces123", Context.NONE);
    }
}
