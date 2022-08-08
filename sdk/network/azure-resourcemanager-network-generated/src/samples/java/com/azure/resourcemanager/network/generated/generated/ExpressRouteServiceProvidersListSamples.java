// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for ExpressRouteServiceProviders List. */
public final class ExpressRouteServiceProvidersListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/ExpressRouteProviderList.json
     */
    /**
     * Sample code: List ExpressRoute providers.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void listExpressRouteProviders(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.expressRouteServiceProviders().list(Context.NONE);
    }
}
