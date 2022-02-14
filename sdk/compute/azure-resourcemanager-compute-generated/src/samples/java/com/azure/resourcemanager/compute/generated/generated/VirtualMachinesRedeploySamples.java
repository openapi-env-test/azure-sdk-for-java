// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualMachines Redeploy. */
public final class VirtualMachinesRedeploySamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-11-01/examples/compute/VirtualMachines_Redeploy_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachines_Redeploy_MinimumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachinesRedeployMinimumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().redeploy("rgcompute", "aaaaaaaaaaaaaaa", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-11-01/examples/compute/VirtualMachines_Redeploy_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachines_Redeploy_MaximumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachinesRedeployMaximumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().redeploy("rgcompute", "a", Context.NONE);
    }
}
