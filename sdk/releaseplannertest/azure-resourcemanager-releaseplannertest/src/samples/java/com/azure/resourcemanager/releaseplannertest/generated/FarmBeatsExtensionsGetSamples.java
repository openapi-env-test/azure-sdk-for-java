// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.releaseplannertest.generated;

import com.azure.core.util.Context;

/** Samples for FarmBeatsExtensions Get. */
public final class FarmBeatsExtensionsGetSamples {
    /*
     * x-ms-original-file: specification/releaseplannertest/resource-manager/Microsoft.AgFoodPlatform/preview/2021-09-01-preview/examples/FarmBeatsExtensions_Get.json
     */
    /**
     * Sample code: FarmBeatsExtensions_Get.
     *
     * @param manager Entry point to AgriFoodManager.
     */
    public static void farmBeatsExtensionsGet(com.azure.resourcemanager.releaseplannertest.AgriFoodManager manager) {
        manager.farmBeatsExtensions().getWithResponse("DTN.ContentServices", Context.NONE);
    }
}
