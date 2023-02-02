// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureVMResourceFeatureSupportRequest;

/** Samples for FeatureSupport Validate. */
public final class FeatureSupportValidateSamples {
    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2023-01-01/examples/AzureIaasVm/BackupFeature_Validate.json
     */
    /**
     * Sample code: Check Azure Vm Backup Feature Support.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void checkAzureVmBackupFeatureSupport(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager
            .featureSupports()
            .validateWithResponse(
                "southeastasia",
                new AzureVMResourceFeatureSupportRequest().withVmSize("Basic_A0").withVmSku("Premium"),
                Context.NONE);
    }
}
