// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for RouteFilters List. */
public final class RouteFiltersListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/RouteFilterList.json
     */
    /**
     * Sample code: RouteFilterList.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void routeFilterList(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.routeFilters().list(com.azure.core.util.Context.NONE);
    }
}
