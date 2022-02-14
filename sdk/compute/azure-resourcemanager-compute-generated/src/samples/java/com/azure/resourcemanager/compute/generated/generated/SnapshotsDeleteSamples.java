// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for Snapshots Delete. */
public final class SnapshotsDeleteSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-08-01/examples/DeleteASnapshot.json
     */
    /**
     * Sample code: Delete a snapshot.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void deleteASnapshot(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.snapshots().delete("myResourceGroup", "mySnapshot", Context.NONE);
    }
}
