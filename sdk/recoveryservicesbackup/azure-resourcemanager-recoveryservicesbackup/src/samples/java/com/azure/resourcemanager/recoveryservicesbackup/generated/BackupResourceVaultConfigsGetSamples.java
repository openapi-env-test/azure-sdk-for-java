// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.Context;

/** Samples for BackupResourceVaultConfigs Get. */
public final class BackupResourceVaultConfigsGetSamples {
    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/preview/2022-06-01-preview/examples/Common/BackupResourceVaultConfigs_Get.json
     */
    /**
     * Sample code: Get Vault Security Config.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void getVaultSecurityConfig(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager.backupResourceVaultConfigs().getWithResponse("SwaggerTest", "SwaggerTestRg", Context.NONE);
    }
}
