// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/** Samples for Diagnostics GetSiteDetectorResponse. */
public final class DiagnosticsGetSiteDetectorResponseSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-09-01/examples/Diagnostics_GetSiteDetectorResponseSlot.json
     */
    /**
     * Sample code: Get App Slot Detector Response.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAppSlotDetectorResponse(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getDiagnostics()
            .getSiteDetectorResponseWithResponse(
                "Sample-WestUSResourceGroup",
                "SampleApp",
                "runtimeavailability",
                null,
                null,
                null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-09-01/examples/Diagnostics_GetSiteDetectorResponse.json
     */
    /**
     * Sample code: Get App Detector Response.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAppDetectorResponse(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getDiagnostics()
            .getSiteDetectorResponseWithResponse(
                "Sample-WestUSResourceGroup",
                "SampleApp",
                "runtimeavailability",
                null,
                null,
                null,
                com.azure.core.util.Context.NONE);
    }
}
