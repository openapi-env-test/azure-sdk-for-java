// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.Context;

/** Samples for ReplicationRecoveryPlans Get. */
public final class ReplicationRecoveryPlansGetSamples {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2022-04-01/examples/ReplicationRecoveryPlans_Get.json
     */
    /**
     * Sample code: Gets the requested recovery plan.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void getsTheRequestedRecoveryPlan(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager.replicationRecoveryPlans().getWithResponse("vault1", "resourceGroupPS1", "RPtest1", Context.NONE);
    }
}
