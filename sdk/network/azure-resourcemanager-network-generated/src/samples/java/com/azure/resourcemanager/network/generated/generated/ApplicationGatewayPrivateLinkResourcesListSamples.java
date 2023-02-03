// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for ApplicationGatewayPrivateLinkResources List. */
public final class ApplicationGatewayPrivateLinkResourcesListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/ApplicationGatewayPrivateLinkResourceList.json
     */
    /**
     * Sample code: Lists all private link resources on application gateway.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void listsAllPrivateLinkResourcesOnApplicationGateway(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.applicationGatewayPrivateLinkResources().list("rg1", "appgw", Context.NONE);
    }
}
