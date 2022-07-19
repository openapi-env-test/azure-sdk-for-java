// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Specifies the criteria for converting log to metric. */
@Fluent
public final class Criteria {
    /*
     * Name of the metric
     */
    @JsonProperty(value = "metricName", required = true)
    private String metricName;

    /*
     * List of Dimensions for creating metric
     */
    @JsonProperty(value = "dimensions")
    private List<Dimension> dimensions;

    /**
     * Get the metricName property: Name of the metric.
     *
     * @return the metricName value.
     */
    public String metricName() {
        return this.metricName;
    }

    /**
     * Set the metricName property: Name of the metric.
     *
     * @param metricName the metricName value to set.
     * @return the Criteria object itself.
     */
    public Criteria withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * Get the dimensions property: List of Dimensions for creating metric.
     *
     * @return the dimensions value.
     */
    public List<Dimension> dimensions() {
        return this.dimensions;
    }

    /**
     * Set the dimensions property: List of Dimensions for creating metric.
     *
     * @param dimensions the dimensions value to set.
     * @return the Criteria object itself.
     */
    public Criteria withDimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (metricName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property metricName in model Criteria"));
        }
        if (dimensions() != null) {
            dimensions().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Criteria.class);
}
