// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmesh.generated;

/** Samples for Gateway ListByResourceGroup. */
public final class GatewayListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/servicefabricmesh/resource-manager/Microsoft.ServiceFabricMesh/preview/2018-09-01-preview/examples/gateways/list_byResourceGroup.json
     */
    /**
     * Sample code: ListGatewaysByResourceGroup.
     *
     * @param manager Entry point to ServiceFabricMeshManager.
     */
    public static void listGatewaysByResourceGroup(
        com.azure.resourcemanager.servicefabricmesh.ServiceFabricMeshManager manager) {
        manager.gateways().listByResourceGroup("sbz_demo", com.azure.core.util.Context.NONE);
    }
}
