// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for GalleryApplications Get. */
public final class GalleryApplicationsGetSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-01-03/GalleryRP/examples/galleryExamples/GalleryApplication_Get.json
     */
    /**
     * Sample code: Get a gallery Application.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getAGalleryApplication(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleryApplications()
            .getWithResponse("myResourceGroup", "myGalleryName", "myGalleryApplicationName", Context.NONE);
    }
}
