// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.models.ReplicationStatusTypes;

/** Samples for GalleryApplicationVersions Get. */
public final class GalleryApplicationVersionsGetSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-01-03/GalleryRP/examples/galleryExamples/GalleryApplicationVersion_Get.json
     */
    /**
     * Sample code: Get a gallery Application Version.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getAGalleryApplicationVersion(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleryApplicationVersions()
            .getWithResponse(
                "myResourceGroup", "myGalleryName", "myGalleryApplicationName", "1.0.0", null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-01-03/GalleryRP/examples/galleryExamples/GalleryApplicationVersion_Get_WithReplicationStatus.json
     */
    /**
     * Sample code: Get a gallery Application Version with replication status.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getAGalleryApplicationVersionWithReplicationStatus(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleryApplicationVersions()
            .getWithResponse(
                "myResourceGroup",
                "myGalleryName",
                "myGalleryApplicationName",
                "1.0.0",
                ReplicationStatusTypes.REPLICATION_STATUS,
                Context.NONE);
    }
}
