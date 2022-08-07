// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.models.LongTermRetentionPolicyName;

/** Samples for LongTermRetentionPolicies Get. */
public final class LongTermRetentionPoliciesGetSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/LongTermRetentionPolicyGet.json
     */
    /**
     * Sample code: Get the long term retention policy for the database.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void getTheLongTermRetentionPolicyForTheDatabase(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .longTermRetentionPolicies()
            .getWithResponse(
                "resourceGroup", "testserver", "testDatabase", LongTermRetentionPolicyName.DEFAULT, Context.NONE);
    }
}
