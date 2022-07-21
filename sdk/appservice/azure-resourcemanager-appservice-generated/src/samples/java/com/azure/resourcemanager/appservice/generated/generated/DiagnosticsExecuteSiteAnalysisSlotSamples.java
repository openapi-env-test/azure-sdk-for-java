// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

import com.azure.core.util.Context;

/** Samples for Diagnostics ExecuteSiteAnalysisSlot. */
public final class DiagnosticsExecuteSiteAnalysisSlotSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/Diagnostics_ExecuteSiteAnalysis.json
     */
    /**
     * Sample code: Execute site analysis.
     *
     * @param manager Entry point to AppServiceManager.
     */
    public static void executeSiteAnalysis(com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager
            .diagnostics()
            .executeSiteAnalysisSlotWithResponse(
                "Sample-WestUSResourceGroup",
                "SampleApp",
                "availability",
                "apprestartanalyses",
                "Production",
                null,
                null,
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/Diagnostics_ExecuteSiteAnalysisSlot.json
     */
    /**
     * Sample code: Execute site slot analysis.
     *
     * @param manager Entry point to AppServiceManager.
     */
    public static void executeSiteSlotAnalysis(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager
            .diagnostics()
            .executeSiteAnalysisSlotWithResponse(
                "Sample-WestUSResourceGroup",
                "SampleApp",
                "availability",
                "apprestartanalyses",
                "staging",
                null,
                null,
                null,
                Context.NONE);
    }
}
