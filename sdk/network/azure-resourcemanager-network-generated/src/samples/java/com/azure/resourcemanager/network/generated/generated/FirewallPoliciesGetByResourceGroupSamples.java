// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for FirewallPolicies GetByResourceGroup. */
public final class FirewallPoliciesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/FirewallPolicyGet.json
     */
    /**
     * Sample code: Get FirewallPolicy.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getFirewallPolicy(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.firewallPolicies().getByResourceGroupWithResponse("rg1", "firewallPolicy", null, Context.NONE);
    }
}
