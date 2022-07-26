// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.models.RunCommandInput;

/** Samples for VirtualMachines RunCommand. */
public final class VirtualMachinesRunCommandSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/runCommandExamples/VirtualMachineRunCommand.json
     */
    /**
     * Sample code: VirtualMachineRunCommand.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachineRunCommand(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .runCommand(
                "crptestar98131", "vm3036", new RunCommandInput().withCommandId("RunPowerShellScript"), Context.NONE);
    }
}
