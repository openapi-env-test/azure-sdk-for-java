// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.core.util.Context;

/** Samples for ReplicationLinks Delete. */
public final class ReplicationLinksDeleteSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2021-11-01-preview/examples/ReplicationLinkDelete.json
     */
    /**
     * Sample code: Delete replication link on server.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void deleteReplicationLinkOnServer(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .replicationLinks()
            .deleteWithResponse(
                "Default", "sourcesvr", "gamma-db", "4891ca10-ebd0-47d7-9182-c722651780fb", Context.NONE);
    }
}
