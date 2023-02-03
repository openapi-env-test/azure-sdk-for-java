// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for ApplicationGateways GetByResourceGroup. */
public final class ApplicationGatewaysGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/ApplicationGatewayGet.json
     */
    /**
     * Sample code: Get ApplicationGateway.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getApplicationGateway(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.applicationGateways().getByResourceGroupWithResponse("rg1", "appgw", Context.NONE);
    }
}
