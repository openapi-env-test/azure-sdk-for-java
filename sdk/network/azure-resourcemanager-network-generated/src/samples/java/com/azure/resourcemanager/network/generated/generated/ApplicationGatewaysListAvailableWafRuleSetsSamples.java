// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for ApplicationGateways ListAvailableWafRuleSets. */
public final class ApplicationGatewaysListAvailableWafRuleSetsSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/ApplicationGatewayAvailableWafRuleSetsGet.json
     */
    /**
     * Sample code: Get Available Waf Rule Sets.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getAvailableWafRuleSets(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.applicationGateways().listAvailableWafRuleSetsWithResponse(Context.NONE);
    }
}
