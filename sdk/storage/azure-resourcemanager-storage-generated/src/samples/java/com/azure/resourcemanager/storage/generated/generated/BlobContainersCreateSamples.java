// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.generated;

import com.azure.resourcemanager.storage.generated.models.ImmutableStorageWithVersioning;

/** Samples for BlobContainers Create. */
public final class BlobContainersCreateSamples {
    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2021-09-01/examples/BlobContainersPutDefaultEncryptionScope.json
     */
    /**
     * Sample code: PutContainerWithDefaultEncryptionScope.
     *
     * @param manager Entry point to StorageManager.
     */
    public static void putContainerWithDefaultEncryptionScope(
        com.azure.resourcemanager.storage.generated.StorageManager manager) {
        manager
            .blobContainers()
            .define("container6185")
            .withExistingStorageAccount("res3376", "sto328")
            .withDefaultEncryptionScope("encryptionscope185")
            .withDenyEncryptionScopeOverride(true)
            .create();
    }

    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2021-09-01/examples/BlobContainersPutObjectLevelWorm.json
     */
    /**
     * Sample code: PutContainerWithObjectLevelWorm.
     *
     * @param manager Entry point to StorageManager.
     */
    public static void putContainerWithObjectLevelWorm(
        com.azure.resourcemanager.storage.generated.StorageManager manager) {
        manager
            .blobContainers()
            .define("container6185")
            .withExistingStorageAccount("res3376", "sto328")
            .withImmutableStorageWithVersioning(new ImmutableStorageWithVersioning().withEnabled(true))
            .create();
    }

    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2021-09-01/examples/BlobContainersPut.json
     */
    /**
     * Sample code: PutContainers.
     *
     * @param manager Entry point to StorageManager.
     */
    public static void putContainers(com.azure.resourcemanager.storage.generated.StorageManager manager) {
        manager.blobContainers().define("container6185").withExistingStorageAccount("res3376", "sto328").create();
    }
}
