// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SkuType. */
public final class SkuType extends ExpandableStringEnum<SkuType> {
    /** Static value Unknown for SkuType. */
    public static final SkuType UNKNOWN = fromString("Unknown");

    /** Static value EvolvedPacketCore for SkuType. */
    public static final SkuType EVOLVED_PACKET_CORE = fromString("EvolvedPacketCore");

    /** Static value SDWAN for SkuType. */
    public static final SkuType SDWAN = fromString("SDWAN");

    /** Static value Firewall for SkuType. */
    public static final SkuType FIREWALL = fromString("Firewall");

    /**
     * Creates or finds a SkuType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SkuType.
     */
    @JsonCreator
    public static SkuType fromString(String name) {
        return fromString(name, SkuType.class);
    }

    /**
     * Gets known SkuType values.
     *
     * @return known SkuType values.
     */
    public static Collection<SkuType> values() {
        return values(SkuType.class);
    }
}
