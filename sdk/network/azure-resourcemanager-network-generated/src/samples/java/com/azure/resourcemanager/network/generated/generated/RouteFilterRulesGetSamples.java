// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for RouteFilterRules Get. */
public final class RouteFilterRulesGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/RouteFilterRuleGet.json
     */
    /**
     * Sample code: RouteFilterRuleGet.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void routeFilterRuleGet(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.routeFilterRules().getWithResponse("rg1", "filterName", "filterName", com.azure.core.util.Context.NONE);
    }
}
