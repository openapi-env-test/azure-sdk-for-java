// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.resourcemanager.sql.generated.models.ManagedInstanceLongTermRetentionPolicyName;

/** Samples for ManagedInstanceLongTermRetentionPolicies CreateOrUpdate. */
public final class ManagedInstanceLongTermRetentionPoliciesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/ManagedInstanceLongTermRetentionPolicyCreateOrUpdate.json
     */
    /**
     * Sample code: Create or update the LTR policy for the managed database.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void createOrUpdateTheLTRPolicyForTheManagedDatabase(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .managedInstanceLongTermRetentionPolicies()
            .define(ManagedInstanceLongTermRetentionPolicyName.DEFAULT)
            .withExistingDatabase("testResourceGroup", "testInstance", "testDatabase")
            .withWeeklyRetention("P1M")
            .withMonthlyRetention("P1Y")
            .withYearlyRetention("P5Y")
            .withWeekOfYear(5)
            .create();
    }
}
