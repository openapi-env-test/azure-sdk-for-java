// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for CapacityReservationGroups Delete. */
public final class CapacityReservationGroupsDeleteSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/capacityReservationExamples/CapacityReservationGroup_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: CapacityReservationGroups_Delete_MinimumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void capacityReservationGroupsDeleteMinimumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.capacityReservationGroups().deleteWithResponse("rgcompute", "aaaaaaaaaaaaaaaaaaaaaaaaaa", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/capacityReservationExamples/CapacityReservationGroup_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: CapacityReservationGroups_Delete_MaximumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void capacityReservationGroupsDeleteMaximumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.capacityReservationGroups().deleteWithResponse("rgcompute", "a", Context.NONE);
    }
}
