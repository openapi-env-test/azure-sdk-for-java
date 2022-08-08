// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for LocalNetworkGateways GetByResourceGroup. */
public final class LocalNetworkGatewaysGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/LocalNetworkGatewayGet.json
     */
    /**
     * Sample code: GetLocalNetworkGateway.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getLocalNetworkGateway(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.localNetworkGateways().getByResourceGroupWithResponse("rg1", "localgw", Context.NONE);
    }
}
