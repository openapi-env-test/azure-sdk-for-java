// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.Context;

/** Samples for Jobs Export. */
public final class JobsExportSamples {
    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2023-01-01/examples/Common/TriggerExportJobs.json
     */
    /**
     * Sample code: Export Jobs.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void exportJobs(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager.jobs().exportWithResponse("NetSDKTestRsVault", "SwaggerTestRg", null, Context.NONE);
    }
}
