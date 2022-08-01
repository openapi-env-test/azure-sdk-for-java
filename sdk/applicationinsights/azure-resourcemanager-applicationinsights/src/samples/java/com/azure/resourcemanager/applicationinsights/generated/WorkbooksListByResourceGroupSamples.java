// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.applicationinsights.models.CategoryType;

/** Samples for Workbooks ListByResourceGroup. */
public final class WorkbooksListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2022-02-01/examples/WorkbooksManagedList.json
     */
    /**
     * Sample code: WorkbooksManagedList.
     *
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void workbooksManagedList(
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        manager
            .workbooks()
            .listByResourceGroup(
                "my-resource-group",
                CategoryType.WORKBOOK,
                null,
                "/subscriptions/6b643656-33eb-422f-aee8-3ac119r124af/resourceGroups/my-resource-group/providers/Microsoft.Web/sites/MyApp",
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2022-02-01/examples/WorkbooksList.json
     */
    /**
     * Sample code: WorkbooksList.
     *
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void workbooksList(com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        manager
            .workbooks()
            .listByResourceGroup(
                "my-resource-group",
                CategoryType.WORKBOOK,
                null,
                "/subscriptions/6b643656-33eb-422f-aee8-3ac145d124af/resourceGroups/my-resource-group/providers/Microsoft.Web/sites/MyApp",
                null,
                Context.NONE);
    }
}
