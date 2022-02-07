// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for PrivateEndpoints Delete. */
public final class PrivateEndpointsDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/PrivateEndpointDelete.json
     */
    /**
     * Sample code: Delete private endpoint.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void deletePrivateEndpoint(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.privateEndpoints().delete("rg1", "testPe", Context.NONE);
    }
}
