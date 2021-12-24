// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.generated;

import com.azure.core.util.Context;

/** Samples for ActivityLogAlerts ListByResourceGroup. */
public final class ActivityLogAlertsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/stable/2017-04-01/examples/listActivityLogAlerts.json
     */
    /**
     * Sample code: List activity log alerts.
     *
     * @param manager Entry point to MonitorManager.
     */
    public static void listActivityLogAlerts(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager.activityLogAlerts().listByResourceGroup("Default-ActivityLogAlerts", Context.NONE);
    }
}
