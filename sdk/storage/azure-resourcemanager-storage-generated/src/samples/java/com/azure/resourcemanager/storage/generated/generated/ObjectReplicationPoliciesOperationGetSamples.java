// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.generated;

import com.azure.core.util.Context;

/** Samples for ObjectReplicationPoliciesOperation Get. */
public final class ObjectReplicationPoliciesOperationGetSamples {
    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2021-09-01/examples/StorageAccountGetObjectReplicationPolicy.json
     */
    /**
     * Sample code: StorageAccountGetObjectReplicationPolicies.
     *
     * @param manager Entry point to StorageManager.
     */
    public static void storageAccountGetObjectReplicationPolicies(
        com.azure.resourcemanager.storage.generated.StorageManager manager) {
        manager
            .objectReplicationPoliciesOperations()
            .getWithResponse("res6977", "sto2527", "{objectReplicationPolicy-Id}", Context.NONE);
    }
}
