// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ExpressRouteLinkMacSecSciState. */
public final class ExpressRouteLinkMacSecSciState extends ExpandableStringEnum<ExpressRouteLinkMacSecSciState> {
    /** Static value Disabled for ExpressRouteLinkMacSecSciState. */
    public static final ExpressRouteLinkMacSecSciState DISABLED = fromString("Disabled");

    /** Static value Enabled for ExpressRouteLinkMacSecSciState. */
    public static final ExpressRouteLinkMacSecSciState ENABLED = fromString("Enabled");

    /**
     * Creates or finds a ExpressRouteLinkMacSecSciState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ExpressRouteLinkMacSecSciState.
     */
    @JsonCreator
    public static ExpressRouteLinkMacSecSciState fromString(String name) {
        return fromString(name, ExpressRouteLinkMacSecSciState.class);
    }

    /**
     * Gets known ExpressRouteLinkMacSecSciState values.
     *
     * @return known ExpressRouteLinkMacSecSciState values.
     */
    public static Collection<ExpressRouteLinkMacSecSciState> values() {
        return values(ExpressRouteLinkMacSecSciState.class);
    }
}
