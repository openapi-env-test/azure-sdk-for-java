// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RequestUriOperator. */
public final class RequestUriOperator extends ExpandableStringEnum<RequestUriOperator> {
    /** Static value Any for RequestUriOperator. */
    public static final RequestUriOperator ANY = fromString("Any");

    /** Static value Equal for RequestUriOperator. */
    public static final RequestUriOperator EQUAL = fromString("Equal");

    /** Static value Contains for RequestUriOperator. */
    public static final RequestUriOperator CONTAINS = fromString("Contains");

    /** Static value BeginsWith for RequestUriOperator. */
    public static final RequestUriOperator BEGINS_WITH = fromString("BeginsWith");

    /** Static value EndsWith for RequestUriOperator. */
    public static final RequestUriOperator ENDS_WITH = fromString("EndsWith");

    /** Static value LessThan for RequestUriOperator. */
    public static final RequestUriOperator LESS_THAN = fromString("LessThan");

    /** Static value LessThanOrEqual for RequestUriOperator. */
    public static final RequestUriOperator LESS_THAN_OR_EQUAL = fromString("LessThanOrEqual");

    /** Static value GreaterThan for RequestUriOperator. */
    public static final RequestUriOperator GREATER_THAN = fromString("GreaterThan");

    /** Static value GreaterThanOrEqual for RequestUriOperator. */
    public static final RequestUriOperator GREATER_THAN_OR_EQUAL = fromString("GreaterThanOrEqual");

    /** Static value RegEx for RequestUriOperator. */
    public static final RequestUriOperator REG_EX = fromString("RegEx");

    /**
     * Creates or finds a RequestUriOperator from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RequestUriOperator.
     */
    @JsonCreator
    public static RequestUriOperator fromString(String name) {
        return fromString(name, RequestUriOperator.class);
    }

    /**
     * Gets known RequestUriOperator values.
     *
     * @return known RequestUriOperator values.
     */
    public static Collection<RequestUriOperator> values() {
        return values(RequestUriOperator.class);
    }
}
