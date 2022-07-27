// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.models.DistributedAvailabilityGroup;
import com.azure.resourcemanager.sql.generated.models.ReplicationMode;

/** Samples for DistributedAvailabilityGroups Update. */
public final class DistributedAvailabilityGroupsUpdateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2021-11-01-preview/examples/DistributedAvailabilityGroupsUpdate.json
     */
    /**
     * Sample code: Update the distributed availability group replication mode before deleting it.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void updateTheDistributedAvailabilityGroupReplicationModeBeforeDeletingIt(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        DistributedAvailabilityGroup resource =
            manager.distributedAvailabilityGroups().getWithResponse("testrg", "testcl", "dag", Context.NONE).getValue();
        resource.update().withReplicationMode(ReplicationMode.SYNC).apply();
    }
}
