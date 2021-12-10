// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualMachineScaleSetVMExtensions Get. */
public final class VirtualMachineScaleSetVMExtensionsGetSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-07-01/examples/compute/GetVirtualMachineScaleSetVMExtensions.json
     */
    /**
     * Sample code: Get VirtualMachineScaleSet VM extension.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getVirtualMachineScaleSetVMExtension(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachineScaleSetVMExtensions()
            .getWithResponse("myResourceGroup", "myvmScaleSet", "0", "myVMExtension", null, Context.NONE);
    }
}
