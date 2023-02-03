// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.models.RunCommandInput;
import java.util.Arrays;

/** Samples for VirtualMachineScaleSetVMs RunCommand. */
public final class VirtualMachineScaleSetVMsRunCommandSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-11-01/examples/runCommandExamples/VirtualMachineScaleSetVMRunCommand.json
     */
    /**
     * Sample code: VirtualMachineScaleSetVMs_RunCommand.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachineScaleSetVMsRunCommand(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachineScaleSetVMs()
            .runCommand(
                "myResourceGroup",
                "myVirtualMachineScaleSet",
                "0",
                new RunCommandInput()
                    .withCommandId("RunPowerShellScript")
                    .withScript(Arrays.asList("Write-Host Hello World!")),
                Context.NONE);
    }
}
