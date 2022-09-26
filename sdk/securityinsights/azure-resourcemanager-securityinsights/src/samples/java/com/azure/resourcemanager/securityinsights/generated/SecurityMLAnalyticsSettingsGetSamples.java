// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.Context;

/** Samples for SecurityMLAnalyticsSettings Get. */
public final class SecurityMLAnalyticsSettingsGetSamples {
    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-09-01-preview/examples/securityMLAnalyticsSettings/GetAnomalySecurityMLAnalyticsSetting.json
     */
    /**
     * Sample code: Get a Anomaly Security ML Analytics Settings.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAAnomalySecurityMLAnalyticsSettings(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .securityMLAnalyticsSettings()
            .getWithResponse("myRg", "myWorkspace", "myFirstAnomalySettings", Context.NONE);
    }
}
