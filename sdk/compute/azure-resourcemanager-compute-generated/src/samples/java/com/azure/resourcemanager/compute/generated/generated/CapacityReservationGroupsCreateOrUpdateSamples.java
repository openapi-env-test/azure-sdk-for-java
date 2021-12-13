// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for CapacityReservationGroups CreateOrUpdate. */
public final class CapacityReservationGroupsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-07-01/examples/compute/CreateOrUpdateACapacityReservationGroup.json
     */
    /**
     * Sample code: Create or update a capacity reservation group.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createOrUpdateACapacityReservationGroup(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .capacityReservationGroups()
            .define("myCapacityReservationGroup")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withTags(mapOf("department", "finance"))
            .withZones(Arrays.asList("1", "2"))
            .create();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
