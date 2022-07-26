// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.models.RestorePointCollection;
import com.azure.resourcemanager.compute.generated.models.RestorePointCollectionSourceProperties;
import java.util.HashMap;
import java.util.Map;

/** Samples for RestorePointCollections Update. */
public final class RestorePointCollectionsUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/restorePointExamples/RestorePointCollections_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: RestorePointCollections_Update_MaximumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void restorePointCollectionsUpdateMaximumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        RestorePointCollection resource =
            manager
                .restorePointCollections()
                .getByResourceGroupWithResponse("rgcompute", "aaaaaaaaaaaaaaaaaaaa", null, Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("key8536", "aaaaaaaaaaaaaaaaaaa"))
            .withSource(
                new RestorePointCollectionSourceProperties()
                    .withId(
                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/virtualMachines/myVM"))
            .apply();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/restorePointExamples/RestorePointCollections_Update_MinimumSet_Gen.json
     */
    /**
     * Sample code: RestorePointCollections_Update_MinimumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void restorePointCollectionsUpdateMinimumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        RestorePointCollection resource =
            manager
                .restorePointCollections()
                .getByResourceGroupWithResponse("rgcompute", "aaaaaaaaaaaaaaaaaa", null, Context.NONE)
                .getValue();
        resource.update().apply();
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
