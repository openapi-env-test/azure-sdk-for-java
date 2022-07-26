// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.Context;

/** Samples for IncidentComments Delete. */
public final class IncidentCommentsDeleteSamples {
    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-07-01-preview/examples/incidents/comments/DeleteIncidentComment.json
     */
    /**
     * Sample code: Delete the incident comment.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void deleteTheIncidentComment(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .incidentComments()
            .deleteWithResponse(
                "myRg",
                "myWorkspace",
                "73e01a99-5cd7-4139-a149-9f2736ff2ab5",
                "4bb36b7b-26ff-4d1c-9cbe-0d8ab3da0014",
                Context.NONE);
    }
}
