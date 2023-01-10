// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Severity of the alert. */
public final class AlertSeverity extends ExpandableStringEnum<AlertSeverity> {
    /** Static value Informational for AlertSeverity. */
    public static final AlertSeverity INFORMATIONAL = fromString("Informational");

    /** Static value Warning for AlertSeverity. */
    public static final AlertSeverity WARNING = fromString("Warning");

    /** Static value Critical for AlertSeverity. */
    public static final AlertSeverity CRITICAL = fromString("Critical");

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
