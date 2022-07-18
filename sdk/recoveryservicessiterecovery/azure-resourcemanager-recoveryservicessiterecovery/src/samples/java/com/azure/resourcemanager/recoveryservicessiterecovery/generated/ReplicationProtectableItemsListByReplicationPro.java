// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.Context;

/** Samples for ReplicationProtectableItems ListByReplicationProtectionContainers. */
public final class ReplicationProtectableItemsListByReplicationPro {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2022-04-01/examples/ReplicationProtectableItems_ListByReplicationProtectionContainers.json
     */
    /**
     * Sample code: Gets the list of protectable items.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void getsTheListOfProtectableItems(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager
            .replicationProtectableItems()
            .listByReplicationProtectionContainers(
                "vault1",
                "resourceGroupPS1",
                "cloud1",
                "cloud_6d224fc6-f326-5d35-96de-fbf51efb3179",
                null,
                null,
                null,
                Context.NONE);
    }
}
