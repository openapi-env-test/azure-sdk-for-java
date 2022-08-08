// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for FirewallPolicyRuleCollectionGroups Get. */
public final class FirewallPolicyRuleCollectionGroupsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/FirewallPolicyNatRuleCollectionGroupGet.json
     */
    /**
     * Sample code: Get FirewallPolicyNatRuleCollectionGroup.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getFirewallPolicyNatRuleCollectionGroup(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .firewallPolicyRuleCollectionGroups()
            .getWithResponse("rg1", "firewallPolicy", "ruleCollectionGroup1", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/FirewallPolicyRuleCollectionGroupWithWebCategoriesGet.json
     */
    /**
     * Sample code: Get FirewallPolicyRuleCollectionGroup With Web Categories.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getFirewallPolicyRuleCollectionGroupWithWebCategories(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .firewallPolicyRuleCollectionGroups()
            .getWithResponse("rg1", "firewallPolicy", "ruleCollectionGroup1", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/FirewallPolicyRuleCollectionGroupGet.json
     */
    /**
     * Sample code: Get FirewallPolicyRuleCollectionGroup.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getFirewallPolicyRuleCollectionGroup(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .firewallPolicyRuleCollectionGroups()
            .getWithResponse("rg1", "firewallPolicy", "ruleCollectionGroup1", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/FirewallPolicyRuleCollectionGroupWithIpGroupsGet.json
     */
    /**
     * Sample code: Get FirewallPolicyRuleCollectionGroup With IpGroups.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getFirewallPolicyRuleCollectionGroupWithIpGroups(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .firewallPolicyRuleCollectionGroups()
            .getWithResponse("rg1", "firewallPolicy", "ruleGroup1", Context.NONE);
    }
}
