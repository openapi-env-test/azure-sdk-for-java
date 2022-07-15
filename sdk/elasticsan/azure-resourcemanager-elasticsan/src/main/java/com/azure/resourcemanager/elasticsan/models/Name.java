// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Name. */
public final class Name extends ExpandableStringEnum<Name> {
    /** Static value Premium_LRS for Name. */
    public static final Name PREMIUM_LRS = fromString("Premium_LRS");

    /** Static value Premium_ZRS for Name. */
    public static final Name PREMIUM_ZRS = fromString("Premium_ZRS");

    /**
     * Creates or finds a Name from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Name.
     */
    @JsonCreator
    public static Name fromString(String name) {
        return fromString(name, Name.class);
    }

    /**
     * Gets known Name values.
     *
     * @return known Name values.
     */
    public static Collection<Name> values() {
        return values(Name.class);
    }
}
