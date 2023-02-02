// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

import com.azure.core.util.Context;

/** Samples for SqlMigrationServices ListByResourceGroup. */
public final class SqlMigrationServicesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/datamigration/resource-manager/Microsoft.DataMigration/preview/2022-03-30-preview/examples/ListByResourceGroupMigrationService.json
     */
    /**
     * Sample code: Get Migration Services in the Resource Group.
     *
     * @param manager Entry point to DataMigrationManager.
     */
    public static void getMigrationServicesInTheResourceGroup(
        com.azure.resourcemanager.datamigration.DataMigrationManager manager) {
        manager.sqlMigrationServices().listByResourceGroup("testrg", Context.NONE);
    }
}
