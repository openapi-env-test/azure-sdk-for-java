// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for FirewallPolicyRuleCollectionGroups Delete. */
public final class FirewallPolicyRuleCollectionGroupsDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/FirewallPolicyRuleCollectionGroupDelete.json
     */
    /**
     * Sample code: Delete FirewallPolicyRuleCollectionGroup.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void deleteFirewallPolicyRuleCollectionGroup(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .firewallPolicyRuleCollectionGroups()
            .delete("rg1", "firewallPolicy", "ruleCollectionGroup1", Context.NONE);
    }
}
