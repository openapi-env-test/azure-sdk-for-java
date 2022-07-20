// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.generated;

import com.azure.core.util.Context;

/** Samples for BlobContainers GetImmutabilityPolicy. */
public final class BlobContainersGetImmutabilityPolicySamples {
    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2021-09-01/examples/BlobContainersGetImmutabilityPolicy.json
     */
    /**
     * Sample code: GetImmutabilityPolicy.
     *
     * @param manager Entry point to StorageManager.
     */
    public static void getImmutabilityPolicy(com.azure.resourcemanager.storage.generated.StorageManager manager) {
        manager
            .blobContainers()
            .getImmutabilityPolicyWithResponse("res5221", "sto9177", "container3489", null, Context.NONE);
    }
}
