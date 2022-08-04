// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for FirewallPolicyRuleNetworkProtocol. */
public final class FirewallPolicyRuleNetworkProtocol extends ExpandableStringEnum<FirewallPolicyRuleNetworkProtocol> {
    /** Static value TCP for FirewallPolicyRuleNetworkProtocol. */
    public static final FirewallPolicyRuleNetworkProtocol TCP = fromString("TCP");

    /** Static value UDP for FirewallPolicyRuleNetworkProtocol. */
    public static final FirewallPolicyRuleNetworkProtocol UDP = fromString("UDP");

    /** Static value Any for FirewallPolicyRuleNetworkProtocol. */
    public static final FirewallPolicyRuleNetworkProtocol ANY = fromString("Any");

    /** Static value ICMP for FirewallPolicyRuleNetworkProtocol. */
    public static final FirewallPolicyRuleNetworkProtocol ICMP = fromString("ICMP");

    /**
     * Creates or finds a FirewallPolicyRuleNetworkProtocol from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FirewallPolicyRuleNetworkProtocol.
     */
    @JsonCreator
    public static FirewallPolicyRuleNetworkProtocol fromString(String name) {
        return fromString(name, FirewallPolicyRuleNetworkProtocol.class);
    }

    /**
     * Gets known FirewallPolicyRuleNetworkProtocol values.
     *
     * @return known FirewallPolicyRuleNetworkProtocol values.
     */
    public static Collection<FirewallPolicyRuleNetworkProtocol> values() {
        return values(FirewallPolicyRuleNetworkProtocol.class);
    }
}
