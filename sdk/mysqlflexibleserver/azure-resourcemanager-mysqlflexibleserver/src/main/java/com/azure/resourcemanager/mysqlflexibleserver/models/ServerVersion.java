// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ServerVersion. */
public final class ServerVersion extends ExpandableStringEnum<ServerVersion> {
    /** Static value 5.6 for ServerVersion. */
    public static final ServerVersion FIVE_SIX = fromString("5.6");

    /** Static value 5.7 for ServerVersion. */
    public static final ServerVersion FIVE_SEVEN = fromString("5.7");

    /** Static value 8.0 for ServerVersion. */
    public static final ServerVersion EIGHT_ZERO = fromString("8.0");

    /**
     * Creates or finds a ServerVersion from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ServerVersion.
     */
    @JsonCreator
    public static ServerVersion fromString(String name) {
        return fromString(name, ServerVersion.class);
    }

    /**
     * Gets known ServerVersion values.
     *
     * @return known ServerVersion values.
     */
    public static Collection<ServerVersion> values() {
        return values(ServerVersion.class);
    }
}
