// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualMachineScaleSets ForceRecoveryServiceFabricPlatformUpdateDomainWalk. */
public final class VirtualMachineScaleSetsForceRecoveryServiceFabricPlatformUpdateDomainWalkSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-11-01/examples/virtualMachineScaleSetExamples/VirtualMachineScaleSets_ForceRecoveryServiceFabricPlatformUpdateDomainWalk_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineScaleSets_ForceRecoveryServiceFabricPlatformUpdateDomainWalk_MinimumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachineScaleSetsForceRecoveryServiceFabricPlatformUpdateDomainWalkMinimumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachineScaleSets()
            .forceRecoveryServiceFabricPlatformUpdateDomainWalkWithResponse(
                "rgcompute", "aaaaaaaaaaaa", 9, null, null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-11-01/examples/virtualMachineScaleSetExamples/VirtualMachineScaleSets_ForceRecoveryServiceFabricPlatformUpdateDomainWalk_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineScaleSets_ForceRecoveryServiceFabricPlatformUpdateDomainWalk_MaximumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachineScaleSetsForceRecoveryServiceFabricPlatformUpdateDomainWalkMaximumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachineScaleSets()
            .forceRecoveryServiceFabricPlatformUpdateDomainWalkWithResponse(
                "rgcompute", "aaaaaaaaaaaaaaaa", 30, null, null, Context.NONE);
    }
}
