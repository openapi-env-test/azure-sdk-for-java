// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.resourcemanager.compute.generated.models.OperatingSystemTypes;

/** Samples for GalleryApplications CreateOrUpdate. */
public final class GalleryApplicationsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-01-03/GalleryRP/examples/galleryExamples/GalleryApplication_Create.json
     */
    /**
     * Sample code: Create or update a simple gallery Application.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createOrUpdateASimpleGalleryApplication(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleryApplications()
            .define("myGalleryApplicationName")
            .withRegion("West US")
            .withExistingGallery("myResourceGroup", "myGalleryName")
            .withDescription("This is the gallery application description.")
            .withEula("This is the gallery application EULA.")
            .withPrivacyStatementUri("myPrivacyStatementUri}")
            .withReleaseNoteUri("myReleaseNoteUri")
            .withSupportedOSType(OperatingSystemTypes.WINDOWS)
            .create();
    }
}
