// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The minimum number of violations required within the selected lookback time window required to raise an alert. */
@Fluent
public final class DynamicThresholdFailingPeriods {
    /*
     * The number of aggregated lookback points. The lookback time window is calculated based on the aggregation
     * granularity (windowSize) and the selected number of aggregated points.
     */
    @JsonProperty(value = "numberOfEvaluationPeriods", required = true)
    private float numberOfEvaluationPeriods;

    /*
     * The number of violations to trigger an alert. Should be smaller or equal to numberOfEvaluationPeriods.
     */
    @JsonProperty(value = "minFailingPeriodsToAlert", required = true)
    private float minFailingPeriodsToAlert;

    /** Creates an instance of DynamicThresholdFailingPeriods class. */
    public DynamicThresholdFailingPeriods() {
    }

    /**
     * Get the numberOfEvaluationPeriods property: The number of aggregated lookback points. The lookback time window is
     * calculated based on the aggregation granularity (windowSize) and the selected number of aggregated points.
     *
     * @return the numberOfEvaluationPeriods value.
     */
    public float numberOfEvaluationPeriods() {
        return this.numberOfEvaluationPeriods;
    }

    /**
     * Set the numberOfEvaluationPeriods property: The number of aggregated lookback points. The lookback time window is
     * calculated based on the aggregation granularity (windowSize) and the selected number of aggregated points.
     *
     * @param numberOfEvaluationPeriods the numberOfEvaluationPeriods value to set.
     * @return the DynamicThresholdFailingPeriods object itself.
     */
    public DynamicThresholdFailingPeriods withNumberOfEvaluationPeriods(float numberOfEvaluationPeriods) {
        this.numberOfEvaluationPeriods = numberOfEvaluationPeriods;
        return this;
    }

    /**
     * Get the minFailingPeriodsToAlert property: The number of violations to trigger an alert. Should be smaller or
     * equal to numberOfEvaluationPeriods.
     *
     * @return the minFailingPeriodsToAlert value.
     */
    public float minFailingPeriodsToAlert() {
        return this.minFailingPeriodsToAlert;
    }

    /**
     * Set the minFailingPeriodsToAlert property: The number of violations to trigger an alert. Should be smaller or
     * equal to numberOfEvaluationPeriods.
     *
     * @param minFailingPeriodsToAlert the minFailingPeriodsToAlert value to set.
     * @return the DynamicThresholdFailingPeriods object itself.
     */
    public DynamicThresholdFailingPeriods withMinFailingPeriodsToAlert(float minFailingPeriodsToAlert) {
        this.minFailingPeriodsToAlert = minFailingPeriodsToAlert;
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
