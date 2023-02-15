// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmesh.generated;

/** Samples for Network ListByResourceGroup. */
public final class NetworkListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/servicefabricmesh/resource-manager/Microsoft.ServiceFabricMesh/preview/2018-09-01-preview/examples/networks/list_byResourceGroup.json
     */
    /**
     * Sample code: ListNetworksByResourceGroup.
     *
     * @param manager Entry point to ServiceFabricMeshManager.
     */
    public static void listNetworksByResourceGroup(
        com.azure.resourcemanager.servicefabricmesh.ServiceFabricMeshManager manager) {
        manager.networks().listByResourceGroup("sbz_demo", com.azure.core.util.Context.NONE);
    }
}
