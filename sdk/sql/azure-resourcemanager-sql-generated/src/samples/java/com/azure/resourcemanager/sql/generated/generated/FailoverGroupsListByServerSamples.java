// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.core.util.Context;

/** Samples for FailoverGroups ListByServer. */
public final class FailoverGroupsListByServerSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/FailoverGroupList.json
     */
    /**
     * Sample code: List failover group.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void listFailoverGroup(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.failoverGroups().listByServer("Default", "failover-group-primary-server", Context.NONE);
    }
}
