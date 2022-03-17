// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for HubVirtualNetworkConnections Get. */
public final class HubVirtualNetworkConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/HubVirtualNetworkConnectionGet.json
     */
    /**
     * Sample code: HubVirtualNetworkConnectionGet.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void hubVirtualNetworkConnectionGet(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.hubVirtualNetworkConnections().getWithResponse("rg1", "virtualHub1", "connection1", Context.NONE);
    }
}
