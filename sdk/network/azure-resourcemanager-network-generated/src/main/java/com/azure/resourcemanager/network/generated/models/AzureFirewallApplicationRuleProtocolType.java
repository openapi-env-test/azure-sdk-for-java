// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The protocol type of a Application Rule resource. */
public final class AzureFirewallApplicationRuleProtocolType
    extends ExpandableStringEnum<AzureFirewallApplicationRuleProtocolType> {
    /** Static value Http for AzureFirewallApplicationRuleProtocolType. */
    public static final AzureFirewallApplicationRuleProtocolType HTTP = fromString("Http");

    /** Static value Https for AzureFirewallApplicationRuleProtocolType. */
    public static final AzureFirewallApplicationRuleProtocolType HTTPS = fromString("Https");

    /** Static value Mssql for AzureFirewallApplicationRuleProtocolType. */
    public static final AzureFirewallApplicationRuleProtocolType MSSQL = fromString("Mssql");

    /**
     * Creates or finds a AzureFirewallApplicationRuleProtocolType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AzureFirewallApplicationRuleProtocolType.
     */
    @JsonCreator
    public static AzureFirewallApplicationRuleProtocolType fromString(String name) {
        return fromString(name, AzureFirewallApplicationRuleProtocolType.class);
    }

    /**
     * Gets known AzureFirewallApplicationRuleProtocolType values.
     *
     * @return known AzureFirewallApplicationRuleProtocolType values.
     */
    public static Collection<AzureFirewallApplicationRuleProtocolType> values() {
        return values(AzureFirewallApplicationRuleProtocolType.class);
    }
}
