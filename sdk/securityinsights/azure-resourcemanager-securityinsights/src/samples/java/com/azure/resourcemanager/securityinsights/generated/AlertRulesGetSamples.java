// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.Context;

/** Samples for AlertRules Get. */
public final class AlertRulesGetSamples {
    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-11-01-preview/examples/alertRules/GetScheduledAlertRule.json
     */
    /**
     * Sample code: Get a Scheduled alert rule.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAScheduledAlertRule(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .alertRules()
            .getWithResponse("myRg", "myWorkspace", "73e01a99-5cd7-4139-a149-9f2736ff2ab5", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-11-01-preview/examples/alertRules/GetNrtAlertRule.json
     */
    /**
     * Sample code: Get an Nrt alert rule.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAnNrtAlertRule(com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .alertRules()
            .getWithResponse("myRg", "myWorkspace", "73e01a99-5cd7-4139-a149-9f2736ff2ab5", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-11-01-preview/examples/alertRules/GetFusionAlertRule.json
     */
    /**
     * Sample code: Get a Fusion alert rule.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAFusionAlertRule(com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager.alertRules().getWithResponse("myRg", "myWorkspace", "myFirstFusionRule", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-11-01-preview/examples/alertRules/GetMicrosoftSecurityIncidentCreationAlertRule.json
     */
    /**
     * Sample code: Get a MicrosoftSecurityIncidentCreation rule.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAMicrosoftSecurityIncidentCreationRule(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .alertRules()
            .getWithResponse("myRg", "myWorkspace", "microsoftSecurityIncidentCreationRuleExample", Context.NONE);
    }
}
