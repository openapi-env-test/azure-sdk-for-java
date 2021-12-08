// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for LocalNetworkGateways ListByResourceGroup. */
public final class LocalNetworkGatewaysListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/LocalNetworkGatewayList.json
     */
    /**
     * Sample code: ListLocalNetworkGateways.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void listLocalNetworkGateways(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.localNetworkGateways().listByResourceGroup("rg1", Context.NONE);
    }
}
