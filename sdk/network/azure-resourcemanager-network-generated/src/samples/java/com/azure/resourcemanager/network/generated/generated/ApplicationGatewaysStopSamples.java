// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for ApplicationGateways Stop. */
public final class ApplicationGatewaysStopSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/ApplicationGatewayStop.json
     */
    /**
     * Sample code: Stop Application Gateway.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void stopApplicationGateway(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.applicationGateways().stop("rg1", "appgw", Context.NONE);
    }
}
