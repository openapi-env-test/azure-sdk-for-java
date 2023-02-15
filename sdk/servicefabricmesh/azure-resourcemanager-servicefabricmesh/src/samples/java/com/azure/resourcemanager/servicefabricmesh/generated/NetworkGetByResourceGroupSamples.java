// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmesh.generated;

/** Samples for Network GetByResourceGroup. */
public final class NetworkGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/servicefabricmesh/resource-manager/Microsoft.ServiceFabricMesh/preview/2018-09-01-preview/examples/networks/get.json
     */
    /**
     * Sample code: GetNetwork.
     *
     * @param manager Entry point to ServiceFabricMeshManager.
     */
    public static void getNetwork(com.azure.resourcemanager.servicefabricmesh.ServiceFabricMeshManager manager) {
        manager
            .networks()
            .getByResourceGroupWithResponse("sbz_demo", "sampleNetwork", com.azure.core.util.Context.NONE);
    }
}
