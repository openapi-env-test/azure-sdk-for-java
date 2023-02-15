// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for ExpressRoutePortAuthorizations List. */
public final class ExpressRoutePortAuthorizationsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/ExpressRoutePortAuthorizationList.json
     */
    /**
     * Sample code: List ExpressRoutePort Authorization.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void listExpressRoutePortAuthorization(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.expressRoutePortAuthorizations().list("rg1", "expressRoutePortName", com.azure.core.util.Context.NONE);
    }
}
