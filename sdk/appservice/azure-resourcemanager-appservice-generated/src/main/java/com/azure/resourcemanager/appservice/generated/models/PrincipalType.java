// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for PrincipalType. */
public enum PrincipalType {
    /** Enum value ActiveDirectory. */
    ACTIVE_DIRECTORY("ActiveDirectory"),

    /** Enum value Connection. */
    CONNECTION("Connection"),

    /** Enum value MicrosoftAccount. */
    MICROSOFT_ACCOUNT("MicrosoftAccount");

    /** The actual serialized value for a PrincipalType instance. */
    private final String value;

    PrincipalType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a PrincipalType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed PrincipalType object, or null if unable to parse.
     */
    @JsonCreator
    public static PrincipalType fromString(String value) {
        PrincipalType[] items = PrincipalType.values();
        for (PrincipalType item : items) {
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
