// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for ApplicationGateways List. */
public final class ApplicationGatewaysListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/ApplicationGatewayListAll.json
     */
    /**
     * Sample code: Lists all application gateways in a subscription.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void listsAllApplicationGatewaysInASubscription(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.applicationGateways().list(com.azure.core.util.Context.NONE);
    }
}
