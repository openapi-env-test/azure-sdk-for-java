// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The secondary type of the database if it is a secondary. Valid values are Geo, Named and Standby. */
public final class SecondaryType extends ExpandableStringEnum<SecondaryType> {
    /** Static value Geo for SecondaryType. */
    public static final SecondaryType GEO = fromString("Geo");

    /** Static value Named for SecondaryType. */
    public static final SecondaryType NAMED = fromString("Named");

    /** Static value Standby for SecondaryType. */
    public static final SecondaryType STANDBY = fromString("Standby");

    /**
     * Creates or finds a SecondaryType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SecondaryType.
     */
    @JsonCreator
    public static SecondaryType fromString(String name) {
        return fromString(name, SecondaryType.class);
    }

    /**
     * Gets known SecondaryType values.
     *
     * @return known SecondaryType values.
     */
    public static Collection<SecondaryType> values() {
        return values(SecondaryType.class);
    }
}
