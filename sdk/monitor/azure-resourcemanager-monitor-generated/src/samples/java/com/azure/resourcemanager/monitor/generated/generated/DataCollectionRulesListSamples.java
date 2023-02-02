// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.generated;

import com.azure.core.util.Context;

/** Samples for DataCollectionRules List. */
public final class DataCollectionRulesListSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/preview/2021-09-01-preview/examples/DataCollectionRulesListBySubscription.json
     */
    /**
     * Sample code: List data collection rules by subscription.
     *
     * @param manager Entry point to MonitorManager.
     */
    public static void listDataCollectionRulesBySubscription(
        com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager.dataCollectionRules().list(Context.NONE);
    }
}
