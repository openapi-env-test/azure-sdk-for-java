// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for GalleryImages Get. */
public final class GalleryImagesGetSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-10-01/examples/gallery/GetAGalleryImage.json
     */
    /**
     * Sample code: Get a gallery image.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getAGalleryImage(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.galleryImages().getWithResponse("myResourceGroup", "myGalleryName", "myGalleryImageName", Context.NONE);
    }
}
