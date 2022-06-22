// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Reservation utilization. */
@Fluent
public final class ReservationPropertyUtilization {
    /*
     * The number of days trend for a reservation
     */
    @JsonProperty(value = "trend", access = JsonProperty.Access.WRITE_ONLY)
    private String trend;

    /*
     * The array of aggregates of a reservation's utilization
     */
    @JsonProperty(value = "aggregates")
    private List<ReservationUtilizationAggregates> aggregates;

    /**
     * Get the trend property: The number of days trend for a reservation.
     *
     * @return the trend value.
     */
    public String trend() {
        return this.trend;
    }

    /**
     * Get the aggregates property: The array of aggregates of a reservation's utilization.
     *
     * @return the aggregates value.
     */
    public List<ReservationUtilizationAggregates> aggregates() {
        return this.aggregates;
    }

    /**
     * Set the aggregates property: The array of aggregates of a reservation's utilization.
     *
     * @param aggregates the aggregates value to set.
     * @return the ReservationPropertyUtilization object itself.
     */
    public ReservationPropertyUtilization withAggregates(List<ReservationUtilizationAggregates> aggregates) {
        this.aggregates = aggregates;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (aggregates() != null) {
            aggregates().forEach(e -> e.validate());
        }
    }
}
