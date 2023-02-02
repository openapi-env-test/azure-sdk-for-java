// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** The state of the geo backup policy. */
public enum GeoBackupPolicyState {
    /** Enum value Disabled. */
    DISABLED("Disabled"),

    /** Enum value Enabled. */
    ENABLED("Enabled");

    /** The actual serialized value for a GeoBackupPolicyState instance. */
    private final String value;

    GeoBackupPolicyState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a GeoBackupPolicyState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed GeoBackupPolicyState object, or null if unable to parse.
     */
    @JsonCreator
    public static GeoBackupPolicyState fromString(String value) {
        if (value == null) {
            return null;
        }
        GeoBackupPolicyState[] items = GeoBackupPolicyState.values();
        for (GeoBackupPolicyState item : items) {
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
