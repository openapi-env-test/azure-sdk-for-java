// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.models.ResourceMetricName;
import com.azure.resourcemanager.appservice.generated.models.ResourceMetricProperty;
import com.azure.resourcemanager.appservice.generated.models.ResourceMetricValue;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Object representing a metric for any resource . */
@Immutable
public final class ResourceMetricInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceMetricInner.class);

    /*
     * Name of metric.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceMetricName name;

    /*
     * Metric unit.
     */
    @JsonProperty(value = "unit", access = JsonProperty.Access.WRITE_ONLY)
    private String unit;

    /*
     * Metric granularity. E.g PT1H, PT5M, P1D
     */
    @JsonProperty(value = "timeGrain", access = JsonProperty.Access.WRITE_ONLY)
    private String timeGrain;

    /*
     * Metric start time.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startTime;

    /*
     * Metric end time.
     */
    @JsonProperty(value = "endTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime endTime;

    /*
     * Metric resource Id.
     */
    @JsonProperty(value = "resourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceId;

    /*
     * Resource Id.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Metric values.
     */
    @JsonProperty(value = "metricValues", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceMetricValue> metricValues;

    /*
     * Resource metric properties collection.
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceMetricProperty> properties;

    /**
     * Get the name property: Name of metric.
     *
     * @return the name value.
     */
    public ResourceMetricName name() {
        return this.name;
    }

    /**
     * Get the unit property: Metric unit.
     *
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Get the timeGrain property: Metric granularity. E.g PT1H, PT5M, P1D.
     *
     * @return the timeGrain value.
     */
    public String timeGrain() {
        return this.timeGrain;
    }

    /**
     * Get the startTime property: Metric start time.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the endTime property: Metric end time.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Get the resourceId property: Metric resource Id.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Get the id property: Resource Id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the metricValues property: Metric values.
     *
     * @return the metricValues value.
     */
    public List<ResourceMetricValue> metricValues() {
        return this.metricValues;
    }

    /**
     * Get the properties property: Resource metric properties collection.
     *
     * @return the properties value.
     */
    public List<ResourceMetricProperty> properties() {
        return this.properties;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() != null) {
            name().validate();
        }
        if (metricValues() != null) {
            metricValues().forEach(e -> e.validate());
        }
        if (properties() != null) {
            properties().forEach(e -> e.validate());
        }
    }
}
