// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for ResourceProvider ExpressRouteProviderPort. */
public final class ResourceProviderExpressRouteProviderPortSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/expressRouteProviderPort.json
     */
    /**
     * Sample code: ExpressRouteProviderPort.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void expressRouteProviderPort(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.resourceProviders().expressRouteProviderPortWithResponse("abc", com.azure.core.util.Context.NONE);
    }
}
