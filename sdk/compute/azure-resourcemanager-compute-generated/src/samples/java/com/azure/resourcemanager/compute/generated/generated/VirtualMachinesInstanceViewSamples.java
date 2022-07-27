// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualMachines InstanceView. */
public final class VirtualMachinesInstanceViewSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Get_InstanceView.json
     */
    /**
     * Sample code: Get Virtual Machine Instance View.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getVirtualMachineInstanceView(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().instanceViewWithResponse("myResourceGroup", "myVM", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Get_InstanceViewAutoPlacedOnDedicatedHostGroup.json
     */
    /**
     * Sample code: Get instance view of a virtual machine placed on a dedicated host group through automatic placement.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getInstanceViewOfAVirtualMachinePlacedOnADedicatedHostGroupThroughAutomaticPlacement(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().instanceViewWithResponse("myResourceGroup", "myVM", Context.NONE);
    }
}
