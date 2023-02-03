// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for Snapshots RevokeAccess. */
public final class SnapshotsRevokeAccessSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2022-07-02/examples/snapshotExamples/Snapshot_EndGetAccess.json
     */
    /**
     * Sample code: Revoke access to a snapshot.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void revokeAccessToASnapshot(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.snapshots().revokeAccess("myResourceGroup", "mySnapshot", Context.NONE);
    }
}
