// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.contoso_cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ComponentsKpo1PjSchemasWafrankingsresponsePropertiesDataItemsPropertiesMetricsItems model. */
@Fluent
public final class ComponentsKpo1PjSchemasWafrankingsresponsePropertiesDataItemsPropertiesMetricsItems {
    @JsonIgnore
    private final ClientLogger logger =
        new ClientLogger(ComponentsKpo1PjSchemasWafrankingsresponsePropertiesDataItemsPropertiesMetricsItems.class);

    /*
     * The metric property.
     */
    @JsonProperty(value = "metric")
    private String metric;

    /*
     * The value property.
     */
    @JsonProperty(value = "value")
    private Long value;

    /*
     * The percentage property.
     */
    @JsonProperty(value = "percentage")
    private Double percentage;

    /**
     * Get the metric property: The metric property.
     *
     * @return the metric value.
     */
    public String metric() {
        return this.metric;
    }

    /**
     * Set the metric property: The metric property.
     *
     * @param metric the metric value to set.
     * @return the ComponentsKpo1PjSchemasWafrankingsresponsePropertiesDataItemsPropertiesMetricsItems object itself.
     */
    public ComponentsKpo1PjSchemasWafrankingsresponsePropertiesDataItemsPropertiesMetricsItems withMetric(
        String metric) {
        this.metric = metric;
        return this;
    }

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public Long value() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     *
     * @param value the value value to set.
     * @return the ComponentsKpo1PjSchemasWafrankingsresponsePropertiesDataItemsPropertiesMetricsItems object itself.
     */
    public ComponentsKpo1PjSchemasWafrankingsresponsePropertiesDataItemsPropertiesMetricsItems withValue(Long value) {
        this.value = value;
        return this;
    }

    /**
     * Get the percentage property: The percentage property.
     *
     * @return the percentage value.
     */
    public Double percentage() {
        return this.percentage;
    }

    /**
     * Set the percentage property: The percentage property.
     *
     * @param percentage the percentage value to set.
     * @return the ComponentsKpo1PjSchemasWafrankingsresponsePropertiesDataItemsPropertiesMetricsItems object itself.
     */
    public ComponentsKpo1PjSchemasWafrankingsresponsePropertiesDataItemsPropertiesMetricsItems withPercentage(
        Double percentage) {
        this.percentage = percentage;
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
