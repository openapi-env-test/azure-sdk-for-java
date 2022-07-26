// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualMachines ListByLocation. */
public final class VirtualMachinesListByLocationSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachines_ListBySubscription_ByLocation.json
     */
    /**
     * Sample code: Lists all the virtual machines under the specified subscription for the specified location.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listsAllTheVirtualMachinesUnderTheSpecifiedSubscriptionForTheSpecifiedLocation(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().listByLocation("eastus", Context.NONE);
    }
}
