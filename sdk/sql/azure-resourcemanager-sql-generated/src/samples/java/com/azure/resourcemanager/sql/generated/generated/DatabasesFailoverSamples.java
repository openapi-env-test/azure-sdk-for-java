// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.models.ReplicaType;

/** Samples for Databases Failover. */
public final class DatabasesFailoverSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-02-01-preview/examples/FailoverDatabase.json
     */
    /**
     * Sample code: Failover an database.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void failoverAnDatabase(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.databases().failover("group1", "testServer", "testDatabase", ReplicaType.PRIMARY, Context.NONE);
    }
}
