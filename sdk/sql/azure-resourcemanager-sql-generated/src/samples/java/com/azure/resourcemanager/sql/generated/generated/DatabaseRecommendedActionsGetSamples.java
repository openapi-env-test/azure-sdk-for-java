// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.core.util.Context;

/** Samples for DatabaseRecommendedActions Get. */
public final class DatabaseRecommendedActionsGetSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/DatabaseRecommendedActionGet.json
     */
    /**
     * Sample code: Get database recommended action.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void getDatabaseRecommendedAction(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .databaseRecommendedActions()
            .getWithResponse(
                "workloadinsight-demos",
                "misosisvr",
                "IndexAdvisor_test_3",
                "CreateIndex",
                "IR_[CRM]_[DataPoints]_4821CD2F9510D98184BB",
                Context.NONE);
    }
}
