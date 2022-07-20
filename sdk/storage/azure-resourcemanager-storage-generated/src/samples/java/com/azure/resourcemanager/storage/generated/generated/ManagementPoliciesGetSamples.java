// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.generated.models.ManagementPolicyName;

/** Samples for ManagementPolicies Get. */
public final class ManagementPoliciesGetSamples {
    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2021-09-01/examples/StorageAccountGetManagementPolicy.json
     */
    /**
     * Sample code: StorageAccountGetManagementPolicies.
     *
     * @param manager Entry point to StorageManager.
     */
    public static void storageAccountGetManagementPolicies(
        com.azure.resourcemanager.storage.generated.StorageManager manager) {
        manager.managementPolicies().getWithResponse("res6977", "sto2527", ManagementPolicyName.DEFAULT, Context.NONE);
    }
}
