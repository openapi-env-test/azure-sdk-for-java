// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for DefaultSecurityRules List. */
public final class DefaultSecurityRulesListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/DefaultSecurityRuleList.json
     */
    /**
     * Sample code: DefaultSecurityRuleList.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void defaultSecurityRuleList(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.defaultSecurityRules().list("testrg", "nsg1", Context.NONE);
    }
}
