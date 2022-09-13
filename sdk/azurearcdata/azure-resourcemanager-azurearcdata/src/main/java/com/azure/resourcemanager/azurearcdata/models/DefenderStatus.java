// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DefenderStatus. */
public final class DefenderStatus extends ExpandableStringEnum<DefenderStatus> {
    /** Static value Protected for DefenderStatus. */
    public static final DefenderStatus PROTECTED = fromString("Protected");

    /** Static value Unprotected for DefenderStatus. */
    public static final DefenderStatus UNPROTECTED = fromString("Unprotected");

    /** Static value Unknown for DefenderStatus. */
    public static final DefenderStatus UNKNOWN = fromString("Unknown");

    /**
     * Creates or finds a DefenderStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DefenderStatus.
     */
    @JsonCreator
    public static DefenderStatus fromString(String name) {
        return fromString(name, DefenderStatus.class);
    }

    /**
     * Gets known DefenderStatus values.
     *
     * @return known DefenderStatus values.
     */
    public static Collection<DefenderStatus> values() {
        return values(DefenderStatus.class);
    }
}
