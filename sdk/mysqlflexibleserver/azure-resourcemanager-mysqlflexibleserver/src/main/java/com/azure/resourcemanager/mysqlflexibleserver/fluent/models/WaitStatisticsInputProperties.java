// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The properties for input to get wait statistics. */
@Fluent
public final class WaitStatisticsInputProperties {
    /*
     * Observation start time.
     */
    @JsonProperty(value = "observationStartTime", required = true)
    private OffsetDateTime observationStartTime;

    /*
     * Observation end time.
     */
    @JsonProperty(value = "observationEndTime", required = true)
    private OffsetDateTime observationEndTime;

    /*
     * Aggregation interval type in ISO 8601 format.
     */
    @JsonProperty(value = "aggregationWindow", required = true)
    private String aggregationWindow;

    /**
     * Get the observationStartTime property: Observation start time.
     *
     * @return the observationStartTime value.
     */
    public OffsetDateTime observationStartTime() {
        return this.observationStartTime;
    }

    /**
     * Set the observationStartTime property: Observation start time.
     *
     * @param observationStartTime the observationStartTime value to set.
     * @return the WaitStatisticsInputProperties object itself.
     */
    public WaitStatisticsInputProperties withObservationStartTime(OffsetDateTime observationStartTime) {
        this.observationStartTime = observationStartTime;
        return this;
    }

    /**
     * Get the observationEndTime property: Observation end time.
     *
     * @return the observationEndTime value.
     */
    public OffsetDateTime observationEndTime() {
        return this.observationEndTime;
    }

    /**
     * Set the observationEndTime property: Observation end time.
     *
     * @param observationEndTime the observationEndTime value to set.
     * @return the WaitStatisticsInputProperties object itself.
     */
    public WaitStatisticsInputProperties withObservationEndTime(OffsetDateTime observationEndTime) {
        this.observationEndTime = observationEndTime;
        return this;
    }

    /**
     * Get the aggregationWindow property: Aggregation interval type in ISO 8601 format.
     *
     * @return the aggregationWindow value.
     */
    public String aggregationWindow() {
        return this.aggregationWindow;
    }

    /**
     * Set the aggregationWindow property: Aggregation interval type in ISO 8601 format.
     *
     * @param aggregationWindow the aggregationWindow value to set.
     * @return the WaitStatisticsInputProperties object itself.
     */
    public WaitStatisticsInputProperties withAggregationWindow(String aggregationWindow) {
        this.aggregationWindow = aggregationWindow;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (observationStartTime() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property observationStartTime in model WaitStatisticsInputProperties"));
        }
        if (observationEndTime() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property observationEndTime in model WaitStatisticsInputProperties"));
        }
        if (aggregationWindow() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property aggregationWindow in model WaitStatisticsInputProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WaitStatisticsInputProperties.class);
}
