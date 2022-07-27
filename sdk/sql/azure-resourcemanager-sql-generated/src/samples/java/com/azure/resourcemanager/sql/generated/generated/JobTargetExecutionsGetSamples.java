// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.core.util.Context;
import java.util.UUID;

/** Samples for JobTargetExecutions Get. */
public final class JobTargetExecutionsGetSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/GetJobExecutionTarget.json
     */
    /**
     * Sample code: Get a job step target execution.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void getAJobStepTargetExecution(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .jobTargetExecutions()
            .getWithResponse(
                "group1",
                "server1",
                "agent1",
                "job1",
                UUID.fromString("5A86BF65-43AC-F258-2524-9E92992F97CA"),
                "step1",
                UUID.fromString("aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee"),
                Context.NONE);
    }
}
