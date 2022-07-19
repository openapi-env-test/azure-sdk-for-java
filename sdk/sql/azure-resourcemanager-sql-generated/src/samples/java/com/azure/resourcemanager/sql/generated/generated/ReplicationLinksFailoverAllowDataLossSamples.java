// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.core.util.Context;

/** Samples for ReplicationLinks FailoverAllowDataLoss. */
public final class ReplicationLinksFailoverAllowDataLossSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2021-11-01-preview/examples/ReplicationLinkFailoverAllowDataLoss.json
     */
    /**
     * Sample code: Forced failover of a replication link.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void forcedFailoverOfAReplicationLink(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .replicationLinks()
            .failoverAllowDataLoss(
                "Default", "sourcesvr", "gamma-db", "4891ca10-ebd0-47d7-9182-c722651780fb", Context.NONE);
    }
}
