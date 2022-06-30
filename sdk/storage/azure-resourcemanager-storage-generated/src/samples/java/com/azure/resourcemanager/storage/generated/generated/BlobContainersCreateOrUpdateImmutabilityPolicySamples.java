// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.generated;

/** Samples for BlobContainers CreateOrUpdateImmutabilityPolicy. */
public final class BlobContainersCreateOrUpdateImmutabilityPolicySamples {
    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2021-09-01/examples/BlobContainersPutImmutabilityPolicy.json
     */
    /**
     * Sample code: CreateOrUpdateImmutabilityPolicy.
     *
     * @param manager Entry point to StorageManager.
     */
    public static void createOrUpdateImmutabilityPolicy(
        com.azure.resourcemanager.storage.generated.StorageManager manager) {
        manager
            .blobContainers()
            .defineImmutabilityPolicy()
            .withExistingContainer("res1782", "sto7069", "container6397")
            .withImmutabilityPeriodSinceCreationInDays(3)
            .withAllowProtectedAppendWrites(true)
            .create();
    }

    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2021-09-01/examples/BlobContainersPutImmutabilityPolicyAllowProtectedAppendWritesAll.json
     */
    /**
     * Sample code: CreateOrUpdateImmutabilityPolicyWithAllowProtectedAppendWritesAll.
     *
     * @param manager Entry point to StorageManager.
     */
    public static void createOrUpdateImmutabilityPolicyWithAllowProtectedAppendWritesAll(
        com.azure.resourcemanager.storage.generated.StorageManager manager) {
        manager
            .blobContainers()
            .defineImmutabilityPolicy()
            .withExistingContainer("res1782", "sto7069", "container6397")
            .withImmutabilityPeriodSinceCreationInDays(3)
            .withAllowProtectedAppendWritesAll(true)
            .create();
    }
}
