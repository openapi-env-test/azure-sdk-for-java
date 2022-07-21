// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.core.util.Context;

/** Samples for WorkloadClassifiers Delete. */
public final class WorkloadClassifiersDeleteSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/DeleteWorkloadClassifier.json
     */
    /**
     * Sample code: Delete a workload classifier.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void deleteAWorkloadClassifier(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .workloadClassifiers()
            .delete(
                "Default-SQL-SouthEastAsia",
                "testsvr",
                "testdb",
                "wlm_workloadgroup",
                "wlm_workloadclassifier",
                Context.NONE);
    }
}
