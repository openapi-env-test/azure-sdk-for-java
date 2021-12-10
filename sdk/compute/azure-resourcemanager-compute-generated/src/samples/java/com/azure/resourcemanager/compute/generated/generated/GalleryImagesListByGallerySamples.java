// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for GalleryImages ListByGallery. */
public final class GalleryImagesListByGallerySamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-07-01/examples/gallery/ListGalleryImagesInAGallery.json
     */
    /**
     * Sample code: List gallery images in a gallery.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listGalleryImagesInAGallery(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.galleryImages().listByGallery("myResourceGroup", "myGalleryName", Context.NONE);
    }
}
