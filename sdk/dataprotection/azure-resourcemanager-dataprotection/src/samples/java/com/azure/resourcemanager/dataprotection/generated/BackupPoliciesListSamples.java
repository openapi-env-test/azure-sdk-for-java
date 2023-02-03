// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.Context;

/** Samples for BackupPolicies List. */
public final class BackupPoliciesListSamples {
    /*
     * x-ms-original-file: specification/dataprotection/resource-manager/Microsoft.DataProtection/stable/2023-01-01/examples/PolicyCRUD/ListBackupPolicy.json
     */
    /**
     * Sample code: List BackupPolicy.
     *
     * @param manager Entry point to DataProtectionManager.
     */
    public static void listBackupPolicy(com.azure.resourcemanager.dataprotection.DataProtectionManager manager) {
        manager.backupPolicies().list("000pikumar", "PrivatePreviewVault", Context.NONE);
    }
}
