// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.resourcemanager.compute.generated.models.GalleryApplicationVersionPublishingProfile;
import com.azure.resourcemanager.compute.generated.models.StorageAccountType;
import com.azure.resourcemanager.compute.generated.models.TargetRegion;
import com.azure.resourcemanager.compute.generated.models.UserArtifactManage;
import com.azure.resourcemanager.compute.generated.models.UserArtifactSource;
import java.time.OffsetDateTime;
import java.util.Arrays;

/** Samples for GalleryApplicationVersions CreateOrUpdate. */
public final class GalleryApplicationVersionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-10-01/examples/gallery/CreateOrUpdateASimpleGalleryApplicationVersion.json
     */
    /**
     * Sample code: Create or update a simple gallery Application Version.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createOrUpdateASimpleGalleryApplicationVersion(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleryApplicationVersions()
            .define("1.0.0")
            .withRegion("West US")
            .withExistingApplication("myResourceGroup", "myGalleryName", "myGalleryApplicationName")
            .withPublishingProfile(
                new GalleryApplicationVersionPublishingProfile()
                    .withTargetRegions(
                        Arrays
                            .asList(
                                new TargetRegion()
                                    .withName("West US")
                                    .withRegionalReplicaCount(1)
                                    .withStorageAccountType(StorageAccountType.STANDARD_LRS)))
                    .withReplicaCount(1)
                    .withEndOfLifeDate(OffsetDateTime.parse("2019-07-01T07:00:00Z"))
                    .withStorageAccountType(StorageAccountType.STANDARD_LRS)
                    .withSource(
                        new UserArtifactSource()
                            .withMediaLink(
                                "https://mystorageaccount.blob.core.windows.net/mycontainer/package.zip?{sasKey}"))
                    .withManageActions(
                        new UserArtifactManage()
                            .withInstall(
                                "powershell -command \"Expand-Archive -Path package.zip -DestinationPath C:\\package\"")
                            .withRemove("del C:\\package ")))
            .create();
    }
}
