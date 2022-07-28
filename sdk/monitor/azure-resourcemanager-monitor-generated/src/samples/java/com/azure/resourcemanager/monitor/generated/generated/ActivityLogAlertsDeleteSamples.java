// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.generated;

import com.azure.core.util.Context;

/** Samples for ActivityLogAlerts Delete. */
public final class ActivityLogAlertsDeleteSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/stable/2020-10-01/examples/ActivityLogAlertRule_Delete.json
     */
    /**
     * Sample code: Delete an Activity Log Alert rule.
     *
     * @param manager Entry point to MonitorManager.
     */
    public static void deleteAnActivityLogAlertRule(
        com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager.activityLogAlerts().deleteWithResponse("MyResourceGroup", "SampleActivityLogAlertRule", Context.NONE);
    }
}
