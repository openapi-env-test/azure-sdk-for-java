// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for FirewallPolicyIdpsSignaturesOverrides List. */
public final class FirewallPolicyIdpsSignaturesOverridesListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/FirewallPolicySignatureOverridesList.json
     */
    /**
     * Sample code: get signature overrides.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getSignatureOverrides(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.firewallPolicyIdpsSignaturesOverrides().listWithResponse("rg1", "firewallPolicy", Context.NONE);
    }
}
