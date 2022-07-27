// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualMachineScaleSetVMs SimulateEviction. */
public final class VirtualMachineScaleSetVMsSimulateEvictionSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-03-01/ComputeRP/examples/virtualMachineScaleSetExamples/VirtualMachineScaleSetVM_SimulateEviction.json
     */
    /**
     * Sample code: Simulate Eviction a virtual machine.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void simulateEvictionAVirtualMachine(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachineScaleSetVMs()
            .simulateEvictionWithResponse("ResourceGroup", "VmScaleSetName", "InstanceId", Context.NONE);
    }
}
