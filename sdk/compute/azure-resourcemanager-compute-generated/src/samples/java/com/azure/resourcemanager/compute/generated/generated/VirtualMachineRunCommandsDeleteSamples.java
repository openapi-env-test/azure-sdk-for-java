// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualMachineRunCommands Delete. */
public final class VirtualMachineRunCommandsDeleteSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-07-01/examples/runCommands/DeleteRunCommand.json
     */
    /**
     * Sample code: Delete a run command.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void deleteARunCommand(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachineRunCommands().delete("myResourceGroup", "myVM", "myRunCommand", Context.NONE);
    }
}
