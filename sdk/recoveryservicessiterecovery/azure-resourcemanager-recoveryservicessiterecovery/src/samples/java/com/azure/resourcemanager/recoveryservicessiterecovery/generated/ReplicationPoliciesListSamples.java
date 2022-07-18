// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.Context;

/** Samples for ReplicationPolicies List. */
public final class ReplicationPoliciesListSamples {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2022-04-01/examples/ReplicationPolicies_List.json
     */
    /**
     * Sample code: Gets the list of replication policies.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void getsTheListOfReplicationPolicies(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager.replicationPolicies().list("vault1", "resourceGroupPS1", Context.NONE);
    }
}
