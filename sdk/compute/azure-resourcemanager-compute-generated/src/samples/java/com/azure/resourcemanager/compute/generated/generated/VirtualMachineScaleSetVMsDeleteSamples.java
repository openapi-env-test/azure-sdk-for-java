// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualMachineScaleSetVMs Delete. */
public final class VirtualMachineScaleSetVMsDeleteSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-11-01/examples/virtualMachineScaleSetExamples/VirtualMachineScaleSetVM_Delete_Force.json
     */
    /**
     * Sample code: Force Delete a virtual machine from a VM scale set.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void forceDeleteAVirtualMachineFromAVMScaleSet(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachineScaleSetVMs().delete("myResourceGroup", "myvmScaleSet", "0", true, Context.NONE);
    }
}
