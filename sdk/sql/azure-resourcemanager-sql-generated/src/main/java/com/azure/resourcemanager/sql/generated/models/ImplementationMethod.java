// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Gets the method in which this recommended action can be manually implemented. e.g., TSql, AzurePowerShell. */
public enum ImplementationMethod {
    /** Enum value TSql. */
    TSQL("TSql"),

    /** Enum value AzurePowerShell. */
    AZURE_POWER_SHELL("AzurePowerShell");

    /** The actual serialized value for a ImplementationMethod instance. */
    private final String value;

    ImplementationMethod(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ImplementationMethod instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ImplementationMethod object, or null if unable to parse.
     */
    @JsonCreator
    public static ImplementationMethod fromString(String value) {
        if (value == null) {
            return null;
        }
        ImplementationMethod[] items = ImplementationMethod.values();
        for (ImplementationMethod item : items) {
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
