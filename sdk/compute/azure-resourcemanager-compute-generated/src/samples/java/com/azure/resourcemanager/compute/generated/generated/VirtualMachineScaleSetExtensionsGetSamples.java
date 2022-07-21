// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualMachineScaleSetExtensions Get. */
public final class VirtualMachineScaleSetExtensionsGetSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineScaleSetExamples/VirtualMachineScaleSetExtensions_Get_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineScaleSetExtensions_Get_MinimumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachineScaleSetExtensionsGetMinimumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachineScaleSetExtensions()
            .getWithResponse("rgcompute", "a", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineScaleSetExamples/VirtualMachineScaleSetExtensions_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineScaleSetExtensions_Get_MaximumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachineScaleSetExtensionsGetMaximumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachineScaleSetExtensions()
            .getWithResponse("rgcompute", "aaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaa", "aaaaaaa", Context.NONE);
    }
}
