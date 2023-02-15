// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for RouteFilters Delete. */
public final class RouteFiltersDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/RouteFilterDelete.json
     */
    /**
     * Sample code: RouteFilterDelete.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void routeFilterDelete(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.routeFilters().delete("rg1", "filterName", com.azure.core.util.Context.NONE);
    }
}
