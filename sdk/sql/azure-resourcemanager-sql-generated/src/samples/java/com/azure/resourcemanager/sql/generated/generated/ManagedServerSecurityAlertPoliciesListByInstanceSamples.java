// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.core.util.Context;

/** Samples for ManagedServerSecurityAlertPolicies ListByInstance. */
public final class ManagedServerSecurityAlertPoliciesListByInstanceSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/ManagedServerSecurityAlertListByInstance.json
     */
    /**
     * Sample code: Get the managed server's threat detection policies.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void getTheManagedServerSThreatDetectionPolicies(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .managedServerSecurityAlertPolicies()
            .listByInstance("securityalert-4799", "securityalert-6440", Context.NONE);
    }
}
