// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for InboundNatRules Get. */
public final class InboundNatRulesGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/InboundNatRuleGet.json
     */
    /**
     * Sample code: InboundNatRuleGet.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void inboundNatRuleGet(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .inboundNatRules()
            .getWithResponse("testrg", "lb1", "natRule1.1", null, com.azure.core.util.Context.NONE);
    }
}
