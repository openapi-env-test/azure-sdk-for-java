// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualMachineScaleSets Delete. */
public final class VirtualMachineScaleSetsDeleteSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineScaleSetExamples/VirtualMachineScaleSet_Delete_Force.json
     */
    /**
     * Sample code: Force Delete a VM scale set.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void forceDeleteAVMScaleSet(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachineScaleSets().delete("myResourceGroup", "myvmScaleSet", true, Context.NONE);
    }
}
