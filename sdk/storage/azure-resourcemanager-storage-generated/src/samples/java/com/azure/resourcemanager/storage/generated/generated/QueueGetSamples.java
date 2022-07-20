// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.generated;

import com.azure.core.util.Context;

/** Samples for Queue Get. */
public final class QueueGetSamples {
    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2021-09-01/examples/QueueOperationGet.json
     */
    /**
     * Sample code: QueueOperationGet.
     *
     * @param manager Entry point to StorageManager.
     */
    public static void queueOperationGet(com.azure.resourcemanager.storage.generated.StorageManager manager) {
        manager.queues().getWithResponse("res3376", "sto328", "queue6185", Context.NONE);
    }
}
