// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmesh.generated;

/** Samples for Gateway List. */
public final class GatewayListSamples {
    /*
     * x-ms-original-file: specification/servicefabricmesh/resource-manager/Microsoft.ServiceFabricMesh/preview/2018-09-01-preview/examples/gateways/list_bySubscriptionId.json
     */
    /**
     * Sample code: ListGatewaysBySubscriptionId.
     *
     * @param manager Entry point to ServiceFabricMeshManager.
     */
    public static void listGatewaysBySubscriptionId(
        com.azure.resourcemanager.servicefabricmesh.ServiceFabricMeshManager manager) {
        manager.gateways().list(com.azure.core.util.Context.NONE);
    }
}
