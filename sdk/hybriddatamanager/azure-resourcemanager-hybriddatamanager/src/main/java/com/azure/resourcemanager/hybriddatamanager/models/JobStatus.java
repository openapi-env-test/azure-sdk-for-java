// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybriddatamanager.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for JobStatus. */
public enum JobStatus {
    /** Enum value None. */
    NONE("None"),

    /** Enum value InProgress. */
    IN_PROGRESS("InProgress"),

    /** Enum value Succeeded. */
    SUCCEEDED("Succeeded"),

    /** Enum value WaitingForAction. */
    WAITING_FOR_ACTION("WaitingForAction"),

    /** Enum value Failed. */
    FAILED("Failed"),

    /** Enum value Cancelled. */
    CANCELLED("Cancelled"),

    /** Enum value Cancelling. */
    CANCELLING("Cancelling"),

    /** Enum value PartiallySucceeded. */
    PARTIALLY_SUCCEEDED("PartiallySucceeded");

    /** The actual serialized value for a JobStatus instance. */
    private final String value;

    JobStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a JobStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed JobStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static JobStatus fromString(String value) {
        JobStatus[] items = JobStatus.values();
        for (JobStatus item : items) {
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
