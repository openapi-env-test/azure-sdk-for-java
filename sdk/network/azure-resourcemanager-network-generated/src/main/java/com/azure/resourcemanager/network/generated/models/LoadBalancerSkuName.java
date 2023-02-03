// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Name of a load balancer SKU. */
public final class LoadBalancerSkuName extends ExpandableStringEnum<LoadBalancerSkuName> {
    /** Static value Basic for LoadBalancerSkuName. */
    public static final LoadBalancerSkuName BASIC = fromString("Basic");

    /** Static value Standard for LoadBalancerSkuName. */
    public static final LoadBalancerSkuName STANDARD = fromString("Standard");

    /** Static value Gateway for LoadBalancerSkuName. */
    public static final LoadBalancerSkuName GATEWAY = fromString("Gateway");

    /**
     * Creates or finds a LoadBalancerSkuName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LoadBalancerSkuName.
     */
    @JsonCreator
    public static LoadBalancerSkuName fromString(String name) {
        return fromString(name, LoadBalancerSkuName.class);
    }

    /**
     * Gets known LoadBalancerSkuName values.
     *
     * @return known LoadBalancerSkuName values.
     */
    public static Collection<LoadBalancerSkuName> values() {
        return values(LoadBalancerSkuName.class);
    }
}
