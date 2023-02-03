// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.resourcemanager.network.generated.models.SecurityRuleAccess;
import com.azure.resourcemanager.network.generated.models.SecurityRuleDirection;
import com.azure.resourcemanager.network.generated.models.SecurityRuleProtocol;

/** Samples for SecurityRules CreateOrUpdate. */
public final class SecurityRulesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/NetworkSecurityGroupRuleCreate.json
     */
    /**
     * Sample code: Create security rule.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createSecurityRule(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .securityRules()
            .define("rule1")
            .withExistingNetworkSecurityGroup("rg1", "testnsg")
            .withProtocol(SecurityRuleProtocol.ASTERISK)
            .withSourcePortRange("*")
            .withDestinationPortRange("8080")
            .withSourceAddressPrefix("10.0.0.0/8")
            .withDestinationAddressPrefix("11.0.0.0/8")
            .withAccess(SecurityRuleAccess.DENY)
            .withPriority(100)
            .withDirection(SecurityRuleDirection.OUTBOUND)
            .create();
    }
}
