// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for FirewallPolicies List. */
public final class FirewallPoliciesListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/FirewallPolicyListBySubscription.json
     */
    /**
     * Sample code: List all Firewall Policies for a given subscription.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void listAllFirewallPoliciesForAGivenSubscription(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.firewallPolicies().list(Context.NONE);
    }
}
