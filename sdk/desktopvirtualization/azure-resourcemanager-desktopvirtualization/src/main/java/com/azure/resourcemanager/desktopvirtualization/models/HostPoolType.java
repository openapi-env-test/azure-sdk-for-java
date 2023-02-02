// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** HostPool type for desktop. */
public final class HostPoolType extends ExpandableStringEnum<HostPoolType> {
    /** Static value Personal for HostPoolType. */
    public static final HostPoolType PERSONAL = fromString("Personal");

    /** Static value Pooled for HostPoolType. */
    public static final HostPoolType POOLED = fromString("Pooled");

    /** Static value BYODesktop for HostPoolType. */
    public static final HostPoolType BYODESKTOP = fromString("BYODesktop");

    /**
     * Creates or finds a HostPoolType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding HostPoolType.
     */
    @JsonCreator
    public static HostPoolType fromString(String name) {
        return fromString(name, HostPoolType.class);
    }

    /**
     * Gets known HostPoolType values.
     *
     * @return known HostPoolType values.
     */
    public static Collection<HostPoolType> values() {
        return values(HostPoolType.class);
    }
}
