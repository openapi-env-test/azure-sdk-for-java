// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.Context;

/** Samples for ReplicationMigrationItems ListByReplicationProtectionContainers. */
public final class ReplicationMigrationItemsListByReplicationProte {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2022-04-01/examples/ReplicationMigrationItems_ListByReplicationProtectionContainers.json
     */
    /**
     * Sample code: Gets the list of migration items in the protection container.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void getsTheListOfMigrationItemsInTheProtectionContainer(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager
            .replicationMigrationItems()
            .listByReplicationProtectionContainers(
                "migrationvault",
                "resourcegroup1",
                "vmwarefabric1",
                "vmwareContainer1",
                null,
                null,
                null,
                Context.NONE);
    }
}
