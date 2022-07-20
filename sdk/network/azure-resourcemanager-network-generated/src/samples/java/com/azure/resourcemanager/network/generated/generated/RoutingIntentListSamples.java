// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for RoutingIntent List. */
public final class RoutingIntentListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/RoutingIntentList.json
     */
    /**
     * Sample code: RoutingIntentList.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void routingIntentList(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.routingIntents().list("rg1", "virtualHub1", Context.NONE);
    }
}
