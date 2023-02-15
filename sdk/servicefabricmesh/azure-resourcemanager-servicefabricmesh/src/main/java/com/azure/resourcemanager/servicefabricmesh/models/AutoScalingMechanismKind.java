// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmesh.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Enumerates the mechanisms for auto scaling. */
public final class AutoScalingMechanismKind extends ExpandableStringEnum<AutoScalingMechanismKind> {
    /** Static value AddRemoveReplica for AutoScalingMechanismKind. */
    public static final AutoScalingMechanismKind ADD_REMOVE_REPLICA = fromString("AddRemoveReplica");

    /**
     * Creates a new instance of AutoScalingMechanismKind value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AutoScalingMechanismKind() {
    }

    /**
     * Creates or finds a AutoScalingMechanismKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AutoScalingMechanismKind.
     */
    @JsonCreator
    public static AutoScalingMechanismKind fromString(String name) {
        return fromString(name, AutoScalingMechanismKind.class);
    }

    /**
     * Gets known AutoScalingMechanismKind values.
     *
     * @return known AutoScalingMechanismKind values.
     */
    public static Collection<AutoScalingMechanismKind> values() {
        return values(AutoScalingMechanismKind.class);
    }
}
