// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Function App stack preferred OS. */
public enum StackPreferredOs {
    /** Enum value Windows. */
    WINDOWS("Windows"),

    /** Enum value Linux. */
    LINUX("Linux");

    /** The actual serialized value for a StackPreferredOs instance. */
    private final String value;

    StackPreferredOs(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a StackPreferredOs instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed StackPreferredOs object, or null if unable to parse.
     */
    @JsonCreator
    public static StackPreferredOs fromString(String value) {
        if (value == null) {
            return null;
        }
        StackPreferredOs[] items = StackPreferredOs.values();
        for (StackPreferredOs item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
