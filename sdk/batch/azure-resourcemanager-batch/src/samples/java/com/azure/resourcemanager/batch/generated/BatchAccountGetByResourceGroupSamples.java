// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.Context;

/** Samples for BatchAccount GetByResourceGroup. */
public final class BatchAccountGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/batch/resource-manager/Microsoft.Batch/stable/2022-06-01/examples/PrivateBatchAccountGet.json
     */
    /**
     * Sample code: PrivateBatchAccountGet.
     *
     * @param manager Entry point to BatchManager.
     */
    public static void privateBatchAccountGet(com.azure.resourcemanager.batch.BatchManager manager) {
        manager
            .batchAccounts()
            .getByResourceGroupWithResponse("default-azurebatch-japaneast", "sampleacct", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/batch/resource-manager/Microsoft.Batch/stable/2022-06-01/examples/BatchAccountGet.json
     */
    /**
     * Sample code: BatchAccountGet.
     *
     * @param manager Entry point to BatchManager.
     */
    public static void batchAccountGet(com.azure.resourcemanager.batch.BatchManager manager) {
        manager
            .batchAccounts()
            .getByResourceGroupWithResponse("default-azurebatch-japaneast", "sampleacct", Context.NONE);
    }
}
