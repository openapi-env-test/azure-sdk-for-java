// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualMachines PerformMaintenance. */
public final class VirtualMachinesPerformMaintenanceSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-11-01/examples/compute/VirtualMachines_PerformMaintenance_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachines_PerformMaintenance_MinimumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachinesPerformMaintenanceMinimumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().performMaintenance("rgcompute", "aaaaaaaaaa", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-11-01/examples/compute/VirtualMachines_PerformMaintenance_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachines_PerformMaintenance_MaximumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachinesPerformMaintenanceMaximumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().performMaintenance("rgcompute", "aaaaaaa", Context.NONE);
    }
}
