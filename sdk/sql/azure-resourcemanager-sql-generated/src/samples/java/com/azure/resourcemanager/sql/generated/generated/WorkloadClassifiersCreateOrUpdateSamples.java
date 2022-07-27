// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

/** Samples for WorkloadClassifiers CreateOrUpdate. */
public final class WorkloadClassifiersCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/CreateOrUpdateWorkloadClassifierMin.json
     */
    /**
     * Sample code: Create a workload group with the required properties specified.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void createAWorkloadGroupWithTheRequiredPropertiesSpecified(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .workloadClassifiers()
            .define("wlm_workloadclassifier")
            .withExistingWorkloadGroup("Default-SQL-SouthEastAsia", "testsvr", "testdb", "wlm_workloadgroup")
            .withMemberName("dbo")
            .create();
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/CreateOrUpdateWorkloadClassifierMax.json
     */
    /**
     * Sample code: Create a workload group with all properties specified.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void createAWorkloadGroupWithAllPropertiesSpecified(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .workloadClassifiers()
            .define("wlm_workloadclassifier")
            .withExistingWorkloadGroup("Default-SQL-SouthEastAsia", "testsvr", "testdb", "wlm_workloadgroup")
            .withMemberName("dbo")
            .withLabel("test_label")
            .withContext("test_context")
            .withStartTime("12:00")
            .withEndTime("14:00")
            .withImportance("high")
            .create();
    }
}
