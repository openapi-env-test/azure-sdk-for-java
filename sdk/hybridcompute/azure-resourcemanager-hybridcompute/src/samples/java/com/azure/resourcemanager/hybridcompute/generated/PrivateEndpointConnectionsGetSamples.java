// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.Context;

/** Samples for PrivateEndpointConnections Get. */
public final class PrivateEndpointConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/hybridcompute/resource-manager/Microsoft.HybridCompute/preview/2022-05-10-preview/examples/PrivateEndpointConnectionGet.json
     */
    /**
     * Sample code: Gets private endpoint connection.
     *
     * @param manager Entry point to HybridComputeManager.
     */
    public static void getsPrivateEndpointConnection(
        com.azure.resourcemanager.hybridcompute.HybridComputeManager manager) {
        manager
            .privateEndpointConnections()
            .getWithResponse("myResourceGroup", "myPrivateLinkScope", "private-endpoint-connection-name", Context.NONE);
    }
}
