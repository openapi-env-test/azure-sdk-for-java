// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The server connection type. */
public final class ServerConnectionType extends ExpandableStringEnum<ServerConnectionType> {
    /** Static value Default for ServerConnectionType. */
    public static final ServerConnectionType DEFAULT = fromString("Default");

    /** Static value Redirect for ServerConnectionType. */
    public static final ServerConnectionType REDIRECT = fromString("Redirect");

    /** Static value Proxy for ServerConnectionType. */
    public static final ServerConnectionType PROXY = fromString("Proxy");

    /**
     * Creates or finds a ServerConnectionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ServerConnectionType.
     */
    @JsonCreator
    public static ServerConnectionType fromString(String name) {
        return fromString(name, ServerConnectionType.class);
    }

    /**
     * Gets known ServerConnectionType values.
     *
     * @return known ServerConnectionType values.
     */
    public static Collection<ServerConnectionType> values() {
        return values(ServerConnectionType.class);
    }
}
