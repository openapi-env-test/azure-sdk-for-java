// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.Context;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetExtension;
import java.io.IOException;
import java.util.Arrays;

/** Samples for VirtualMachineScaleSetExtensions Update. */
public final class VirtualMachineScaleSetExtensionsUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineScaleSetExamples/VirtualMachineScaleSetExtensions_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineScaleSetExtensions_Update_MaximumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachineScaleSetExtensionsUpdateMaximumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) throws IOException {
        VirtualMachineScaleSetExtension resource =
            manager
                .virtualMachineScaleSetExtensions()
                .getWithResponse("rgcompute", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaa", null, Context.NONE)
                .getValue();
        resource
            .update()
            .withForceUpdateTag("aaaaaaaaa")
            .withPublisher("{extension-Publisher}")
            .withTypePropertiesType("{extension-Type}")
            .withTypeHandlerVersion("{handler-version}")
            .withAutoUpgradeMinorVersion(true)
            .withEnableAutomaticUpgrade(true)
            .withSettings(
                SerializerFactory
                    .createDefaultManagementSerializerAdapter()
                    .deserialize("{}", Object.class, SerializerEncoding.JSON))
            .withProtectedSettings(
                SerializerFactory
                    .createDefaultManagementSerializerAdapter()
                    .deserialize("{}", Object.class, SerializerEncoding.JSON))
            .withProvisionAfterExtensions(Arrays.asList("aa"))
            .withSuppressFailures(true)
            .apply();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineScaleSetExamples/VirtualMachineScaleSetExtensions_Update_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineScaleSetExtensions_Update_MinimumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachineScaleSetExtensionsUpdateMinimumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        VirtualMachineScaleSetExtension resource =
            manager
                .virtualMachineScaleSetExtensions()
                .getWithResponse("rgcompute", "aaaaaaaaaaaaaaaaaaaaaaaaaa", "aa", null, Context.NONE)
                .getValue();
        resource.update().apply();
    }
}
