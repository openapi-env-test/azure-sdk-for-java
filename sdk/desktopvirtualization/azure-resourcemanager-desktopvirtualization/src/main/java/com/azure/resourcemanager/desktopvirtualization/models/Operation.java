// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Operation. */
public final class Operation extends ExpandableStringEnum<Operation> {
    /** Static value Start for Operation. */
    public static final Operation START = fromString("Start");

    /** Static value Revoke for Operation. */
    public static final Operation REVOKE = fromString("Revoke");

    /** Static value Complete for Operation. */
    public static final Operation COMPLETE = fromString("Complete");

    /** Static value Hide for Operation. */
    public static final Operation HIDE = fromString("Hide");

    /** Static value Unhide for Operation. */
    public static final Operation UNHIDE = fromString("Unhide");

    /**
     * Creates or finds a Operation from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Operation.
     */
    @JsonCreator
    public static Operation fromString(String name) {
        return fromString(name, Operation.class);
    }

    /**
     * Gets known Operation values.
     *
     * @return known Operation values.
     */
    public static Collection<Operation> values() {
        return values(Operation.class);
    }
}
