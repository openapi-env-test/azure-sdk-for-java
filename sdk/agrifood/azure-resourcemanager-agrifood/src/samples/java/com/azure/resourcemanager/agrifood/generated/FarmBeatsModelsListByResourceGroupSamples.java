// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.generated;

import com.azure.core.util.Context;

/** Samples for FarmBeatsModels ListByResourceGroup. */
public final class FarmBeatsModelsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2020-05-12-preview/examples/FarmBeatsModels_ListByResourceGroup.json
     */
    /**
     * Sample code: FarmBeatsModels_ListByResourceGroup.
     *
     * @param manager Entry point to AgrifoodManager.
     */
    public static void farmBeatsModelsListByResourceGroup(com.azure.resourcemanager.agrifood.AgrifoodManager manager) {
        manager.farmBeatsModels().listByResourceGroup("examples-rg", null, null, Context.NONE);
    }
}
