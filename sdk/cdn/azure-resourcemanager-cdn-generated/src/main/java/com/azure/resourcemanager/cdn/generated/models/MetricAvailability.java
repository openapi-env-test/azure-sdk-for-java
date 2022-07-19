// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Retention policy of a resource metric. */
@Fluent
public final class MetricAvailability {
    /*
     * The timeGrain property.
     */
    @JsonProperty(value = "timeGrain")
    private String timeGrain;

    /*
     * The blobDuration property.
     */
    @JsonProperty(value = "blobDuration")
    private String blobDuration;

    /**
     * Get the timeGrain property: The timeGrain property.
     *
     * @return the timeGrain value.
     */
    public String timeGrain() {
        return this.timeGrain;
    }

    /**
     * Set the timeGrain property: The timeGrain property.
     *
     * @param timeGrain the timeGrain value to set.
     * @return the MetricAvailability object itself.
     */
    public MetricAvailability withTimeGrain(String timeGrain) {
        this.timeGrain = timeGrain;
        return this;
    }

    /**
     * Get the blobDuration property: The blobDuration property.
     *
     * @return the blobDuration value.
     */
    public String blobDuration() {
        return this.blobDuration;
    }

    /**
     * Set the blobDuration property: The blobDuration property.
     *
     * @param blobDuration the blobDuration value to set.
     * @return the MetricAvailability object itself.
     */
    public MetricAvailability withBlobDuration(String blobDuration) {
        this.blobDuration = blobDuration;
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
