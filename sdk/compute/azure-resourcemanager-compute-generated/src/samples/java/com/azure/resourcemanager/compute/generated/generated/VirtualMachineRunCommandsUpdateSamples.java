// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineRunCommand;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineRunCommandScriptSource;

/** Samples for VirtualMachineRunCommands Update. */
public final class VirtualMachineRunCommandsUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-11-01/examples/runCommandExamples/VirtualMachineRunCommand_Update.json
     */
    /**
     * Sample code: Update a run command.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void updateARunCommand(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        VirtualMachineRunCommand resource =
            manager
                .virtualMachineRunCommands()
                .getByVirtualMachineWithResponse("myResourceGroup", "myVM", "myRunCommand", null, Context.NONE)
                .getValue();
        resource
            .update()
            .withSource(new VirtualMachineRunCommandScriptSource().withScript("Write-Host Script Source Updated!"))
            .apply();
    }
}
