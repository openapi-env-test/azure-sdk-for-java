// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for BaselineName. */
public final class BaselineName extends ExpandableStringEnum<BaselineName> {
    /** Static value default for BaselineName. */
    public static final BaselineName DEFAULT = fromString("default");

    /**
     * Creates or finds a BaselineName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BaselineName.
     */
    @JsonCreator
    public static BaselineName fromString(String name) {
        return fromString(name, BaselineName.class);
    }

    /**
     * Gets known BaselineName values.
     *
     * @return known BaselineName values.
     */
    public static Collection<BaselineName> values() {
        return values(BaselineName.class);
    }
}
