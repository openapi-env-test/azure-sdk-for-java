// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.core.util.Context;

/** Samples for ManagedDatabases Delete. */
public final class ManagedDatabasesDeleteSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/ManagedDatabaseDelete.json
     */
    /**
     * Sample code: Delete managed database.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void deleteManagedDatabase(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.managedDatabases().delete("Default-SQL-SouthEastAsia", "managedInstance", "testdb", Context.NONE);
    }
}
