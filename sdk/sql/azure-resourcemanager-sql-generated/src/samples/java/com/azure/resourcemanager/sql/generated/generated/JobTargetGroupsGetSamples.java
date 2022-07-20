// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.core.util.Context;

/** Samples for JobTargetGroups Get. */
public final class JobTargetGroupsGetSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/GetJobTargetGroup.json
     */
    /**
     * Sample code: Get a target group.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void getATargetGroup(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.jobTargetGroups().getWithResponse("group1", "server1", "agent1", "targetGroup1", Context.NONE);
    }
}
