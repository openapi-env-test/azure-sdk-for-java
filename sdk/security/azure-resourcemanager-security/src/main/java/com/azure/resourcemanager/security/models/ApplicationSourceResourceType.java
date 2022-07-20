// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ApplicationSourceResourceType. */
public final class ApplicationSourceResourceType extends ExpandableStringEnum<ApplicationSourceResourceType> {
    /** Static value Assessments for ApplicationSourceResourceType. */
    public static final ApplicationSourceResourceType ASSESSMENTS = fromString("Assessments");

    /**
     * Creates or finds a ApplicationSourceResourceType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ApplicationSourceResourceType.
     */
    @JsonCreator
    public static ApplicationSourceResourceType fromString(String name) {
        return fromString(name, ApplicationSourceResourceType.class);
    }

    /**
     * Gets known ApplicationSourceResourceType values.
     *
     * @return known ApplicationSourceResourceType values.
     */
    public static Collection<ApplicationSourceResourceType> values() {
        return values(ApplicationSourceResourceType.class);
    }
}
