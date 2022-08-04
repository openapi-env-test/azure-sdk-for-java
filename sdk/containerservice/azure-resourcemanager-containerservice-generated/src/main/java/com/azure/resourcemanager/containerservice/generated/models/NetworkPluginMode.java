// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for NetworkPluginMode. */
public final class NetworkPluginMode extends ExpandableStringEnum<NetworkPluginMode> {
    /** Static value Overlay for NetworkPluginMode. */
    public static final NetworkPluginMode OVERLAY = fromString("Overlay");

    /**
     * Creates or finds a NetworkPluginMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NetworkPluginMode.
     */
    @JsonCreator
    public static NetworkPluginMode fromString(String name) {
        return fromString(name, NetworkPluginMode.class);
    }

    /**
     * Gets known NetworkPluginMode values.
     *
     * @return known NetworkPluginMode values.
     */
    public static Collection<NetworkPluginMode> values() {
        return values(NetworkPluginMode.class);
    }
}
