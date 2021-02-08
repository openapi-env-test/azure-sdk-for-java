// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for FirewallPolicyRuleConditionNetworkProtocol. */
public final class FirewallPolicyRuleConditionNetworkProtocol
    extends ExpandableStringEnum<FirewallPolicyRuleConditionNetworkProtocol> {
    /** Static value TCP for FirewallPolicyRuleConditionNetworkProtocol. */
    public static final FirewallPolicyRuleConditionNetworkProtocol TCP = fromString("TCP");

    /** Static value UDP for FirewallPolicyRuleConditionNetworkProtocol. */
    public static final FirewallPolicyRuleConditionNetworkProtocol UDP = fromString("UDP");

    /** Static value Any for FirewallPolicyRuleConditionNetworkProtocol. */
    public static final FirewallPolicyRuleConditionNetworkProtocol ANY = fromString("Any");

    /** Static value ICMP for FirewallPolicyRuleConditionNetworkProtocol. */
    public static final FirewallPolicyRuleConditionNetworkProtocol ICMP = fromString("ICMP");

    /**
     * Creates or finds a FirewallPolicyRuleConditionNetworkProtocol from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FirewallPolicyRuleConditionNetworkProtocol.
     */
    @JsonCreator
    public static FirewallPolicyRuleConditionNetworkProtocol fromString(String name) {
        return fromString(name, FirewallPolicyRuleConditionNetworkProtocol.class);
    }

    /** @return known FirewallPolicyRuleConditionNetworkProtocol values. */
    public static Collection<FirewallPolicyRuleConditionNetworkProtocol> values() {
        return values(FirewallPolicyRuleConditionNetworkProtocol.class);
    }
}
