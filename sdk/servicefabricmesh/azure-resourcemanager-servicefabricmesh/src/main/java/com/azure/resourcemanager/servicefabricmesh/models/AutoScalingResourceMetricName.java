// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmesh.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Enumerates the resources that are used for triggering auto scaling. */
public final class AutoScalingResourceMetricName extends ExpandableStringEnum<AutoScalingResourceMetricName> {
    /** Static value cpu for AutoScalingResourceMetricName. */
    public static final AutoScalingResourceMetricName CPU = fromString("cpu");

    /** Static value memoryInGB for AutoScalingResourceMetricName. */
    public static final AutoScalingResourceMetricName MEMORY_IN_GB = fromString("memoryInGB");

    /**
     * Creates a new instance of AutoScalingResourceMetricName value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AutoScalingResourceMetricName() {
    }

    /**
     * Creates or finds a AutoScalingResourceMetricName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AutoScalingResourceMetricName.
     */
    @JsonCreator
    public static AutoScalingResourceMetricName fromString(String name) {
        return fromString(name, AutoScalingResourceMetricName.class);
    }

    /**
     * Gets known AutoScalingResourceMetricName values.
     *
     * @return known AutoScalingResourceMetricName values.
     */
    public static Collection<AutoScalingResourceMetricName> values() {
        return values(AutoScalingResourceMetricName.class);
    }
}
