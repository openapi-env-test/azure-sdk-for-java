// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.core.util.Context;

/** Samples for LongTermRetentionManagedInstanceBackups ListByResourceGroupLocation. */
public final class LongTermRetentionManagedInstanceBackupsListByResourceGroupLocationSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2021-05-01-preview/examples/ResourceGroupBasedManagedInstanceLongTermRetentionBackupListByLocation.json
     */
    /**
     * Sample code: Get all long term retention backups under the location.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void getAllLongTermRetentionBackupsUnderTheLocation(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .longTermRetentionManagedInstanceBackups()
            .listByResourceGroupLocation("testResourceGroup", "japaneast", null, null, Context.NONE);
    }
}
