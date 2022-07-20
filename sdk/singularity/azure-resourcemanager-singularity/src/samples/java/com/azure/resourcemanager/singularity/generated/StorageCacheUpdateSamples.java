// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.singularity.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.singularity.models.StorageCachePropertiesBase;
import com.azure.resourcemanager.singularity.models.StorageCacheResourceDescription;

/** Samples for StorageCache Update. */
public final class StorageCacheUpdateSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/storagecontainers/update.json
     */
    /**
     * Sample code: StorageCacheUpdate.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void storageCacheUpdate(com.azure.resourcemanager.singularity.SingularityManager manager) {
        StorageCacheResourceDescription resource =
            manager
                .storageCaches()
                .getWithResponse("myresourceGroupName", "myaccountName", "mystorageCacheResourceName", Context.NONE)
                .getValue();
        resource.update().withProperties(new StorageCachePropertiesBase()).apply();
    }
}
