// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.models.KeyValuePairString;
import com.azure.resourcemanager.appservice.generated.models.ResourceMetricName;
import com.azure.resourcemanager.appservice.generated.models.ResourceMetricValue;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Object representing a metric for any resource. */
@Fluent
public final class ResourceMetricInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceMetricInner.class);

    /*
     * Name of metric
     */
    @JsonProperty(value = "name")
    private ResourceMetricName name;

    /*
     * Metric unit
     */
    @JsonProperty(value = "unit")
    private String unit;

    /*
     * Metric granularity. E.g PT1H, PT5M, P1D
     */
    @JsonProperty(value = "timeGrain")
    private String timeGrain;

    /*
     * Metric start time
     */
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /*
     * Metric end time
     */
    @JsonProperty(value = "endTime")
    private OffsetDateTime endTime;

    /*
     * Metric resource Id
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /*
     * Metric values
     */
    @JsonProperty(value = "metricValues")
    private List<ResourceMetricValue> metricValues;

    /*
     * Properties
     */
    @JsonProperty(value = "properties")
    private List<KeyValuePairString> properties;

    /**
     * Get the name property: Name of metric.
     *
     * @return the name value.
     */
    public ResourceMetricName name() {
        return this.name;
    }

    /**
     * Set the name property: Name of metric.
     *
     * @param name the name value to set.
     * @return the ResourceMetricInner object itself.
     */
    public ResourceMetricInner withName(ResourceMetricName name) {
        this.name = name;
        return this;
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
     * Set the unit property: Metric unit.
     *
     * @param unit the unit value to set.
     * @return the ResourceMetricInner object itself.
     */
    public ResourceMetricInner withUnit(String unit) {
        this.unit = unit;
        return this;
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
     * Set the timeGrain property: Metric granularity. E.g PT1H, PT5M, P1D.
     *
     * @param timeGrain the timeGrain value to set.
     * @return the ResourceMetricInner object itself.
     */
    public ResourceMetricInner withTimeGrain(String timeGrain) {
        this.timeGrain = timeGrain;
        return this;
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
     * Set the startTime property: Metric start time.
     *
     * @param startTime the startTime value to set.
     * @return the ResourceMetricInner object itself.
     */
    public ResourceMetricInner withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
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
     * Set the endTime property: Metric end time.
     *
     * @param endTime the endTime value to set.
     * @return the ResourceMetricInner object itself.
     */
    public ResourceMetricInner withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
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
     * Set the resourceId property: Metric resource Id.
     *
     * @param resourceId the resourceId value to set.
     * @return the ResourceMetricInner object itself.
     */
    public ResourceMetricInner withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
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
     * Set the metricValues property: Metric values.
     *
     * @param metricValues the metricValues value to set.
     * @return the ResourceMetricInner object itself.
     */
    public ResourceMetricInner withMetricValues(List<ResourceMetricValue> metricValues) {
        this.metricValues = metricValues;
        return this;
    }

    /**
     * Get the properties property: Properties.
     *
     * @return the properties value.
     */
    public List<KeyValuePairString> properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties.
     *
     * @param properties the properties value to set.
     * @return the ResourceMetricInner object itself.
     */
    public ResourceMetricInner withProperties(List<KeyValuePairString> properties) {
        this.properties = properties;
        return this;
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
