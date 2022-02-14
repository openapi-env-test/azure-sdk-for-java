// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for ExpressRoutePortsLocations List. */
public final class ExpressRoutePortsLocationsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/ExpressRoutePortsLocationList.json
     */
    /**
     * Sample code: ExpressRoutePortsLocationList.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void expressRoutePortsLocationList(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.expressRoutePortsLocations().list(Context.NONE);
    }
}
