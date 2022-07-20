// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DependencyType. */
public final class DependencyType extends ExpandableStringEnum<DependencyType> {
    /** Static value RequiredForPrepare for DependencyType. */
    public static final DependencyType REQUIRED_FOR_PREPARE = fromString("RequiredForPrepare");

    /** Static value RequiredForMove for DependencyType. */
    public static final DependencyType REQUIRED_FOR_MOVE = fromString("RequiredForMove");

    /**
     * Creates or finds a DependencyType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DependencyType.
     */
    @JsonCreator
    public static DependencyType fromString(String name) {
        return fromString(name, DependencyType.class);
    }

    /**
     * Gets known DependencyType values.
     *
     * @return known DependencyType values.
     */
    public static Collection<DependencyType> values() {
        return values(DependencyType.class);
    }
}
