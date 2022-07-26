// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.Context;

/** Samples for Incidents RunPlaybook. */
public final class IncidentsRunPlaybookSamples {
    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-11-01-preview/examples/manualTrigger/Incidents_RunPlaybook.json
     */
    /**
     * Sample code: Incidents_RunPlaybook.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void incidentsRunPlaybook(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .incidents()
            .runPlaybookWithResponse("myRg", "myWorkspace", "73e01a99-5cd7-4139-a149-9f2736ff2ar4", null, Context.NONE);
    }
}
