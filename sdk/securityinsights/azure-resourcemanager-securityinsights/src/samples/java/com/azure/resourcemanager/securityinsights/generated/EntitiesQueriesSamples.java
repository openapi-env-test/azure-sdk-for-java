// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.securityinsights.models.EntityItemQueryKind;

/** Samples for Entities Queries. */
public final class EntitiesQueriesSamples {
    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-11-01-preview/examples/entities/GetQueries.json
     */
    /**
     * Sample code: Get Entity Query.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getEntityQuery(com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .entities()
            .queriesWithResponse(
                "myRg",
                "myWorkspace",
                "e1d3d618-e11f-478b-98e3-bb381539a8e1",
                EntityItemQueryKind.INSIGHT,
                Context.NONE);
    }
}
