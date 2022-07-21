// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.resourcemanager.sql.generated.models.ManagedShortTermRetentionPolicyName;

/** Samples for ManagedBackupShortTermRetentionPolicies CreateOrUpdate. */
public final class ManagedBackupShortTermRetentionPoliciesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/UpdateManagedShortTermRetentionPolicy.json
     */
    /**
     * Sample code: Update the short term retention policy for the database.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void updateTheShortTermRetentionPolicyForTheDatabase(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .managedBackupShortTermRetentionPolicies()
            .define(ManagedShortTermRetentionPolicyName.DEFAULT)
            .withExistingDatabase("resourceGroup", "testsvr", "testdb")
            .withRetentionDays(14)
            .create();
    }
}
