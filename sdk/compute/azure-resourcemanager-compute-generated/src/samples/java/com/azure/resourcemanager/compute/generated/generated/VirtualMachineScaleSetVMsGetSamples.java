// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualMachineScaleSetVMs Get. */
public final class VirtualMachineScaleSetVMsGetSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-03-01/ComputeRP/examples/virtualMachineScaleSetExamples/VirtualMachineScaleSetVM_Get_WithVMSizeProperties.json
     */
    /**
     * Sample code: Get VM scale set VM with VMSizeProperties.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getVMScaleSetVMWithVMSizeProperties(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachineScaleSetVMs().getWithResponse("myResourceGroup", "{vmss-name}", "0", null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-03-01/ComputeRP/examples/virtualMachineScaleSetExamples/VirtualMachineScaleSetVM_Get_WithUserData.json
     */
    /**
     * Sample code: Get VM scale set VM with UserData.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getVMScaleSetVMWithUserData(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachineScaleSetVMs().getWithResponse("myResourceGroup", "{vmss-name}", "0", null, Context.NONE);
    }
}
