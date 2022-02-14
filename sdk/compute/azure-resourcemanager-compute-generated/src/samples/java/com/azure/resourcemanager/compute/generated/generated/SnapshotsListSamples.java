// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for Snapshots List. */
public final class SnapshotsListSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-08-01/examples/ListSnapshotsInASubscription.json
     */
    /**
     * Sample code: List all snapshots in a subscription.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listAllSnapshotsInASubscription(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.snapshots().list(Context.NONE);
    }
}
