// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for SharedGalleryImages List. */
public final class SharedGalleryImagesListSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-07-01/examples/sharedGallery/ListSharedGalleryImages.json
     */
    /**
     * Sample code: Get a gallery.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getAGallery(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.sharedGalleryImages().list("myLocation", "galleryUniqueName", null, Context.NONE);
    }
}
