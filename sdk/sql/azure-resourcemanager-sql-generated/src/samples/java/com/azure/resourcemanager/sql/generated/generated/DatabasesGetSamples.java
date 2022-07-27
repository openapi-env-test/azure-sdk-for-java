// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.core.util.Context;

/** Samples for Databases Get. */
public final class DatabasesGetSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-02-01-preview/examples/GetVCoreDatabase.json
     */
    /**
     * Sample code: Gets a database.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void getsADatabase(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.databases().getWithResponse("Default-SQL-SouthEastAsia", "testsvr", "testdb", Context.NONE);
    }
}
