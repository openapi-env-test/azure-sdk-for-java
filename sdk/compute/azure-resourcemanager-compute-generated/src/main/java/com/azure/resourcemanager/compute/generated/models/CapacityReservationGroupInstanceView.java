// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The CapacityReservationGroupInstanceView model. */
@Immutable
public final class CapacityReservationGroupInstanceView {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CapacityReservationGroupInstanceView.class);

    /*
     * List of instance view of the capacity reservations under the capacity
     * reservation group.
     */
    @JsonProperty(value = "capacityReservations", access = JsonProperty.Access.WRITE_ONLY)
    private List<CapacityReservationInstanceViewWithName> capacityReservations;

    /**
     * Get the capacityReservations property: List of instance view of the capacity reservations under the capacity
     * reservation group.
     *
     * @return the capacityReservations value.
     */
    public List<CapacityReservationInstanceViewWithName> capacityReservations() {
        return this.capacityReservations;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (capacityReservations() != null) {
            capacityReservations().forEach(e -> e.validate());
        }
    }
}
