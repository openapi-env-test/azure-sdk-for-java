// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Load balancing algorithm for ramp up period. */
public final class SessionHostLoadBalancingAlgorithm extends ExpandableStringEnum<SessionHostLoadBalancingAlgorithm> {
    /** Static value BreadthFirst for SessionHostLoadBalancingAlgorithm. */
    public static final SessionHostLoadBalancingAlgorithm BREADTH_FIRST = fromString("BreadthFirst");

    /** Static value DepthFirst for SessionHostLoadBalancingAlgorithm. */
    public static final SessionHostLoadBalancingAlgorithm DEPTH_FIRST = fromString("DepthFirst");

    /**
     * Creates or finds a SessionHostLoadBalancingAlgorithm from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SessionHostLoadBalancingAlgorithm.
     */
    @JsonCreator
    public static SessionHostLoadBalancingAlgorithm fromString(String name) {
        return fromString(name, SessionHostLoadBalancingAlgorithm.class);
    }

    /**
     * Gets known SessionHostLoadBalancingAlgorithm values.
     *
     * @return known SessionHostLoadBalancingAlgorithm values.
     */
    public static Collection<SessionHostLoadBalancingAlgorithm> values() {
        return values(SessionHostLoadBalancingAlgorithm.class);
    }
}
