// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Value of resource metric. */
@Immutable
public final class ResourceMetricValue {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceMetricValue.class);

    /*
     * Value timestamp.
     */
    @JsonProperty(value = "timestamp", access = JsonProperty.Access.WRITE_ONLY)
    private String timestamp;

    /*
     * Value average.
     */
    @JsonProperty(value = "average", access = JsonProperty.Access.WRITE_ONLY)
    private Float average;

    /*
     * Value minimum.
     */
    @JsonProperty(value = "minimum", access = JsonProperty.Access.WRITE_ONLY)
    private Float minimum;

    /*
     * Value maximum.
     */
    @JsonProperty(value = "maximum", access = JsonProperty.Access.WRITE_ONLY)
    private Float maximum;

    /*
     * Value total.
     */
    @JsonProperty(value = "total", access = JsonProperty.Access.WRITE_ONLY)
    private Float total;

    /*
     * Value count.
     */
    @JsonProperty(value = "count", access = JsonProperty.Access.WRITE_ONLY)
    private Float count;

    /*
     * Resource metric properties collection.
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceMetricProperty> properties;

    /**
     * Get the timestamp property: Value timestamp.
     *
     * @return the timestamp value.
     */
    public String timestamp() {
        return this.timestamp;
    }

    /**
     * Get the average property: Value average.
     *
     * @return the average value.
     */
    public Float average() {
        return this.average;
    }

    /**
     * Get the minimum property: Value minimum.
     *
     * @return the minimum value.
     */
    public Float minimum() {
        return this.minimum;
    }

    /**
     * Get the maximum property: Value maximum.
     *
     * @return the maximum value.
     */
    public Float maximum() {
        return this.maximum;
    }

    /**
     * Get the total property: Value total.
     *
     * @return the total value.
     */
    public Float total() {
        return this.total;
    }

    /**
     * Get the count property: Value count.
     *
     * @return the count value.
     */
    public Float count() {
        return this.count;
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
        if (properties() != null) {
            properties().forEach(e -> e.validate());
        }
    }
}
