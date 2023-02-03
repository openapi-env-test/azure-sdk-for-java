// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** The Last Maintenance Operation Result Code. */
public enum MaintenanceOperationResultCodeTypes {
    /** Enum value None. */
    NONE("None"),

    /** Enum value RetryLater. */
    RETRY_LATER("RetryLater"),

    /** Enum value MaintenanceAborted. */
    MAINTENANCE_ABORTED("MaintenanceAborted"),

    /** Enum value MaintenanceCompleted. */
    MAINTENANCE_COMPLETED("MaintenanceCompleted");

    /** The actual serialized value for a MaintenanceOperationResultCodeTypes instance. */
    private final String value;

    MaintenanceOperationResultCodeTypes(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a MaintenanceOperationResultCodeTypes instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed MaintenanceOperationResultCodeTypes object, or null if unable to parse.
     */
    @JsonCreator
    public static MaintenanceOperationResultCodeTypes fromString(String value) {
        if (value == null) {
            return null;
        }
        MaintenanceOperationResultCodeTypes[] items = MaintenanceOperationResultCodeTypes.values();
        for (MaintenanceOperationResultCodeTypes item : items) {
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
