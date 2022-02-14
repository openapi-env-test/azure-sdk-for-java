// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.models.GalleryApplication;
import com.azure.resourcemanager.compute.generated.models.OperatingSystemTypes;

/** Samples for GalleryApplications Update. */
public final class GalleryApplicationsUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-10-01/examples/gallery/UpdateASimpleGalleryApplication.json
     */
    /**
     * Sample code: Update a simple gallery Application.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void updateASimpleGalleryApplication(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        GalleryApplication resource =
            manager
                .galleryApplications()
                .getWithResponse("myResourceGroup", "myGalleryName", "myGalleryApplicationName", Context.NONE)
                .getValue();
        resource
            .update()
            .withDescription("This is the gallery application description.")
            .withEula("This is the gallery application EULA.")
            .withPrivacyStatementUri("myPrivacyStatementUri}")
            .withReleaseNoteUri("myReleaseNoteUri")
            .withSupportedOSType(OperatingSystemTypes.WINDOWS)
            .apply();
    }
}
