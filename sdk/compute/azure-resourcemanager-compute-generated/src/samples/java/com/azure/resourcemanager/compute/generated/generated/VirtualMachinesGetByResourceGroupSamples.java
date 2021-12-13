// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualMachines GetByResourceGroup. */
public final class VirtualMachinesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-07-01/examples/compute/GetVirtualMachineAutoPlacedOnDedicatedHostGroup.json
     */
    /**
     * Sample code: Get a virtual machine placed on a dedicated host group through automatic placement.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getAVirtualMachinePlacedOnADedicatedHostGroupThroughAutomaticPlacement(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().getByResourceGroupWithResponse("myResourceGroup", "myVM", null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-07-01/examples/compute/GetVirtualMachine.json
     */
    /**
     * Sample code: Get a Virtual Machine.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getAVirtualMachine(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().getByResourceGroupWithResponse("myResourceGroup", "myVM", null, Context.NONE);
    }
}
