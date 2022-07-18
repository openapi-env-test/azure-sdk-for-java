// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

import com.azure.resourcemanager.datamigration.models.ProjectFileProperties;

/** Samples for Files CreateOrUpdate. */
public final class FilesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/datamigration/resource-manager/Microsoft.DataMigration/preview/2022-03-30-preview/examples/Files_CreateOrUpdate.json
     */
    /**
     * Sample code: Files_CreateOrUpdate.
     *
     * @param manager Entry point to DataMigrationManager.
     */
    public static void filesCreateOrUpdate(com.azure.resourcemanager.datamigration.DataMigrationManager manager) {
        manager
            .files()
            .define("x114d023d8")
            .withExistingProject("DmsSdkRg", "DmsSdkService", "DmsSdkProject")
            .withProperties(new ProjectFileProperties().withFilePath("DmsSdkFilePath/DmsSdkFile.sql"))
            .create();
    }
}
