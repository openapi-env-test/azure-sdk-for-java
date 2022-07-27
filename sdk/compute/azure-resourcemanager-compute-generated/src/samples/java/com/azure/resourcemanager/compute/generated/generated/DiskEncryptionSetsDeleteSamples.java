// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for DiskEncryptionSets Delete. */
public final class DiskEncryptionSetsDeleteSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/disk/stable/2022-07-27/examples/DeleteADiskEncryptionSet.json
     */
    /**
     * Sample code: Delete a disk encryption set.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void deleteADiskEncryptionSet(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.diskEncryptionSets().delete("myResourceGroup", "myDiskEncryptionSet", Context.NONE);
    }
}
