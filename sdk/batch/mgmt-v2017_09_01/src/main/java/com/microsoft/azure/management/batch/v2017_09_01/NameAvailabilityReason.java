/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2017_09_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for NameAvailabilityReason.
 */
public enum NameAvailabilityReason {
    /** Enum value Invalid. */
    INVALID("Invalid"),

    /** Enum value AlreadyExists. */
    ALREADY_EXISTS("AlreadyExists");

    /** The actual serialized value for a NameAvailabilityReason instance. */
    private String value;

    NameAvailabilityReason(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a NameAvailabilityReason instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed NameAvailabilityReason object, or null if unable to parse.
     */
    @JsonCreator
    public static NameAvailabilityReason fromString(String value) {
        NameAvailabilityReason[] items = NameAvailabilityReason.values();
        for (NameAvailabilityReason item : items) {
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
