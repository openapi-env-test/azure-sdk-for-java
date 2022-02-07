// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RoutingState. */
public final class RoutingState extends ExpandableStringEnum<RoutingState> {
    /** Static value None for RoutingState. */
    public static final RoutingState NONE = fromString("None");

    /** Static value Provisioned for RoutingState. */
    public static final RoutingState PROVISIONED = fromString("Provisioned");

    /** Static value Provisioning for RoutingState. */
    public static final RoutingState PROVISIONING = fromString("Provisioning");

    /** Static value Failed for RoutingState. */
    public static final RoutingState FAILED = fromString("Failed");

    /**
     * Creates or finds a RoutingState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RoutingState.
     */
    @JsonCreator
    public static RoutingState fromString(String name) {
        return fromString(name, RoutingState.class);
    }

    /** @return known RoutingState values. */
    public static Collection<RoutingState> values() {
        return values(RoutingState.class);
    }
}
