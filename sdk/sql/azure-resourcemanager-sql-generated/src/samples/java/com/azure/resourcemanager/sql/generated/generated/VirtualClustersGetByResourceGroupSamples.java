// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualClusters GetByResourceGroup. */
public final class VirtualClustersGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-05-01-preview/examples/VirtualClusterGet.json
     */
    /**
     * Sample code: Gets a virtual cluster.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void getsAVirtualCluster(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .virtualClusters()
            .getByResourceGroupWithResponse("testrg", "vc-f769ed71-b3ad-491a-a9d5-26eeceaa6be2", Context.NONE);
    }
}
