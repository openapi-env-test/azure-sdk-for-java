// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for ApplicationGateways Start. */
public final class ApplicationGatewaysStartSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/ApplicationGatewayStart.json
     */
    /**
     * Sample code: Start Application Gateway.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void startApplicationGateway(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.applicationGateways().start("rg1", "appgw", Context.NONE);
    }
}
