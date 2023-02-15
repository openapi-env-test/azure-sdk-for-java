// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmesh.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Enumerates the triggers for auto scaling. */
public final class AutoScalingTriggerKind extends ExpandableStringEnum<AutoScalingTriggerKind> {
    /** Static value AverageLoad for AutoScalingTriggerKind. */
    public static final AutoScalingTriggerKind AVERAGE_LOAD = fromString("AverageLoad");

    /**
     * Creates a new instance of AutoScalingTriggerKind value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AutoScalingTriggerKind() {
    }

    /**
     * Creates or finds a AutoScalingTriggerKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AutoScalingTriggerKind.
     */
    @JsonCreator
    public static AutoScalingTriggerKind fromString(String name) {
        return fromString(name, AutoScalingTriggerKind.class);
    }

    /**
     * Gets known AutoScalingTriggerKind values.
     *
     * @return known AutoScalingTriggerKind values.
     */
    public static Collection<AutoScalingTriggerKind> values() {
        return values(AutoScalingTriggerKind.class);
    }
}
