// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.Context;

/** Samples for Metadata Get. */
public final class MetadataGetSamples {
    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-11-01-preview/examples/metadata/GetMetadata.json
     */
    /**
     * Sample code: Get single metadata by name.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getSingleMetadataByName(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager.metadatas().getWithResponse("myRg", "myWorkspace", "metadataName", Context.NONE);
    }
}
