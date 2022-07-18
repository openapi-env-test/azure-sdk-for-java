// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.Context;

/** Samples for ReplicationLogicalNetworks ListByReplicationFabrics. */
public final class ReplicationLogicalNetworksListByReplicationFabr {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2022-04-01/examples/ReplicationLogicalNetworks_ListByReplicationFabrics.json
     */
    /**
     * Sample code: Gets the list of logical networks under a fabric.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void getsTheListOfLogicalNetworksUnderAFabric(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager
            .replicationLogicalNetworks()
            .listByReplicationFabrics("vault1", "resourceGroupPS1", "cloud1", Context.NONE);
    }
}
