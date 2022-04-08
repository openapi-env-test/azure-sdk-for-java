// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualMachineScaleSetVMs PowerOff. */
public final class VirtualMachineScaleSetVMsPowerOffSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-11-01/examples/compute/VirtualMachineScaleSetVMs_PowerOff_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineScaleSetVMs_PowerOff_MaximumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachineScaleSetVMsPowerOffMaximumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachineScaleSetVMs().powerOff("rgcompute", "aaaaaa", "aaaaaaaaa", true, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-11-01/examples/compute/VirtualMachineScaleSetVMs_PowerOff_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineScaleSetVMs_PowerOff_MinimumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachineScaleSetVMsPowerOffMinimumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachineScaleSetVMs()
            .powerOff("rgcompute", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa", null, Context.NONE);
    }
}
