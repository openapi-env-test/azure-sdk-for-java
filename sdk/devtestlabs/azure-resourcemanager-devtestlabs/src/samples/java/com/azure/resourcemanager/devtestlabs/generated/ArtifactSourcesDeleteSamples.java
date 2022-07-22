// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.Context;

/** Samples for ArtifactSources Delete. */
public final class ArtifactSourcesDeleteSamples {
    /*
     * x-ms-original-file: specification/devtestlabs/resource-manager/Microsoft.DevTestLab/stable/2021-09-01/examples/ArtifactSources_Delete.json
     */
    /**
     * Sample code: ArtifactSources_Delete.
     *
     * @param manager Entry point to DevTestLabsManager.
     */
    public static void artifactSourcesDelete(com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager) {
        manager
            .artifactSources()
            .deleteWithResponse("resourceGroupName", "{labName}", "{artifactSourceName}", Context.NONE);
    }
}
