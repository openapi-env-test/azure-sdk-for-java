// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.Context;

/** Samples for BackupOperationResults Get. */
public final class BackupOperationResultsGetSamples {
    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2023-01-01/examples/Common/ProtectedItem_Delete_OperationResult.json
     */
    /**
     * Sample code: Get Result for Protected Item Delete Operation.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void getResultForProtectedItemDeleteOperation(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager
            .backupOperationResults()
            .getWithResponse(
                "PySDKBackupTestRsVault",
                "PythonSDKBackupTestRg",
                "00000000-0000-0000-0000-000000000000",
                Context.NONE);
    }
}
