// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for Disks List. */
public final class DisksListSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-12-01/examples/ListManagedDisksInASubscription.json
     */
    /**
     * Sample code: List all managed disks in a subscription.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listAllManagedDisksInASubscription(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.disks().list(Context.NONE);
    }
}
