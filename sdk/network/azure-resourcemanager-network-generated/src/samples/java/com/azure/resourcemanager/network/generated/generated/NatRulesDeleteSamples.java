// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for NatRules Delete. */
public final class NatRulesDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/NatRuleDelete.json
     */
    /**
     * Sample code: NatRuleDelete.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void natRuleDelete(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.natRules().delete("rg1", "gateway1", "natRule1", Context.NONE);
    }
}
