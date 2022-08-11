// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.generated;

import java.util.HashMap;
import java.util.Map;

/** Samples for FarmBeatsModels CreateOrUpdate. */
public final class FarmBeatsModelsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2022-08-02-preview/examples/FarmBeatsModels_CreateOrUpdate.json
     */
    /**
     * Sample code: FarmBeatsModels_CreateOrUpdate.
     *
     * @param manager Entry point to AgrifoodManager.
     */
    public static void farmBeatsModelsCreateOrUpdate(com.azure.resourcemanager.agrifood.AgrifoodManager manager) {
        manager
            .farmBeatsModels()
            .define("examples-farmbeatsResourceName")
            .withRegion("eastus2")
            .withExistingResourceGroup("examples-rg")
            .withTags(mapOf("key1", "value1", "key2", "value2"))
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
