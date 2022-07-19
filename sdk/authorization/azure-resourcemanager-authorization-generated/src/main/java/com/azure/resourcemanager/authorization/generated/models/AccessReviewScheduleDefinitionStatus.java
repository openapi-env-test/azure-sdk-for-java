// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AccessReviewScheduleDefinitionStatus. */
public final class AccessReviewScheduleDefinitionStatus
    extends ExpandableStringEnum<AccessReviewScheduleDefinitionStatus> {
    /** Static value NotStarted for AccessReviewScheduleDefinitionStatus. */
    public static final AccessReviewScheduleDefinitionStatus NOT_STARTED = fromString("NotStarted");

    /** Static value InProgress for AccessReviewScheduleDefinitionStatus. */
    public static final AccessReviewScheduleDefinitionStatus IN_PROGRESS = fromString("InProgress");

    /** Static value Completed for AccessReviewScheduleDefinitionStatus. */
    public static final AccessReviewScheduleDefinitionStatus COMPLETED = fromString("Completed");

    /** Static value Applied for AccessReviewScheduleDefinitionStatus. */
    public static final AccessReviewScheduleDefinitionStatus APPLIED = fromString("Applied");

    /** Static value Initializing for AccessReviewScheduleDefinitionStatus. */
    public static final AccessReviewScheduleDefinitionStatus INITIALIZING = fromString("Initializing");

    /** Static value Applying for AccessReviewScheduleDefinitionStatus. */
    public static final AccessReviewScheduleDefinitionStatus APPLYING = fromString("Applying");

    /** Static value Completing for AccessReviewScheduleDefinitionStatus. */
    public static final AccessReviewScheduleDefinitionStatus COMPLETING = fromString("Completing");

    /** Static value Scheduled for AccessReviewScheduleDefinitionStatus. */
    public static final AccessReviewScheduleDefinitionStatus SCHEDULED = fromString("Scheduled");

    /** Static value AutoReviewing for AccessReviewScheduleDefinitionStatus. */
    public static final AccessReviewScheduleDefinitionStatus AUTO_REVIEWING = fromString("AutoReviewing");

    /** Static value AutoReviewed for AccessReviewScheduleDefinitionStatus. */
    public static final AccessReviewScheduleDefinitionStatus AUTO_REVIEWED = fromString("AutoReviewed");

    /** Static value Starting for AccessReviewScheduleDefinitionStatus. */
    public static final AccessReviewScheduleDefinitionStatus STARTING = fromString("Starting");

    /**
     * Creates or finds a AccessReviewScheduleDefinitionStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AccessReviewScheduleDefinitionStatus.
     */
    @JsonCreator
    public static AccessReviewScheduleDefinitionStatus fromString(String name) {
        return fromString(name, AccessReviewScheduleDefinitionStatus.class);
    }

    /**
     * Gets known AccessReviewScheduleDefinitionStatus values.
     *
     * @return known AccessReviewScheduleDefinitionStatus values.
     */
    public static Collection<AccessReviewScheduleDefinitionStatus> values() {
        return values(AccessReviewScheduleDefinitionStatus.class);
    }
}
