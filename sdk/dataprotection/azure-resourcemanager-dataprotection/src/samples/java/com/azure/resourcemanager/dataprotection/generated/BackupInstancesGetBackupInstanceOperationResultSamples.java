// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.Context;

/** Samples for BackupInstances GetBackupInstanceOperationResult. */
public final class BackupInstancesGetBackupInstanceOperationResultSamples {
    /*
     * x-ms-original-file: specification/dataprotection/resource-manager/Microsoft.DataProtection/stable/2023-01-01/examples/BackupInstanceOperations/GetBackupInstanceOperationResult.json
     */
    /**
     * Sample code: Get BackupInstanceOperationResult.
     *
     * @param manager Entry point to DataProtectionManager.
     */
    public static void getBackupInstanceOperationResult(
        com.azure.resourcemanager.dataprotection.DataProtectionManager manager) {
        manager
            .backupInstances()
            .getBackupInstanceOperationResultWithResponse(
                "SampleResourceGroup",
                "swaggerExample",
                "testInstance1",
                "YWUzNDFkMzQtZmM5OS00MmUyLWEzNDMtZGJkMDIxZjlmZjgzOzdmYzBiMzhmLTc2NmItNDM5NS05OWQ1LTVmOGEzNzg4MWQzNA==",
                Context.NONE);
    }
}
