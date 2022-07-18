// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

import com.azure.core.util.Context;

/** Samples for SqlMigrationServices Delete. */
public final class SqlMigrationServicesDeleteSamples {
    /*
     * x-ms-original-file: specification/datamigration/resource-manager/Microsoft.DataMigration/preview/2022-03-30-preview/examples/DeleteMigrationService.json
     */
    /**
     * Sample code: Delete SQL Migration Service.
     *
     * @param manager Entry point to DataMigrationManager.
     */
    public static void deleteSQLMigrationService(com.azure.resourcemanager.datamigration.DataMigrationManager manager) {
        manager.sqlMigrationServices().delete("testrg", "service1", Context.NONE);
    }
}
