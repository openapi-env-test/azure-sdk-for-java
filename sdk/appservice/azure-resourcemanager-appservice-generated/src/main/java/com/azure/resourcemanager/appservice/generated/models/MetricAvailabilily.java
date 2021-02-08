// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Metric availability and retention. */
@Fluent
public final class MetricAvailabilily {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MetricAvailabilily.class);

    /*
     * Time grain.
     */
    @JsonProperty(value = "timeGrain")
    private String timeGrain;

    /*
     * Retention period for the current time grain.
     */
    @JsonProperty(value = "retention")
    private String retention;

    /**
     * Get the timeGrain property: Time grain.
     *
     * @return the timeGrain value.
     */
    public String timeGrain() {
        return this.timeGrain;
    }

    /**
     * Set the timeGrain property: Time grain.
     *
     * @param timeGrain the timeGrain value to set.
     * @return the MetricAvailabilily object itself.
     */
    public MetricAvailabilily withTimeGrain(String timeGrain) {
        this.timeGrain = timeGrain;
        return this;
    }

    /**
     * Get the retention property: Retention period for the current time grain.
     *
     * @return the retention value.
     */
    public String retention() {
        return this.retention;
    }

    /**
     * Set the retention property: Retention period for the current time grain.
     *
     * @param retention the retention value to set.
     * @return the MetricAvailabilily object itself.
     */
    public MetricAvailabilily withRetention(String retention) {
        this.retention = retention;
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
