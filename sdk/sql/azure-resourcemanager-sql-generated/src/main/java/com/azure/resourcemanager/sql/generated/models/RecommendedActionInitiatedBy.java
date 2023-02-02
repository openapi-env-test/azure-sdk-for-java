// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Gets if approval for applying this recommended action was given by user/system. */
public enum RecommendedActionInitiatedBy {
    /** Enum value User. */
    USER("User"),

    /** Enum value System. */
    SYSTEM("System");

    /** The actual serialized value for a RecommendedActionInitiatedBy instance. */
    private final String value;

    RecommendedActionInitiatedBy(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a RecommendedActionInitiatedBy instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed RecommendedActionInitiatedBy object, or null if unable to parse.
     */
    @JsonCreator
    public static RecommendedActionInitiatedBy fromString(String value) {
        if (value == null) {
            return null;
        }
        RecommendedActionInitiatedBy[] items = RecommendedActionInitiatedBy.values();
        for (RecommendedActionInitiatedBy item : items) {
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
