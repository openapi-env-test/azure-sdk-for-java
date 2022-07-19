// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.cdn.generated.models.WafAction;
import com.azure.resourcemanager.cdn.generated.models.WafGranularity;
import com.azure.resourcemanager.cdn.generated.models.WafMetric;
import java.time.OffsetDateTime;
import java.util.Arrays;

/** Samples for LogAnalytics GetWafLogAnalyticsMetrics. */
public final class LogAnalyticsGetWafLogAnalyticsMetricsSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2021-06-01/examples/LogAnalytics_GetWafLogAnalyticsMetrics.json
     */
    /**
     * Sample code: LogAnalytics_GetWafLogAnalyticsMetrics.
     *
     * @param manager Entry point to CdnManager.
     */
    public static void logAnalyticsGetWafLogAnalyticsMetrics(
        com.azure.resourcemanager.cdn.generated.CdnManager manager) {
        manager
            .logAnalytics()
            .getWafLogAnalyticsMetricsWithResponse(
                "RG",
                "profile1",
                Arrays.asList(WafMetric.CLIENT_REQUEST_COUNT),
                OffsetDateTime.parse("2020-11-04T06:49:27.554Z"),
                OffsetDateTime.parse("2020-11-04T09:49:27.554Z"),
                WafGranularity.PT5M,
                Arrays.asList(WafAction.BLOCK, WafAction.LOG),
                null,
                null,
                Context.NONE);
    }
}
