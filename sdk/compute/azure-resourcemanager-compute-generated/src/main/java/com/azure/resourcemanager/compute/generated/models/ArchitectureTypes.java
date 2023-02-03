// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Specifies the Architecture Type. */
public final class ArchitectureTypes extends ExpandableStringEnum<ArchitectureTypes> {
    /** Static value x64 for ArchitectureTypes. */
    public static final ArchitectureTypes X64 = fromString("x64");

    /** Static value Arm64 for ArchitectureTypes. */
    public static final ArchitectureTypes ARM64 = fromString("Arm64");

    /**
     * Creates or finds a ArchitectureTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ArchitectureTypes.
     */
    @JsonCreator
    public static ArchitectureTypes fromString(String name) {
        return fromString(name, ArchitectureTypes.class);
    }

    /**
     * Gets known ArchitectureTypes values.
     *
     * @return known ArchitectureTypes values.
     */
    public static Collection<ArchitectureTypes> values() {
        return values(ArchitectureTypes.class);
    }
}
