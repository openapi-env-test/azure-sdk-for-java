// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for GalleryImageVersions Delete. */
public final class GalleryImageVersionsDeleteSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-03-03/examples/galleryExamples/GalleryImageVersion_Delete.json
     */
    /**
     * Sample code: Delete a gallery image version.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void deleteAGalleryImageVersion(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleryImageVersions()
            .delete("myResourceGroup", "myGalleryName", "myGalleryImageName", "1.0.0", Context.NONE);
    }
}
