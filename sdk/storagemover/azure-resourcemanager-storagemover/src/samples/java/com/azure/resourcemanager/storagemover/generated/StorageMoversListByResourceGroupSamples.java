// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.generated;

import com.azure.core.util.Context;

/** Samples for StorageMovers ListByResourceGroup. */
public final class StorageMoversListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/storagemover/resource-manager/Microsoft.StorageMover/preview/2022-07-01-preview/examples/StorageMovers_List.json
     */
    /**
     * Sample code: StorageMovers_List.
     *
     * @param manager Entry point to StorageMoverManager.
     */
    public static void storageMoversList(com.azure.resourcemanager.storagemover.StorageMoverManager manager) {
        manager.storageMovers().listByResourceGroup("examples-rg", Context.NONE);
    }
}
