// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for DiskRestorePoint ListByRestorePoint. */
public final class DiskRestorePointListByRestorePointSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-12-01/examples/ListDiskRestorePointsInVmRestorePoint.json
     */
    /**
     * Sample code: Get an incremental disk restorePoint resource.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getAnIncrementalDiskRestorePointResource(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.diskRestorePoints().listByRestorePoint("myResourceGroup", "rpc", "vmrp", Context.NONE);
    }
}
