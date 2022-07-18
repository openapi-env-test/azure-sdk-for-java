// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.Context;

/** Samples for ReplicationProtectedItems List. */
public final class ReplicationProtectedItemsListSamples {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2022-04-01/examples/ReplicationProtectedItems_List.json
     */
    /**
     * Sample code: Gets the list of replication protected items.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void getsTheListOfReplicationProtectedItems(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager.replicationProtectedItems().list("vault1", "resourceGroupPS1", null, null, Context.NONE);
    }
}
