// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AccessReviewInstanceStatus. */
public final class AccessReviewInstanceStatus extends ExpandableStringEnum<AccessReviewInstanceStatus> {
    /** Static value NotStarted for AccessReviewInstanceStatus. */
    public static final AccessReviewInstanceStatus NOT_STARTED = fromString("NotStarted");

    /** Static value InProgress for AccessReviewInstanceStatus. */
    public static final AccessReviewInstanceStatus IN_PROGRESS = fromString("InProgress");

    /** Static value Completed for AccessReviewInstanceStatus. */
    public static final AccessReviewInstanceStatus COMPLETED = fromString("Completed");

    /** Static value Applied for AccessReviewInstanceStatus. */
    public static final AccessReviewInstanceStatus APPLIED = fromString("Applied");

    /** Static value Initializing for AccessReviewInstanceStatus. */
    public static final AccessReviewInstanceStatus INITIALIZING = fromString("Initializing");

    /** Static value Applying for AccessReviewInstanceStatus. */
    public static final AccessReviewInstanceStatus APPLYING = fromString("Applying");

    /** Static value Completing for AccessReviewInstanceStatus. */
    public static final AccessReviewInstanceStatus COMPLETING = fromString("Completing");

    /** Static value Scheduled for AccessReviewInstanceStatus. */
    public static final AccessReviewInstanceStatus SCHEDULED = fromString("Scheduled");

    /** Static value AutoReviewing for AccessReviewInstanceStatus. */
    public static final AccessReviewInstanceStatus AUTO_REVIEWING = fromString("AutoReviewing");

    /** Static value AutoReviewed for AccessReviewInstanceStatus. */
    public static final AccessReviewInstanceStatus AUTO_REVIEWED = fromString("AutoReviewed");

    /** Static value Starting for AccessReviewInstanceStatus. */
    public static final AccessReviewInstanceStatus STARTING = fromString("Starting");

    /**
     * Creates or finds a AccessReviewInstanceStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AccessReviewInstanceStatus.
     */
    @JsonCreator
    public static AccessReviewInstanceStatus fromString(String name) {
        return fromString(name, AccessReviewInstanceStatus.class);
    }

    /** @return known AccessReviewInstanceStatus values. */
    public static Collection<AccessReviewInstanceStatus> values() {
        return values(AccessReviewInstanceStatus.class);
    }
}
