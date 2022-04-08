// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.models.ProximityPlacementGroup;
import java.util.HashMap;
import java.util.Map;

/** Samples for ProximityPlacementGroups Update. */
public final class ProximityPlacementGroupsUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-11-01/examples/compute/PatchAProximityPlacementGroup.json
     */
    /**
     * Sample code: Create a proximity placement group.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAProximityPlacementGroup(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        ProximityPlacementGroup resource =
            manager
                .proximityPlacementGroups()
                .getByResourceGroupWithResponse("myResourceGroup", "myProximityPlacementGroup", null, Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("additionalProp1", "string")).apply();
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
