// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.generated;

import com.azure.core.util.Context;

/** Samples for ManagedClusters Start. */
public final class ManagedClustersStartSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/preview/2022-07-02-preview/examples/ManagedClustersStart.json
     */
    /**
     * Sample code: Start Managed Cluster.
     *
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void startManagedCluster(
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager) {
        manager.managedClusters().start("rg1", "clustername1", Context.NONE);
    }
}
