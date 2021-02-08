// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for QueryAggregationFunction. */
public enum QueryAggregationFunction {
    /** Enum value min. */
    MIN("min"),

    /** Enum value max. */
    MAX("max"),

    /** Enum value avg. */
    AVG("avg"),

    /** Enum value sum. */
    SUM("sum");

    /** The actual serialized value for a QueryAggregationFunction instance. */
    private final String value;

    QueryAggregationFunction(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a QueryAggregationFunction instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed QueryAggregationFunction object, or null if unable to parse.
     */
    @JsonCreator
    public static QueryAggregationFunction fromString(String value) {
        QueryAggregationFunction[] items = QueryAggregationFunction.values();
        for (QueryAggregationFunction item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
