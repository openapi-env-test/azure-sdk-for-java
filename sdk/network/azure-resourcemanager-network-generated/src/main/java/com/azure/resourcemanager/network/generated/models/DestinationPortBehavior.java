// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DestinationPortBehavior. */
public final class DestinationPortBehavior extends ExpandableStringEnum<DestinationPortBehavior> {
    /** Static value None for DestinationPortBehavior. */
    public static final DestinationPortBehavior NONE = fromString("None");

    /** Static value ListenIfAvailable for DestinationPortBehavior. */
    public static final DestinationPortBehavior LISTEN_IF_AVAILABLE = fromString("ListenIfAvailable");

    /**
     * Creates or finds a DestinationPortBehavior from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DestinationPortBehavior.
     */
    @JsonCreator
    public static DestinationPortBehavior fromString(String name) {
        return fromString(name, DestinationPortBehavior.class);
    }

    /**
     * Gets known DestinationPortBehavior values.
     *
     * @return known DestinationPortBehavior values.
     */
    public static Collection<DestinationPortBehavior> values() {
        return values(DestinationPortBehavior.class);
    }
}
