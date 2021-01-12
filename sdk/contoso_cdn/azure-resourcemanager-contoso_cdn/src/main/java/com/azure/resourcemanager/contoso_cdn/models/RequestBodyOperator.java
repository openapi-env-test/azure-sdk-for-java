// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.contoso_cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RequestBodyOperator. */
public final class RequestBodyOperator extends ExpandableStringEnum<RequestBodyOperator> {
    /** Static value Any for RequestBodyOperator. */
    public static final RequestBodyOperator ANY = fromString("Any");

    /** Static value Equal for RequestBodyOperator. */
    public static final RequestBodyOperator EQUAL = fromString("Equal");

    /** Static value Contains for RequestBodyOperator. */
    public static final RequestBodyOperator CONTAINS = fromString("Contains");

    /** Static value BeginsWith for RequestBodyOperator. */
    public static final RequestBodyOperator BEGINS_WITH = fromString("BeginsWith");

    /** Static value EndsWith for RequestBodyOperator. */
    public static final RequestBodyOperator ENDS_WITH = fromString("EndsWith");

    /** Static value LessThan for RequestBodyOperator. */
    public static final RequestBodyOperator LESS_THAN = fromString("LessThan");

    /** Static value LessThanOrEqual for RequestBodyOperator. */
    public static final RequestBodyOperator LESS_THAN_OR_EQUAL = fromString("LessThanOrEqual");

    /** Static value GreaterThan for RequestBodyOperator. */
    public static final RequestBodyOperator GREATER_THAN = fromString("GreaterThan");

    /** Static value GreaterThanOrEqual for RequestBodyOperator. */
    public static final RequestBodyOperator GREATER_THAN_OR_EQUAL = fromString("GreaterThanOrEqual");

    /** Static value RegEx for RequestBodyOperator. */
    public static final RequestBodyOperator REG_EX = fromString("RegEx");

    /**
     * Creates or finds a RequestBodyOperator from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RequestBodyOperator.
     */
    @JsonCreator
    public static RequestBodyOperator fromString(String name) {
        return fromString(name, RequestBodyOperator.class);
    }

    /** @return known RequestBodyOperator values. */
    public static Collection<RequestBodyOperator> values() {
        return values(RequestBodyOperator.class);
    }
}
