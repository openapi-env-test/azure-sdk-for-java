// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.Context;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetVMExtension;
import java.io.IOException;

/** Samples for VirtualMachineScaleSetVMExtensions Update. */
public final class VirtualMachineScaleSetVMExtensionsUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-11-01/examples/virtualMachineScaleSetExamples/VirtualMachineScaleSetVMExtensions_Update.json
     */
    /**
     * Sample code: Update VirtualMachineScaleSet VM extension.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void updateVirtualMachineScaleSetVMExtension(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) throws IOException {
        VirtualMachineScaleSetVMExtension resource =
            manager
                .virtualMachineScaleSetVMExtensions()
                .getWithResponse("myResourceGroup", "myvmScaleSet", "0", "myVMExtension", null, Context.NONE)
                .getValue();
        resource
            .update()
            .withPublisher("extPublisher")
            .withTypePropertiesType("extType")
            .withTypeHandlerVersion("1.2")
            .withAutoUpgradeMinorVersion(true)
            .withSettings(
                SerializerFactory
                    .createDefaultManagementSerializerAdapter()
                    .deserialize("{\"UserName\":\"xyz@microsoft.com\"}", Object.class, SerializerEncoding.JSON))
            .apply();
    }
}
