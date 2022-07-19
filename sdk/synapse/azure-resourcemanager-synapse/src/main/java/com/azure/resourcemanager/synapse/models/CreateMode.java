// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CreateMode. */
public final class CreateMode extends ExpandableStringEnum<CreateMode> {
    /** Static value Default for CreateMode. */
    public static final CreateMode DEFAULT = fromString("Default");

    /** Static value PointInTimeRestore for CreateMode. */
    public static final CreateMode POINT_IN_TIME_RESTORE = fromString("PointInTimeRestore");

    /** Static value Recovery for CreateMode. */
    public static final CreateMode RECOVERY = fromString("Recovery");

    /** Static value Restore for CreateMode. */
    public static final CreateMode RESTORE = fromString("Restore");

    /**
     * Creates or finds a CreateMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CreateMode.
     */
    @JsonCreator
    public static CreateMode fromString(String name) {
        return fromString(name, CreateMode.class);
    }

    /**
     * Gets known CreateMode values.
     *
     * @return known CreateMode values.
     */
    public static Collection<CreateMode> values() {
        return values(CreateMode.class);
    }
}
