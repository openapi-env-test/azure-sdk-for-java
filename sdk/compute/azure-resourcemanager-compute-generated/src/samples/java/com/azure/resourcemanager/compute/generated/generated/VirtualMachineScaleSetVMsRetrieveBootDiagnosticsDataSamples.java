// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualMachineScaleSetVMs RetrieveBootDiagnosticsData. */
public final class VirtualMachineScaleSetVMsRetrieveBootDiagnosticsDataSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-07-01/examples/compute/RetrieveBootDiagnosticsDataVMScaleSetVM.json
     */
    /**
     * Sample code: RetrieveBootDiagnosticsData of a virtual machine.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void retrieveBootDiagnosticsDataOfAVirtualMachine(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachineScaleSetVMs()
            .retrieveBootDiagnosticsDataWithResponse("ResourceGroup", "myvmScaleSet", "0", 60, Context.NONE);
    }
}
