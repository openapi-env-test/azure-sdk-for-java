// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.generated;

import com.azure.core.util.Context;

/** Samples for OpenShiftManagedClusters Delete. */
public final class OpenShiftManagedClustersDeleteSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/stable/2019-04-30/examples/OpenShiftManagedClustersDelete.json
     */
    /**
     * Sample code: Delete OpenShift Managed Cluster.
     *
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void deleteOpenShiftManagedCluster(
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager) {
        manager.openShiftManagedClusters().delete("rg1", "clustername1", Context.NONE);
    }
}
