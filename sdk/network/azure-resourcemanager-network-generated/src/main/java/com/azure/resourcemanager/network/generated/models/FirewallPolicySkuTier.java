// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Tier of Firewall Policy. */
public final class FirewallPolicySkuTier extends ExpandableStringEnum<FirewallPolicySkuTier> {
    /** Static value Standard for FirewallPolicySkuTier. */
    public static final FirewallPolicySkuTier STANDARD = fromString("Standard");

    /** Static value Premium for FirewallPolicySkuTier. */
    public static final FirewallPolicySkuTier PREMIUM = fromString("Premium");

    /** Static value Basic for FirewallPolicySkuTier. */
    public static final FirewallPolicySkuTier BASIC = fromString("Basic");

    /**
     * Creates or finds a FirewallPolicySkuTier from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FirewallPolicySkuTier.
     */
    @JsonCreator
    public static FirewallPolicySkuTier fromString(String name) {
        return fromString(name, FirewallPolicySkuTier.class);
    }

    /**
     * Gets known FirewallPolicySkuTier values.
     *
     * @return known FirewallPolicySkuTier values.
     */
    public static Collection<FirewallPolicySkuTier> values() {
        return values(FirewallPolicySkuTier.class);
    }
}
