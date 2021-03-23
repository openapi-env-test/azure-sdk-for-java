// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerlockbox.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Decision. */
public final class Decision extends ExpandableStringEnum<Decision> {
    /** Static value Approve for Decision. */
    public static final Decision APPROVE = fromString("Approve");

    /** Static value Deny for Decision. */
    public static final Decision DENY = fromString("Deny");

    /**
     * Creates or finds a Decision from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Decision.
     */
    @JsonCreator
    public static Decision fromString(String name) {
        return fromString(name, Decision.class);
    }

    /** @return known Decision values. */
    public static Collection<Decision> values() {
        return values(Decision.class);
    }
}
