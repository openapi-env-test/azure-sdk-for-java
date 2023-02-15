// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for FirewallPolicies ListByResourceGroup. */
public final class FirewallPoliciesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/FirewallPolicyListByResourceGroup.json
     */
    /**
     * Sample code: List all Firewall Policies for a given resource group.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void listAllFirewallPoliciesForAGivenResourceGroup(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.firewallPolicies().listByResourceGroup("rg1", com.azure.core.util.Context.NONE);
    }
}
