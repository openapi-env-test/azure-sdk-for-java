// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.core.util.Context;

/** Samples for MaintenanceWindowsOperation Get. */
public final class MaintenanceWindowsOperationGetSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/GetMaintenanceWindows.json
     */
    /**
     * Sample code: Gets maintenance window settings for a selected database.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void getsMaintenanceWindowSettingsForASelectedDatabase(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .maintenanceWindowsOperations()
            .getWithResponse("Default-SQL-SouthEastAsia", "testsvr", "testdb", "current", Context.NONE);
    }
}
