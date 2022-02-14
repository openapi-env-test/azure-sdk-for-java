// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.models.Gallery;

/** Samples for Galleries Update. */
public final class GalleriesUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-10-01/examples/gallery/UpdateASimpleGallery.json
     */
    /**
     * Sample code: Update a simple gallery.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void updateASimpleGallery(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        Gallery resource =
            manager
                .galleries()
                .getByResourceGroupWithResponse("myResourceGroup", "myGalleryName", null, null, Context.NONE)
                .getValue();
        resource.update().withDescription("This is the gallery description.").apply();
    }
}
