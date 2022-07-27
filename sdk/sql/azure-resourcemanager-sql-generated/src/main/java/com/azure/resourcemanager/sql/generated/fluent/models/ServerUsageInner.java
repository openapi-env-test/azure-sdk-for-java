// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Represents server metrics. */
@Immutable
public final class ServerUsageInner {
    /*
     * Name of the server usage metric.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The name of the resource.
     */
    @JsonProperty(value = "resourceName", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceName;

    /*
     * The metric display name.
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /*
     * The current value of the metric.
     */
    @JsonProperty(value = "currentValue", access = JsonProperty.Access.WRITE_ONLY)
    private Double currentValue;

    /*
     * The current limit of the metric.
     */
    @JsonProperty(value = "limit", access = JsonProperty.Access.WRITE_ONLY)
    private Double limit;

    /*
     * The units of the metric.
     */
    @JsonProperty(value = "unit", access = JsonProperty.Access.WRITE_ONLY)
    private String unit;

    /*
     * The next reset time for the metric (ISO8601 format).
     */
    @JsonProperty(value = "nextResetTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime nextResetTime;

    /**
     * Get the name property: Name of the server usage metric.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the resourceName property: The name of the resource.
     *
     * @return the resourceName value.
     */
    public String resourceName() {
        return this.resourceName;
    }

    /**
     * Get the displayName property: The metric display name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the currentValue property: The current value of the metric.
     *
     * @return the currentValue value.
     */
    public Double currentValue() {
        return this.currentValue;
    }

    /**
     * Get the limit property: The current limit of the metric.
     *
     * @return the limit value.
     */
    public Double limit() {
        return this.limit;
    }

    /**
     * Get the unit property: The units of the metric.
     *
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Get the nextResetTime property: The next reset time for the metric (ISO8601 format).
     *
     * @return the nextResetTime value.
     */
    public OffsetDateTime nextResetTime() {
        return this.nextResetTime;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
