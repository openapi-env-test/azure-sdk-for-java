// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RestoreDetailsName. */
public final class RestoreDetailsName extends ExpandableStringEnum<RestoreDetailsName> {
    /** Static value Default for RestoreDetailsName. */
    public static final RestoreDetailsName DEFAULT = fromString("Default");

    /**
     * Creates or finds a RestoreDetailsName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RestoreDetailsName.
     */
    @JsonCreator
    public static RestoreDetailsName fromString(String name) {
        return fromString(name, RestoreDetailsName.class);
    }

    /**
     * Gets known RestoreDetailsName values.
     *
     * @return known RestoreDetailsName values.
     */
    public static Collection<RestoreDetailsName> values() {
        return values(RestoreDetailsName.class);
    }
}
