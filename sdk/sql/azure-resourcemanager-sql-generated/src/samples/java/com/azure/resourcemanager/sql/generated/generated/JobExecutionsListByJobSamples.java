// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.core.util.Context;

/** Samples for JobExecutions ListByJob. */
public final class JobExecutionsListByJobSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/ListJobExecutionsByJob.json
     */
    /**
     * Sample code: List a job's executions.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void listAJobSExecutions(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .jobExecutions()
            .listByJob("group1", "server1", "agent1", "job1", null, null, null, null, null, null, null, Context.NONE);
    }
}
