// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.resourcemanager.cosmos.generated.fluent.models.MetricInner;
import java.time.OffsetDateTime;
import java.util.List;

/** An immutable client-side representation of Metric. */
public interface Metric {
    /**
     * Gets the startTime property: The start time for the metric (ISO-8601 format).
     *
     * @return the startTime value.
     */
    OffsetDateTime startTime();

    /**
     * Gets the endTime property: The end time for the metric (ISO-8601 format).
     *
     * @return the endTime value.
     */
    OffsetDateTime endTime();

    /**
     * Gets the timeGrain property: The time grain to be used to summarize the metric values.
     *
     * @return the timeGrain value.
     */
    String timeGrain();

    /**
     * Gets the unit property: The unit of the metric.
     *
     * @return the unit value.
     */
    UnitType unit();

    /**
     * Gets the name property: The name information for the metric.
     *
     * @return the name value.
     */
    MetricName name();

    /**
     * Gets the metricValues property: The metric values for the specified time window and timestep.
     *
     * @return the metricValues value.
     */
    List<MetricValue> metricValues();

    /**
     * Gets the inner com.azure.resourcemanager.cosmos.generated.fluent.models.MetricInner object.
     *
     * @return the inner object.
     */
    MetricInner innerModel();
}
