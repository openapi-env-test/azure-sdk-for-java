// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.Context;

/** Samples for Metadata List. */
public final class MetadataListSamples {
    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-11-01-preview/examples/metadata/GetAllMetadata.json
     */
    /**
     * Sample code: Get all metadata.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAllMetadata(com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager.metadatas().list("myRg", "myWorkspace", null, null, null, null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-11-01-preview/examples/metadata/GetAllMetadataOData.json
     */
    /**
     * Sample code: Get all metadata with OData filter/orderby/skip/top.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAllMetadataWithODataFilterOrderbySkipTop(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager.metadatas().list("myRg", "myWorkspace", null, null, null, null, Context.NONE);
    }
}
