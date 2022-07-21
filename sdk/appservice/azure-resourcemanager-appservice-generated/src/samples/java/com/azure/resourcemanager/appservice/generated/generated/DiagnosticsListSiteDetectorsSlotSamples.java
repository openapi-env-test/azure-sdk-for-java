// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

import com.azure.core.util.Context;

/** Samples for Diagnostics ListSiteDetectorsSlot. */
public final class DiagnosticsListSiteDetectorsSlotSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/Diagnostics_ListSiteDetectors.json
     */
    /**
     * Sample code: List App Detectors.
     *
     * @param manager Entry point to AppServiceManager.
     */
    public static void listAppDetectors(com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager
            .diagnostics()
            .listSiteDetectorsSlot(
                "Sample-WestUSResourceGroup", "SampleApp", "availability", "Production", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/Diagnostics_ListSiteDetectorsSlot.json
     */
    /**
     * Sample code: List App Slot Detectors.
     *
     * @param manager Entry point to AppServiceManager.
     */
    public static void listAppSlotDetectors(com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager
            .diagnostics()
            .listSiteDetectorsSlot("Sample-WestUSResourceGroup", "SampleApp", "availability", "staging", Context.NONE);
    }
}
