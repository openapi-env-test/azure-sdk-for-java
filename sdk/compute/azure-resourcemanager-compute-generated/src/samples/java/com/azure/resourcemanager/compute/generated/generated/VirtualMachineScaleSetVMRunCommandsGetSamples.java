// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualMachineScaleSetVMRunCommands Get. */
public final class VirtualMachineScaleSetVMRunCommandsGetSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-03-01/ComputeRP/examples/runCommandExamples/VirtualMachineScaleSetVMRunCommand_Get.json
     */
    /**
     * Sample code: Get VirtualMachineScaleSet VM run commands.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getVirtualMachineScaleSetVMRunCommands(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachineScaleSetVMRunCommands()
            .getWithResponse("myResourceGroup", "myvmScaleSet", "0", "myRunCommand", null, Context.NONE);
    }
}
