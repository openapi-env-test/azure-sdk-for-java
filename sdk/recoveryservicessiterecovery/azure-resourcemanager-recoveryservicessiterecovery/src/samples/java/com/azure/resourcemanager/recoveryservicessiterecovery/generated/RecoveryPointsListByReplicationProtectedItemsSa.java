// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.Context;

/** Samples for RecoveryPoints ListByReplicationProtectedItems. */
public final class RecoveryPointsListByReplicationProtectedItemsSa {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2022-04-01/examples/RecoveryPoints_ListByReplicationProtectedItems.json
     */
    /**
     * Sample code: Gets the list of recovery points for a replication protected item.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void getsTheListOfRecoveryPointsForAReplicationProtectedItem(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager
            .recoveryPoints()
            .listByReplicationProtectedItems(
                "vault1",
                "resourceGroupPS1",
                "cloud1",
                "cloud_6d224fc6-f326-5d35-96de-fbf51efb3179",
                "f8491e4f-817a-40dd-a90c-af773978c75b",
                Context.NONE);
    }
}
