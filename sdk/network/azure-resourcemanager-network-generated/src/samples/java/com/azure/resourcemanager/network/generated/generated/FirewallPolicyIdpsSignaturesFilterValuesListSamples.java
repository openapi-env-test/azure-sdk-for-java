// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.models.SignatureOverridesFilterValuesQuery;

/** Samples for FirewallPolicyIdpsSignaturesFilterValues List. */
public final class FirewallPolicyIdpsSignaturesFilterValuesListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/FirewallPolicyQuerySignatureOverridesFilterValues.json
     */
    /**
     * Sample code: query signature overrides.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void querySignatureOverrides(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .firewallPolicyIdpsSignaturesFilterValues()
            .listWithResponse(
                "rg1",
                "firewallPolicy",
                new SignatureOverridesFilterValuesQuery().withFilterName("severity"),
                Context.NONE);
    }
}
