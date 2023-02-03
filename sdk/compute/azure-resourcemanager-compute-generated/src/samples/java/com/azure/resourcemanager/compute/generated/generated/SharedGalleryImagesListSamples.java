// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for SharedGalleryImages List. */
public final class SharedGalleryImagesListSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-03-03/examples/sharedGalleryExamples/SharedGalleryImages_List.json
     */
    /**
     * Sample code: List shared gallery images.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listSharedGalleryImages(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.sharedGalleryImages().list("myLocation", "galleryUniqueName", null, Context.NONE);
    }
}
