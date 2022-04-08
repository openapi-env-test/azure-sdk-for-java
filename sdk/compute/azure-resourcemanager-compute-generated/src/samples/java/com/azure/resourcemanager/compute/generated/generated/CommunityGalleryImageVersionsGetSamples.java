// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for CommunityGalleryImageVersions Get. */
public final class CommunityGalleryImageVersionsGetSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-07-01/examples/communityGallery/GetACommunityGalleryImageVersion.json
     */
    /**
     * Sample code: Get a gallery.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getAGallery(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .communityGalleryImageVersions()
            .getWithResponse(
                "myLocation", "publicGalleryName", "myGalleryImageName", "myGalleryImageVersionName", Context.NONE);
    }
}
