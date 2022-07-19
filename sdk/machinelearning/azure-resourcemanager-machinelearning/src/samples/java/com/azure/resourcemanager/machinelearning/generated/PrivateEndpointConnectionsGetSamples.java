// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.Context;

/** Samples for PrivateEndpointConnections Get. */
public final class PrivateEndpointConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-06-01-preview/examples/PrivateEndpointConnection/get.json
     */
    /**
     * Sample code: WorkspaceGetPrivateEndpointConnection.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void workspaceGetPrivateEndpointConnection(
        com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager
            .privateEndpointConnections()
            .getWithResponse("rg-1234", "testworkspace", "{privateEndpointConnectionName}", Context.NONE);
    }
}
