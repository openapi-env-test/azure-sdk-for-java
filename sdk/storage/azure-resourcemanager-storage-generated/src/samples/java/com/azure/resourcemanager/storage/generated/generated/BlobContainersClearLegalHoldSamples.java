// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.generated.fluent.models.LegalHoldInner;
import java.util.Arrays;

/** Samples for BlobContainers ClearLegalHold. */
public final class BlobContainersClearLegalHoldSamples {
    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2021-09-01/examples/BlobContainersClearLegalHold.json
     */
    /**
     * Sample code: ClearLegalHoldContainers.
     *
     * @param manager Entry point to StorageManager.
     */
    public static void clearLegalHoldContainers(com.azure.resourcemanager.storage.generated.StorageManager manager) {
        manager
            .blobContainers()
            .clearLegalHoldWithResponse(
                "res4303",
                "sto7280",
                "container8723",
                new LegalHoldInner().withTags(Arrays.asList("tag1", "tag2", "tag3")),
                Context.NONE);
    }
}
