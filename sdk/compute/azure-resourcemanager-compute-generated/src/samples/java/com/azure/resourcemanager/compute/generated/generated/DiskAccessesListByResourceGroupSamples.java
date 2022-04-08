// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for DiskAccesses ListByResourceGroup. */
public final class DiskAccessesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-12-01/examples/ListDiskAccessesInAResourceGroup.json
     */
    /**
     * Sample code: List all disk access resources in a resource group.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listAllDiskAccessResourcesInAResourceGroup(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.diskAccesses().listByResourceGroup("myResourceGroup", Context.NONE);
    }
}
