// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.resourcemanager.compute.generated.models.RunCommandInputParameter;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineRunCommandScriptSource;
import java.util.Arrays;

/** Samples for VirtualMachineRunCommands CreateOrUpdate. */
public final class VirtualMachineRunCommandsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-03-01/ComputeRP/examples/runCommandExamples/VirtualMachineRunCommand_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or update a run command.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createOrUpdateARunCommand(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachineRunCommands()
            .define("myRunCommand")
            .withRegion("West US")
            .withExistingVirtualMachine("myResourceGroup", "myVM")
            .withSource(new VirtualMachineRunCommandScriptSource().withScript("Write-Host Hello World!"))
            .withParameters(
                Arrays
                    .asList(
                        new RunCommandInputParameter().withName("param1").withValue("value1"),
                        new RunCommandInputParameter().withName("param2").withValue("value2")))
            .withAsyncExecution(false)
            .withRunAsUser("user1")
            .withRunAsPassword("<runAsPassword>")
            .withTimeoutInSeconds(3600)
            .create();
    }
}
