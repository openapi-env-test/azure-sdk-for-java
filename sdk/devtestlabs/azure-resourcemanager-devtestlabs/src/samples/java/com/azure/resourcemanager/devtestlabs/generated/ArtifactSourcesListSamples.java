// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.Context;

/** Samples for ArtifactSources List. */
public final class ArtifactSourcesListSamples {
    /*
     * x-ms-original-file: specification/devtestlabs/resource-manager/Microsoft.DevTestLab/stable/2021-09-01/examples/ArtifactSources_List.json
     */
    /**
     * Sample code: ArtifactSources_List.
     *
     * @param manager Entry point to DevTestLabsManager.
     */
    public static void artifactSourcesList(com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager) {
        manager.artifactSources().list("resourceGroupName", "{labName}", null, null, null, null, Context.NONE);
    }
}
