// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.core.util.Context;
import java.util.UUID;

/** Samples for ElasticPoolOperations Cancel. */
public final class ElasticPoolOperationsCancelSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/CancelElasticPoolOperation.json
     */
    /**
     * Sample code: Cancel the elastic pool management operation.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void cancelTheElasticPoolManagementOperation(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .elasticPoolOperations()
            .cancelWithResponse(
                "sqlcrudtest-7398",
                "sqlcrudtest-6661",
                "testpool",
                UUID.fromString("f779414b-e748-4925-8cfe-c8598f7660ae"),
                Context.NONE);
    }
}
