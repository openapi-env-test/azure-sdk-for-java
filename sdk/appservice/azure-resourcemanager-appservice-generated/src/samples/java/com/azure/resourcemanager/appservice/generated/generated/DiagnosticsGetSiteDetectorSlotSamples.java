// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

import com.azure.core.util.Context;

/** Samples for Diagnostics GetSiteDetectorSlot. */
public final class DiagnosticsGetSiteDetectorSlotSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/Diagnostics_GetSiteDetector.json
     */
    /**
     * Sample code: Get App Detector.
     *
     * @param manager Entry point to AppServiceManager.
     */
    public static void getAppDetector(com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager
            .diagnostics()
            .getSiteDetectorSlotWithResponse(
                "Sample-WestUSResourceGroup", "SampleApp", "availability", "sitecrashes", "Production", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/Diagnostics_GetSiteDetectorSlot.json
     */
    /**
     * Sample code: Get App Slot Detector.
     *
     * @param manager Entry point to AppServiceManager.
     */
    public static void getAppSlotDetector(com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager
            .diagnostics()
            .getSiteDetectorSlotWithResponse(
                "Sample-WestUSResourceGroup", "SampleApp", "availability", "sitecrashes", "staging", Context.NONE);
    }
}
