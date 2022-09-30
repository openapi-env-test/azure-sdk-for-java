// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.generated;

import com.azure.core.util.Context;

/** Samples for Extensions Update. */
public final class ExtensionsUpdateSamples {
    /*
     * x-ms-original-file: specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2020-05-12-preview/examples/Extensions_Update.json
     */
    /**
     * Sample code: Extensions_Update.
     *
     * @param manager Entry point to AgrifoodManager.
     */
    public static void extensionsUpdate(com.azure.resourcemanager.agrifood.AgrifoodManager manager) {
        manager
            .extensions()
            .updateWithResponse("provider.extension", "examples-farmbeatsResourceName", "examples-rg", Context.NONE);
    }
}
