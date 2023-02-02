// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.core.util.Context;

/** Samples for ManagedDatabases Get. */
public final class ManagedDatabasesGetSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-05-01-preview/examples/ManagedDatabaseGet.json
     */
    /**
     * Sample code: Gets a managed database.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void getsAManagedDatabase(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.managedDatabases().getWithResponse("Test1", "managedInstance", "managedDatabase", Context.NONE);
    }
}
