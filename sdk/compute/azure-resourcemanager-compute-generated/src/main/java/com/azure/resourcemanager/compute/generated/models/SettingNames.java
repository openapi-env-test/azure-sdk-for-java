// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Specifies the name of the setting to which the content applies. Possible values are: FirstLogonCommands and
 * AutoLogon.
 */
public enum SettingNames {
    /** Enum value AutoLogon. */
    AUTO_LOGON("AutoLogon"),

    /** Enum value FirstLogonCommands. */
    FIRST_LOGON_COMMANDS("FirstLogonCommands");

    /** The actual serialized value for a SettingNames instance. */
    private final String value;

    SettingNames(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SettingNames instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed SettingNames object, or null if unable to parse.
     */
    @JsonCreator
    public static SettingNames fromString(String value) {
        if (value == null) {
            return null;
        }
        SettingNames[] items = SettingNames.values();
        for (SettingNames item : items) {
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
