// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for PrivateEndpoints List. */
public final class PrivateEndpointsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/PrivateEndpointListAll.json
     */
    /**
     * Sample code: List all private endpoints.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void listAllPrivateEndpoints(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.privateEndpoints().list(Context.NONE);
    }
}
