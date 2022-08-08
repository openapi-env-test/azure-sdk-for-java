// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for P2SVpnGateways List. */
public final class P2SVpnGatewaysListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/P2SVpnGatewayList.json
     */
    /**
     * Sample code: P2SVpnGatewayListBySubscription.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void p2SVpnGatewayListBySubscription(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.p2SVpnGateways().list(Context.NONE);
    }
}
