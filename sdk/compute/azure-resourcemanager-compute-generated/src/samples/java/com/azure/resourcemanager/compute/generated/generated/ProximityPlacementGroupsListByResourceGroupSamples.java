// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for ProximityPlacementGroups ListByResourceGroup. */
public final class ProximityPlacementGroupsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-03-01/ComputeRP/examples/proximityPlacementGroupExamples/ProximityPlacementGroup_ListByResourceGroup.json
     */
    /**
     * Sample code: Create a proximity placement group.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAProximityPlacementGroup(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.proximityPlacementGroups().listByResourceGroup("myResourceGroup", Context.NONE);
    }
}
