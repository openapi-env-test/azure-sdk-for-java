// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for CommunityGalleryImages List. */
public final class CommunityGalleryImagesListSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-03-03/examples/communityGalleryExamples/CommunityGalleryImage_List.json
     */
    /**
     * Sample code: List community gallery images.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listCommunityGalleryImages(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.communityGalleryImages().list("myLocation", "publicGalleryName", Context.NONE);
    }
}
