// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.Context;

/** Samples for Artifacts List. */
public final class ArtifactsListSamples {
    /*
     * x-ms-original-file: specification/devtestlabs/resource-manager/Microsoft.DevTestLab/stable/2021-09-01/examples/Artifacts_List.json
     */
    /**
     * Sample code: Artifacts_List.
     *
     * @param manager Entry point to DevTestLabsManager.
     */
    public static void artifactsList(com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager) {
        manager
            .artifacts()
            .list("resourceGroupName", "{labName}", "{artifactSourceName}", null, null, null, null, Context.NONE);
    }
}
