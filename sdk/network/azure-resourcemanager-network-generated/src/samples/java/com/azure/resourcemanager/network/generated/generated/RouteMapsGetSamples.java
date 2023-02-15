// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for RouteMaps Get. */
public final class RouteMapsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/RouteMapGet.json
     */
    /**
     * Sample code: RouteMapGet.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void routeMapGet(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.routeMaps().getWithResponse("rg1", "virtualHub1", "routeMap1", com.azure.core.util.Context.NONE);
    }
}
