// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for ApplicationGateways ListAvailableRequestHeaders. */
public final class ApplicationGatewaysListAvailableRequestHeadersSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/ApplicationGatewayAvailableRequestHeadersGet.json
     */
    /**
     * Sample code: Get Available Request Headers.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getAvailableRequestHeaders(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.applicationGateways().listAvailableRequestHeadersWithResponse(Context.NONE);
    }
}
