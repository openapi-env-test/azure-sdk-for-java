// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Current status of the validation. */
public final class ValidationStatus extends ExpandableStringEnum<ValidationStatus> {
    /** Static value Default for ValidationStatus. */
    public static final ValidationStatus DEFAULT = fromString("Default");

    /** Static value NotStarted for ValidationStatus. */
    public static final ValidationStatus NOT_STARTED = fromString("NotStarted");

    /** Static value Initialized for ValidationStatus. */
    public static final ValidationStatus INITIALIZED = fromString("Initialized");

    /** Static value InProgress for ValidationStatus. */
    public static final ValidationStatus IN_PROGRESS = fromString("InProgress");

    /** Static value Completed for ValidationStatus. */
    public static final ValidationStatus COMPLETED = fromString("Completed");

    /** Static value CompletedWithIssues for ValidationStatus. */
    public static final ValidationStatus COMPLETED_WITH_ISSUES = fromString("CompletedWithIssues");

    /** Static value Stopped for ValidationStatus. */
    public static final ValidationStatus STOPPED = fromString("Stopped");

    /** Static value Failed for ValidationStatus. */
    public static final ValidationStatus FAILED = fromString("Failed");

    /**
     * Creates or finds a ValidationStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ValidationStatus.
     */
    @JsonCreator
    public static ValidationStatus fromString(String name) {
        return fromString(name, ValidationStatus.class);
    }

    /**
     * Gets known ValidationStatus values.
     *
     * @return known ValidationStatus values.
     */
    public static Collection<ValidationStatus> values() {
        return values(ValidationStatus.class);
    }
}
