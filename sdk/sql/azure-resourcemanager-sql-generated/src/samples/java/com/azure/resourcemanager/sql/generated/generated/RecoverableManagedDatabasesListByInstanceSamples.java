// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.core.util.Context;

/** Samples for RecoverableManagedDatabases ListByInstance. */
public final class RecoverableManagedDatabasesListByInstanceSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/ListRecoverableManagedDatabasesByServer.json
     */
    /**
     * Sample code: List recoverable databases by managed instances.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void listRecoverableDatabasesByManagedInstances(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.recoverableManagedDatabases().listByInstance("Test1", "managedInstance", Context.NONE);
    }
}
