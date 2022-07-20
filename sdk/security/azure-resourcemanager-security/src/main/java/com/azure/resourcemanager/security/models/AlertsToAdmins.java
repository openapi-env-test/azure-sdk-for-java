// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AlertsToAdmins. */
public final class AlertsToAdmins extends ExpandableStringEnum<AlertsToAdmins> {
    /** Static value On for AlertsToAdmins. */
    public static final AlertsToAdmins ON = fromString("On");

    /** Static value Off for AlertsToAdmins. */
    public static final AlertsToAdmins OFF = fromString("Off");

    /**
     * Creates or finds a AlertsToAdmins from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AlertsToAdmins.
     */
    @JsonCreator
    public static AlertsToAdmins fromString(String name) {
        return fromString(name, AlertsToAdmins.class);
    }

    /**
     * Gets known AlertsToAdmins values.
     *
     * @return known AlertsToAdmins values.
     */
    public static Collection<AlertsToAdmins> values() {
        return values(AlertsToAdmins.class);
    }
}
