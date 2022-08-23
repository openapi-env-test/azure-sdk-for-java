// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of identity used for the resource. The type 'SystemAssigned,UserAssigned' includes both an implicitly
 * created identity and a set of user assigned identities. The type 'None' will remove any identities from the service.
 */
public enum ResourceIdentityType {
    /** Enum value SystemAssigned. */
    SYSTEM_ASSIGNED("SystemAssigned"),

    /** Enum value UserAssigned. */
    USER_ASSIGNED("UserAssigned"),

    /** Enum value SystemAssigned, UserAssigned. */
    SYSTEM_ASSIGNED_USER_ASSIGNED("SystemAssigned, UserAssigned"),

    /** Enum value None. */
    NONE("None");

    /** The actual serialized value for a ResourceIdentityType instance. */
    private final String value;

    ResourceIdentityType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ResourceIdentityType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ResourceIdentityType object, or null if unable to parse.
     */
    @JsonCreator
    public static ResourceIdentityType fromString(String value) {
        if (value == null) {
            return null;
        }
        ResourceIdentityType[] items = ResourceIdentityType.values();
        for (ResourceIdentityType item : items) {
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
