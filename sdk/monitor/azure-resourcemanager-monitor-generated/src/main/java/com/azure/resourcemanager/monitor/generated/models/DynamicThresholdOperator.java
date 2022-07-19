// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DynamicThresholdOperator. */
public final class DynamicThresholdOperator extends ExpandableStringEnum<DynamicThresholdOperator> {
    /** Static value GreaterThan for DynamicThresholdOperator. */
    public static final DynamicThresholdOperator GREATER_THAN = fromString("GreaterThan");

    /** Static value LessThan for DynamicThresholdOperator. */
    public static final DynamicThresholdOperator LESS_THAN = fromString("LessThan");

    /** Static value GreaterOrLessThan for DynamicThresholdOperator. */
    public static final DynamicThresholdOperator GREATER_OR_LESS_THAN = fromString("GreaterOrLessThan");

    /**
     * Creates or finds a DynamicThresholdOperator from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DynamicThresholdOperator.
     */
    @JsonCreator
    public static DynamicThresholdOperator fromString(String name) {
        return fromString(name, DynamicThresholdOperator.class);
    }

    /**
     * Gets known DynamicThresholdOperator values.
     *
     * @return known DynamicThresholdOperator values.
     */
    public static Collection<DynamicThresholdOperator> values() {
        return values(DynamicThresholdOperator.class);
    }
}
