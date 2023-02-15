// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for RouteFilters GetByResourceGroup. */
public final class RouteFiltersGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/RouteFilterGet.json
     */
    /**
     * Sample code: RouteFilterGet.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void routeFilterGet(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .routeFilters()
            .getByResourceGroupWithResponse("rg1", "filterName", null, com.azure.core.util.Context.NONE);
    }
}
