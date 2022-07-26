// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualMachineScaleSets ListByLocation. */
public final class VirtualMachineScaleSetsListByLocationSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineScaleSetExamples/VirtualMachineScaleSets_ListBySubscription_ByLocation.json
     */
    /**
     * Sample code: Lists all the VM scale sets under the specified subscription for the specified location.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listsAllTheVMScaleSetsUnderTheSpecifiedSubscriptionForTheSpecifiedLocation(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachineScaleSets().listByLocation("eastus", Context.NONE);
    }
}
