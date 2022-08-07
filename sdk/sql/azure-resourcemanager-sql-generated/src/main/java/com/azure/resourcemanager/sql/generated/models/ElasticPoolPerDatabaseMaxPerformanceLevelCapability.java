// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The max per-database performance level capability. */
@Fluent
public final class ElasticPoolPerDatabaseMaxPerformanceLevelCapability {
    /*
     * The maximum performance level per database.
     */
    @JsonProperty(value = "limit", access = JsonProperty.Access.WRITE_ONLY)
    private Double limit;

    /*
     * Unit type used to measure performance level.
     */
    @JsonProperty(value = "unit", access = JsonProperty.Access.WRITE_ONLY)
    private PerformanceLevelUnit unit;

    /*
     * The list of supported min database performance levels.
     */
    @JsonProperty(value = "supportedPerDatabaseMinPerformanceLevels", access = JsonProperty.Access.WRITE_ONLY)
    private List<ElasticPoolPerDatabaseMinPerformanceLevelCapability> supportedPerDatabaseMinPerformanceLevels;

    /*
     * The status of the capability.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private CapabilityStatus status;

    /*
     * The reason for the capability not being available.
     */
    @JsonProperty(value = "reason")
    private String reason;

    /**
     * Get the limit property: The maximum performance level per database.
     *
     * @return the limit value.
     */
    public Double limit() {
        return this.limit;
    }

    /**
     * Get the unit property: Unit type used to measure performance level.
     *
     * @return the unit value.
     */
    public PerformanceLevelUnit unit() {
        return this.unit;
    }

    /**
     * Get the supportedPerDatabaseMinPerformanceLevels property: The list of supported min database performance levels.
     *
     * @return the supportedPerDatabaseMinPerformanceLevels value.
     */
    public List<ElasticPoolPerDatabaseMinPerformanceLevelCapability> supportedPerDatabaseMinPerformanceLevels() {
        return this.supportedPerDatabaseMinPerformanceLevels;
    }

    /**
     * Get the status property: The status of the capability.
     *
     * @return the status value.
     */
    public CapabilityStatus status() {
        return this.status;
    }

    /**
     * Get the reason property: The reason for the capability not being available.
     *
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason property: The reason for the capability not being available.
     *
     * @param reason the reason value to set.
     * @return the ElasticPoolPerDatabaseMaxPerformanceLevelCapability object itself.
     */
    public ElasticPoolPerDatabaseMaxPerformanceLevelCapability withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (supportedPerDatabaseMinPerformanceLevels() != null) {
            supportedPerDatabaseMinPerformanceLevels().forEach(e -> e.validate());
        }
    }
}
