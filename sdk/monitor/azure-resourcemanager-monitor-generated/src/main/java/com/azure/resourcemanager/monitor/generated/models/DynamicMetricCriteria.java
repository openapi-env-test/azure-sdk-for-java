// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;

/** Criterion for dynamic threshold. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "criterionType")
@JsonTypeName("DynamicThresholdCriterion")
@Fluent
public final class DynamicMetricCriteria extends MultiMetricCriteria {
    /*
     * The operator used to compare the metric value against the threshold.
     */
    @JsonProperty(value = "operator", required = true)
    private DynamicThresholdOperator operator;

    /*
     * The extent of deviation required to trigger an alert. This will affect how tight the threshold is to the metric
     * series pattern.
     */
    @JsonProperty(value = "alertSensitivity", required = true)
    private DynamicThresholdSensitivity alertSensitivity;

    /*
     * The minimum number of violations required within the selected lookback time window required to raise an alert.
     */
    @JsonProperty(value = "failingPeriods", required = true)
    private DynamicThresholdFailingPeriods failingPeriods;

    /*
     * Use this option to set the date from which to start learning the metric historical data and calculate the
     * dynamic thresholds (in ISO8601 format)
     */
    @JsonProperty(value = "ignoreDataBefore")
    private OffsetDateTime ignoreDataBefore;

    /** Creates an instance of DynamicMetricCriteria class. */
    public DynamicMetricCriteria() {
    }

    /**
     * Get the operator property: The operator used to compare the metric value against the threshold.
     *
     * @return the operator value.
     */
    public DynamicThresholdOperator operator() {
        return this.operator;
    }

    /**
     * Set the operator property: The operator used to compare the metric value against the threshold.
     *
     * @param operator the operator value to set.
     * @return the DynamicMetricCriteria object itself.
     */
    public DynamicMetricCriteria withOperator(DynamicThresholdOperator operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get the alertSensitivity property: The extent of deviation required to trigger an alert. This will affect how
     * tight the threshold is to the metric series pattern.
     *
     * @return the alertSensitivity value.
     */
    public DynamicThresholdSensitivity alertSensitivity() {
        return this.alertSensitivity;
    }

    /**
     * Set the alertSensitivity property: The extent of deviation required to trigger an alert. This will affect how
     * tight the threshold is to the metric series pattern.
     *
     * @param alertSensitivity the alertSensitivity value to set.
     * @return the DynamicMetricCriteria object itself.
     */
    public DynamicMetricCriteria withAlertSensitivity(DynamicThresholdSensitivity alertSensitivity) {
        this.alertSensitivity = alertSensitivity;
        return this;
    }

    /**
     * Get the failingPeriods property: The minimum number of violations required within the selected lookback time
     * window required to raise an alert.
     *
     * @return the failingPeriods value.
     */
    public DynamicThresholdFailingPeriods failingPeriods() {
        return this.failingPeriods;
    }

    /**
     * Set the failingPeriods property: The minimum number of violations required within the selected lookback time
     * window required to raise an alert.
     *
     * @param failingPeriods the failingPeriods value to set.
     * @return the DynamicMetricCriteria object itself.
     */
    public DynamicMetricCriteria withFailingPeriods(DynamicThresholdFailingPeriods failingPeriods) {
        this.failingPeriods = failingPeriods;
        return this;
    }

    /**
     * Get the ignoreDataBefore property: Use this option to set the date from which to start learning the metric
     * historical data and calculate the dynamic thresholds (in ISO8601 format).
     *
     * @return the ignoreDataBefore value.
     */
    public OffsetDateTime ignoreDataBefore() {
        return this.ignoreDataBefore;
    }

    /**
     * Set the ignoreDataBefore property: Use this option to set the date from which to start learning the metric
     * historical data and calculate the dynamic thresholds (in ISO8601 format).
     *
     * @param ignoreDataBefore the ignoreDataBefore value to set.
     * @return the DynamicMetricCriteria object itself.
     */
    public DynamicMetricCriteria withIgnoreDataBefore(OffsetDateTime ignoreDataBefore) {
        this.ignoreDataBefore = ignoreDataBefore;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicMetricCriteria withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicMetricCriteria withMetricName(String metricName) {
        super.withMetricName(metricName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicMetricCriteria withMetricNamespace(String metricNamespace) {
        super.withMetricNamespace(metricNamespace);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicMetricCriteria withTimeAggregation(AggregationTypeEnum timeAggregation) {
        super.withTimeAggregation(timeAggregation);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicMetricCriteria withDimensions(List<MetricDimension> dimensions) {
        super.withDimensions(dimensions);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicMetricCriteria withSkipMetricValidation(Boolean skipMetricValidation) {
        super.withSkipMetricValidation(skipMetricValidation);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (operator() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property operator in model DynamicMetricCriteria"));
        }
        if (alertSensitivity() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property alertSensitivity in model DynamicMetricCriteria"));
        }
        if (failingPeriods() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property failingPeriods in model DynamicMetricCriteria"));
        } else {
            failingPeriods().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DynamicMetricCriteria.class);
}
