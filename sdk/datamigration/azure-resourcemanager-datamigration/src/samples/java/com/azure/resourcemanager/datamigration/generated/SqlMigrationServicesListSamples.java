// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

import com.azure.core.util.Context;

/** Samples for SqlMigrationServices List. */
public final class SqlMigrationServicesListSamples {
    /*
     * x-ms-original-file: specification/datamigration/resource-manager/Microsoft.DataMigration/preview/2022-03-30-preview/examples/ListBySubscriptionMigrationService.json
     */
    /**
     * Sample code: Get Services in the Subscriptions.
     *
     * @param manager Entry point to DataMigrationManager.
     */
    public static void getServicesInTheSubscriptions(
        com.azure.resourcemanager.datamigration.DataMigrationManager manager) {
        manager.sqlMigrationServices().list(Context.NONE);
    }
}
