// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualMachines SimulateEviction. */
public final class VirtualMachinesSimulateEvictionSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_SimulateEviction.json
     */
    /**
     * Sample code: Simulate Eviction a virtual machine.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void simulateEvictionAVirtualMachine(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().simulateEvictionWithResponse("ResourceGroup", "VMName", Context.NONE);
    }
}
