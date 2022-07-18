// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

import com.azure.core.util.Context;

/** Samples for Projects Get. */
public final class ProjectsGetSamples {
    /*
     * x-ms-original-file: specification/datamigration/resource-manager/Microsoft.DataMigration/preview/2022-03-30-preview/examples/Projects_Get.json
     */
    /**
     * Sample code: Projects_Get.
     *
     * @param manager Entry point to DataMigrationManager.
     */
    public static void projectsGet(com.azure.resourcemanager.datamigration.DataMigrationManager manager) {
        manager.projects().getWithResponse("DmsSdkRg", "DmsSdkService", "DmsSdkProject", Context.NONE);
    }
}
