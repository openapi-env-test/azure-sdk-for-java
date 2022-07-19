// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for ExpressRouteLinks List. */
public final class ExpressRouteLinksListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/ExpressRouteLinkList.json
     */
    /**
     * Sample code: ExpressRouteLinkGet.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void expressRouteLinkGet(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.expressRouteLinks().list("rg1", "portName", Context.NONE);
    }
}
