// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.core.util.Context;

/** Samples for InstancePools GetByResourceGroup. */
public final class InstancePoolsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/GetInstancePool.json
     */
    /**
     * Sample code: Get an instance pool.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void getAnInstancePool(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.instancePools().getByResourceGroupWithResponse("group1", "testIP", Context.NONE);
    }
}
