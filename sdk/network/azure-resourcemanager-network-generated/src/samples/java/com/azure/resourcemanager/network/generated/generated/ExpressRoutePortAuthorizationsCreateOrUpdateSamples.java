// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for ExpressRoutePortAuthorizations CreateOrUpdate. */
public final class ExpressRoutePortAuthorizationsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/ExpressRoutePortAuthorizationCreate.json
     */
    /**
     * Sample code: Create ExpressRoutePort Authorization.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createExpressRoutePortAuthorization(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .expressRoutePortAuthorizations()
            .define("authorizatinName")
            .withExistingExpressRoutePort("rg1", "expressRoutePortName")
            .create();
    }
}
