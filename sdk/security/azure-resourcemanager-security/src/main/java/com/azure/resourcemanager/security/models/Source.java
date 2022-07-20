// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Source. */
public final class Source extends ExpandableStringEnum<Source> {
    /** Static value Azure for Source. */
    public static final Source AZURE = fromString("Azure");

    /** Static value OnPremise for Source. */
    public static final Source ON_PREMISE = fromString("OnPremise");

    /** Static value OnPremiseSql for Source. */
    public static final Source ON_PREMISE_SQL = fromString("OnPremiseSql");

    /**
     * Creates or finds a Source from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Source.
     */
    @JsonCreator
    public static Source fromString(String name) {
        return fromString(name, Source.class);
    }

    /**
     * Gets known Source values.
     *
     * @return known Source values.
     */
    public static Collection<Source> values() {
        return values(Source.class);
    }
}
