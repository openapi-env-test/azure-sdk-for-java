// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

import com.azure.core.util.Context;

/** Samples for ServiceTasks List. */
public final class ServiceTasksListSamples {
    /*
     * x-ms-original-file: specification/datamigration/resource-manager/Microsoft.DataMigration/preview/2022-03-30-preview/examples/ServiceTasks_List.json
     */
    /**
     * Sample code: ServiceTasks_List.
     *
     * @param manager Entry point to DataMigrationManager.
     */
    public static void serviceTasksList(com.azure.resourcemanager.datamigration.DataMigrationManager manager) {
        manager.serviceTasks().list("DmsSdkRg", "DmsSdkService", null, Context.NONE);
    }
}
