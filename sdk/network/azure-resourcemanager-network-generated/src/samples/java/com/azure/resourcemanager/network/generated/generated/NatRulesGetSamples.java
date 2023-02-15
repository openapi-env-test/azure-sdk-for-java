// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for NatRules Get. */
public final class NatRulesGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/NatRuleGet.json
     */
    /**
     * Sample code: NatRuleGet.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void natRuleGet(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.natRules().getWithResponse("rg1", "gateway1", "natRule1", com.azure.core.util.Context.NONE);
    }
}
