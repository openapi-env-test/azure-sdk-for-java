// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.generated;

import com.azure.core.util.Context;

/** Samples for ComputePolicies Delete. */
public final class ComputePoliciesDeleteSamples {
    /*
     * x-ms-original-file: specification/datalake-analytics/resource-manager/Microsoft.DataLakeAnalytics/preview/2019-11-01-preview/examples/ComputePolicies_Delete.json
     */
    /**
     * Sample code: Deletes the specified compute policy from the adla account.
     *
     * @param manager Entry point to DataLakeAnalyticsManager.
     */
    public static void deletesTheSpecifiedComputePolicyFromTheAdlaAccount(
        com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager manager) {
        manager.computePolicies().deleteWithResponse("contosorg", "contosoadla", "test_policy", Context.NONE);
    }
}
