// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for SharedGalleryImageVersions List. */
public final class SharedGalleryImageVersionsListSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-03-03/examples/sharedGalleryExamples/SharedGalleryImageVersions_List.json
     */
    /**
     * Sample code: List shared gallery image versions.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listSharedGalleryImageVersions(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .sharedGalleryImageVersions()
            .list("myLocation", "galleryUniqueName", "myGalleryImageName", null, Context.NONE);
    }
}
