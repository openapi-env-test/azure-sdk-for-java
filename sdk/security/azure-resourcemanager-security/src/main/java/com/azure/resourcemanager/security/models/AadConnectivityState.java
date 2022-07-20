// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AadConnectivityState. */
public final class AadConnectivityState extends ExpandableStringEnum<AadConnectivityState> {
    /** Static value Discovered for AadConnectivityState. */
    public static final AadConnectivityState DISCOVERED = fromString("Discovered");

    /** Static value NotLicensed for AadConnectivityState. */
    public static final AadConnectivityState NOT_LICENSED = fromString("NotLicensed");

    /** Static value Connected for AadConnectivityState. */
    public static final AadConnectivityState CONNECTED = fromString("Connected");

    /**
     * Creates or finds a AadConnectivityState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AadConnectivityState.
     */
    @JsonCreator
    public static AadConnectivityState fromString(String name) {
        return fromString(name, AadConnectivityState.class);
    }

    /**
     * Gets known AadConnectivityState values.
     *
     * @return known AadConnectivityState values.
     */
    public static Collection<AadConnectivityState> values() {
        return values(AadConnectivityState.class);
    }
}
