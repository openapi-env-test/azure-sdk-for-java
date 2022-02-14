// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.generated;

import com.azure.core.util.Context;

/** Samples for Accounts GetByResourceGroup. */
public final class AccountsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/datalake-analytics/resource-manager/Microsoft.DataLakeAnalytics/preview/2019-11-01-preview/examples/Accounts_Get.json
     */
    /**
     * Sample code: Gets details of the specified Data Lake Analytics account.
     *
     * @param manager Entry point to DataLakeAnalyticsManager.
     */
    public static void getsDetailsOfTheSpecifiedDataLakeAnalyticsAccount(
        com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager manager) {
        manager.accounts().getByResourceGroupWithResponse("contosorg", "contosoadla", Context.NONE);
    }
}
