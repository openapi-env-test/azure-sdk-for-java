// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

import com.azure.core.util.Context;

/** Samples for Services CheckStatus. */
public final class ServicesCheckStatusSamples {
    /*
     * x-ms-original-file: specification/datamigration/resource-manager/Microsoft.DataMigration/preview/2022-03-30-preview/examples/Services_CheckStatus.json
     */
    /**
     * Sample code: Services_CheckStatus.
     *
     * @param manager Entry point to DataMigrationManager.
     */
    public static void servicesCheckStatus(com.azure.resourcemanager.datamigration.DataMigrationManager manager) {
        manager.services().checkStatusWithResponse("DmsSdkRg", "DmsSdkService", Context.NONE);
    }
}
