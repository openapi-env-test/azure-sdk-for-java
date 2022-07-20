// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The availability of the metric. */
@Immutable
public final class MetricAvailability {
    /*
     * The time grain to be used to summarize the metric values.
     */
    @JsonProperty(value = "timeGrain", access = JsonProperty.Access.WRITE_ONLY)
    private String timeGrain;

    /*
     * The retention for the metric values.
     */
    @JsonProperty(value = "retention", access = JsonProperty.Access.WRITE_ONLY)
    private String retention;

    /**
     * Get the timeGrain property: The time grain to be used to summarize the metric values.
     *
     * @return the timeGrain value.
     */
    public String timeGrain() {
        return this.timeGrain;
    }

    /**
     * Get the retention property: The retention for the metric values.
     *
     * @return the retention value.
     */
    public String retention() {
        return this.retention;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
