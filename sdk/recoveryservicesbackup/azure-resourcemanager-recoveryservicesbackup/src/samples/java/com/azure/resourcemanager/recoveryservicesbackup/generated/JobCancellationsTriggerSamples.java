// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.Context;

/** Samples for JobCancellations Trigger. */
public final class JobCancellationsTriggerSamples {
    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2023-01-01/examples/Common/TriggerCancelJob.json
     */
    /**
     * Sample code: Cancel Job.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void cancelJob(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager
            .jobCancellations()
            .triggerWithResponse(
                "NetSDKTestRsVault", "SwaggerTestRg", "00000000-0000-0000-0000-000000000000", Context.NONE);
    }
}
