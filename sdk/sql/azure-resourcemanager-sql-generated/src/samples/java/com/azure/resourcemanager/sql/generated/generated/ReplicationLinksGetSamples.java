// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.core.util.Context;

/** Samples for ReplicationLinks Get. */
public final class ReplicationLinksGetSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-02-01-preview/examples/ReplicationLinkGet.json
     */
    /**
     * Sample code: Gets the replication link.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void getsTheReplicationLink(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .replicationLinks()
            .getWithResponse("Default", "sourcesvr", "gamma-db", "4891ca10-ebd0-47d7-9182-c722651780fb", Context.NONE);
    }
}
