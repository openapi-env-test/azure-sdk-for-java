// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.cosmos.generated.models.NotebookWorkspaceName;

/** Samples for NotebookWorkspaces RegenerateAuthToken. */
public final class NotebookWorkspacesRegenerateAuthTokenSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2021-11-15-preview/examples/CosmosDBNotebookWorkspaceRegenerateAuthToken.json
     */
    /**
     * Sample code: CosmosDBNotebookWorkspaceRegenerateAuthToken.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBNotebookWorkspaceRegenerateAuthToken(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.notebookWorkspaces().regenerateAuthToken("rg1", "ddb1", NotebookWorkspaceName.DEFAULT, Context.NONE);
    }
}
