// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.core.util.Context;

/** Samples for ReplicationLinks ListByDatabase. */
public final class ReplicationLinksListByDatabaseSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2021-11-01-preview/examples/ReplicationLinkListByDatabase.json
     */
    /**
     * Sample code: List replication links on server on database.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void listReplicationLinksOnServerOnDatabase(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.replicationLinks().listByDatabase("Default", "sourcesvr", "tetha-db", Context.NONE);
    }
}
