// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for ApplicationGateways ListAvailableSslOptions. */
public final class ApplicationGatewaysListAvailableSslOptionsSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/ApplicationGatewayAvailableSslOptionsGet.json
     */
    /**
     * Sample code: Get Available Ssl Options.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getAvailableSslOptions(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.applicationGateways().listAvailableSslOptionsWithResponse(Context.NONE);
    }
}
