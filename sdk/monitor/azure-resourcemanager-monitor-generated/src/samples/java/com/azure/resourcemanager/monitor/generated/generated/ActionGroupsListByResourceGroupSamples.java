// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.generated;

import com.azure.core.util.Context;

/** Samples for ActionGroups ListByResourceGroup. */
public final class ActionGroupsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/stable/2021-09-01/examples/listActionGroups.json
     */
    /**
     * Sample code: List action groups.
     *
     * @param manager Entry point to MonitorManager.
     */
    public static void listActionGroups(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager.actionGroups().listByResourceGroup("Default-NotificationRules", Context.NONE);
    }
}
