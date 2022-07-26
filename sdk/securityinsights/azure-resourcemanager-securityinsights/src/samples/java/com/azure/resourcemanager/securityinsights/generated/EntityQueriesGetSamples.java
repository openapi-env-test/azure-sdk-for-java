// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.Context;

/** Samples for EntityQueries Get. */
public final class EntityQueriesGetSamples {
    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-07-01-preview/examples/entityQueries/GetActivityEntityQueryById.json
     */
    /**
     * Sample code: Get an Activity entity query.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAnActivityEntityQuery(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .entityQueries()
            .getWithResponse("myRg", "myWorkspace", "07da3cc8-c8ad-4710-a44e-334cdcb7882b", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-07-01-preview/examples/entityQueries/GetExpansionEntityQueryById.json
     */
    /**
     * Sample code: Get an Expansion entity query.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAnExpansionEntityQuery(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .entityQueries()
            .getWithResponse("myRg", "myWorkspace", "07da3cc8-c8ad-4710-a44e-334cdcb7882b", Context.NONE);
    }
}
