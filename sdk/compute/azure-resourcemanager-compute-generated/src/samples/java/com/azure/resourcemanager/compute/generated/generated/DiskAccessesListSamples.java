// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for DiskAccesses List. */
public final class DiskAccessesListSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-08-01/examples/ListDiskAccessesInASubscription.json
     */
    /**
     * Sample code: List all disk access resources in a subscription.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listAllDiskAccessResourcesInASubscription(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.diskAccesses().list(Context.NONE);
    }
}
