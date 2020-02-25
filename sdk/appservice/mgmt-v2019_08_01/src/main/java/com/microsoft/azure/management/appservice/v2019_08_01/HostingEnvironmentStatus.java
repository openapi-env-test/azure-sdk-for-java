/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for HostingEnvironmentStatus.
 */
public enum HostingEnvironmentStatus {
    /** Enum value Preparing. */
    PREPARING("Preparing"),

    /** Enum value Ready. */
    READY("Ready"),

    /** Enum value Scaling. */
    SCALING("Scaling"),

    /** Enum value Deleting. */
    DELETING("Deleting");

    /** The actual serialized value for a HostingEnvironmentStatus instance. */
    private String value;

    HostingEnvironmentStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a HostingEnvironmentStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed HostingEnvironmentStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static HostingEnvironmentStatus fromString(String value) {
        HostingEnvironmentStatus[] items = HostingEnvironmentStatus.values();
        for (HostingEnvironmentStatus item : items) {
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
