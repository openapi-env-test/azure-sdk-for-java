// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.core.util.Context;

/** Samples for InstanceFailoverGroups Failover. */
public final class InstanceFailoverGroupsFailoverSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-05-01-preview/examples/InstanceFailoverGroupFailover.json
     */
    /**
     * Sample code: Planned failover of a failover group.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void plannedFailoverOfAFailoverGroup(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.instanceFailoverGroups().failover("Default", "Japan West", "failover-group-test-3", Context.NONE);
    }
}
