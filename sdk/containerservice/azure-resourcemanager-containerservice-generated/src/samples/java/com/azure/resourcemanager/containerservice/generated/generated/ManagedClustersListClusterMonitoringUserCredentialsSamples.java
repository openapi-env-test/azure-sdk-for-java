// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.generated;

import com.azure.core.util.Context;

/** Samples for ManagedClusters ListClusterMonitoringUserCredentials. */
public final class ManagedClustersListClusterMonitoringUserCredentialsSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/preview/2022-07-02-preview/examples/ManagedClustersListClusterCredentialResult.json
     */
    /**
     * Sample code: Get Managed Cluster.
     *
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void getManagedCluster(
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager) {
        manager
            .managedClusters()
            .listClusterMonitoringUserCredentialsWithResponse("rg1", "clustername1", null, Context.NONE);
    }
}
