// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewInstanceStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Access Review Instance. */
@JsonFlatten
@Fluent
public class AccessReviewInstanceInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AccessReviewInstanceInner.class);

    /*
     * This read-only field specifies the status of an access review instance.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private AccessReviewInstanceStatus status;

    /*
     * The DateTime when the review instance is scheduled to be start.
     */
    @JsonProperty(value = "properties.startDateTime")
    private OffsetDateTime startDateTime;

    /*
     * The DateTime when the review instance is scheduled to end.
     */
    @JsonProperty(value = "properties.endDateTime")
    private OffsetDateTime endDateTime;

    /**
     * Get the status property: This read-only field specifies the status of an access review instance.
     *
     * @return the status value.
     */
    public AccessReviewInstanceStatus status() {
        return this.status;
    }

    /**
     * Get the startDateTime property: The DateTime when the review instance is scheduled to be start.
     *
     * @return the startDateTime value.
     */
    public OffsetDateTime startDateTime() {
        return this.startDateTime;
    }

    /**
     * Set the startDateTime property: The DateTime when the review instance is scheduled to be start.
     *
     * @param startDateTime the startDateTime value to set.
     * @return the AccessReviewInstanceInner object itself.
     */
    public AccessReviewInstanceInner withStartDateTime(OffsetDateTime startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    /**
     * Get the endDateTime property: The DateTime when the review instance is scheduled to end.
     *
     * @return the endDateTime value.
     */
    public OffsetDateTime endDateTime() {
        return this.endDateTime;
    }

    /**
     * Set the endDateTime property: The DateTime when the review instance is scheduled to end.
     *
     * @param endDateTime the endDateTime value to set.
     * @return the AccessReviewInstanceInner object itself.
     */
    public AccessReviewInstanceInner withEndDateTime(OffsetDateTime endDateTime) {
        this.endDateTime = endDateTime;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
