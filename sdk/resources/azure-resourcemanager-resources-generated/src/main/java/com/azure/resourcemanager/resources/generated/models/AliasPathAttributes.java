// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AliasPathAttributes. */
public final class AliasPathAttributes extends ExpandableStringEnum<AliasPathAttributes> {
    /** Static value None for AliasPathAttributes. */
    public static final AliasPathAttributes NONE = fromString("None");

    /** Static value Modifiable for AliasPathAttributes. */
    public static final AliasPathAttributes MODIFIABLE = fromString("Modifiable");

    /**
     * Creates or finds a AliasPathAttributes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AliasPathAttributes.
     */
    @JsonCreator
    public static AliasPathAttributes fromString(String name) {
        return fromString(name, AliasPathAttributes.class);
    }

    /**
     * Gets known AliasPathAttributes values.
     *
     * @return known AliasPathAttributes values.
     */
    public static Collection<AliasPathAttributes> values() {
        return values(AliasPathAttributes.class);
    }
}
