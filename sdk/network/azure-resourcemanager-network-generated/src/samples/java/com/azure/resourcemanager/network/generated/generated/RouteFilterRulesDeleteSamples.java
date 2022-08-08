// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for RouteFilterRules Delete. */
public final class RouteFilterRulesDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/RouteFilterRuleDelete.json
     */
    /**
     * Sample code: RouteFilterRuleDelete.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void routeFilterRuleDelete(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.routeFilterRules().delete("rg1", "filterName", "ruleName", Context.NONE);
    }
}
