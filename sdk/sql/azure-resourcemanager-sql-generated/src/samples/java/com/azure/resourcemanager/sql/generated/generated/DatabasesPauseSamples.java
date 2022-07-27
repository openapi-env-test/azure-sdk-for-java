// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.core.util.Context;

/** Samples for Databases Pause. */
public final class DatabasesPauseSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-02-01-preview/examples/PauseDatabase.json
     */
    /**
     * Sample code: Pauses a database.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void pausesADatabase(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.databases().pause("Default-SQL-SouthEastAsia", "testsvr", "testdwdb", Context.NONE);
    }
}
