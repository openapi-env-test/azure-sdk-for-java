// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualMachineRunCommands GetByVirtualMachine. */
public final class VirtualMachineRunCommandsGetByVirtualMachineSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-11-01/examples/runCommands/GetRunCommand.json
     */
    /**
     * Sample code: Get a run command.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getARunCommand(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachineRunCommands()
            .getByVirtualMachineWithResponse("myResourceGroup", "myVM", "myRunCommand", null, Context.NONE);
    }
}
