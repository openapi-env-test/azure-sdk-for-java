// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AlertSeverity. */
public final class AlertSeverity extends ExpandableStringEnum<AlertSeverity> {
    /** Static value 0 for AlertSeverity. */
    public static final AlertSeverity ZERO = fromString("0");

    /** Static value 1 for AlertSeverity. */
    public static final AlertSeverity ONE = fromString("1");

    /** Static value 2 for AlertSeverity. */
    public static final AlertSeverity TWO = fromString("2");

    /** Static value 3 for AlertSeverity. */
    public static final AlertSeverity THREE = fromString("3");

    /** Static value 4 for AlertSeverity. */
    public static final AlertSeverity FOUR = fromString("4");

    /**
     * Creates or finds a AlertSeverity from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AlertSeverity.
     */
    @JsonCreator
    public static AlertSeverity fromString(String name) {
        return fromString(name, AlertSeverity.class);
    }

    /**
     * Gets known AlertSeverity values.
     *
     * @return known AlertSeverity values.
     */
    public static Collection<AlertSeverity> values() {
        return values(AlertSeverity.class);
    }
}
