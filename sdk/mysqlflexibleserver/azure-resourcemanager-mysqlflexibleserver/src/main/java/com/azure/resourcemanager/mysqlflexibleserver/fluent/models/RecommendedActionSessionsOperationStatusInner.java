// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Recommendation action session operation status. */
@Fluent
public final class RecommendedActionSessionsOperationStatusInner {
    /*
     * Operation identifier.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Operation start time.
     */
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /*
     * Operation status.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * Get the name property: Operation identifier.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Operation identifier.
     *
     * @param name the name value to set.
     * @return the RecommendedActionSessionsOperationStatusInner object itself.
     */
    public RecommendedActionSessionsOperationStatusInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the startTime property: Operation start time.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Operation start time.
     *
     * @param startTime the startTime value to set.
     * @return the RecommendedActionSessionsOperationStatusInner object itself.
     */
    public RecommendedActionSessionsOperationStatusInner withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the status property: Operation status.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: Operation status.
     *
     * @param status the status value to set.
     * @return the RecommendedActionSessionsOperationStatusInner object itself.
     */
    public RecommendedActionSessionsOperationStatusInner withStatus(String status) {
        this.status = status;
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
