// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.generated;

import com.azure.core.util.Context;

/** Samples for ManagedClusters ListOutboundNetworkDependenciesEndpoints. */
public final class ManagedClustersListOutboundNetworkDependenciesEndpointsSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/preview/2022-07-02-preview/examples/OutboundNetworkDependenciesEndpointsList.json
     */
    /**
     * Sample code: List OutboundNetworkDependenciesEndpoints by Managed Cluster.
     *
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void listOutboundNetworkDependenciesEndpointsByManagedCluster(
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager) {
        manager.managedClusters().listOutboundNetworkDependenciesEndpoints("rg1", "clustername1", Context.NONE);
    }
}
