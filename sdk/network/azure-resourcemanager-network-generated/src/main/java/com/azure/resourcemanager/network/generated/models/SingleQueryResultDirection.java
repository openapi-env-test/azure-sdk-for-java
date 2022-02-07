// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SingleQueryResultDirection. */
public final class SingleQueryResultDirection extends ExpandableStringEnum<SingleQueryResultDirection> {
    /** Static value 0 for SingleQueryResultDirection. */
    public static final SingleQueryResultDirection ZERO = fromInt(0);

    /** Static value 1 for SingleQueryResultDirection. */
    public static final SingleQueryResultDirection ONE = fromInt(1);

    /** Static value 2 for SingleQueryResultDirection. */
    public static final SingleQueryResultDirection TWO = fromInt(2);

    /**
     * Creates or finds a SingleQueryResultDirection from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SingleQueryResultDirection.
     */
    @JsonCreator
    public static SingleQueryResultDirection fromInt(int name) {
        return fromString(String.valueOf(name), SingleQueryResultDirection.class);
    }

    /** @return known SingleQueryResultDirection values. */
    public static Collection<SingleQueryResultDirection> values() {
        return values(SingleQueryResultDirection.class);
    }
}
