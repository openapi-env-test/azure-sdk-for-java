// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Transport options availability details for given region. */
@Immutable
public final class TransportAvailabilityDetails {
    /*
     * Transport Shipment Type supported for given region.
     */
    @JsonProperty(value = "shipmentType", access = JsonProperty.Access.WRITE_ONLY)
    private TransportShipmentTypes shipmentType;

    /**
     * Get the shipmentType property: Transport Shipment Type supported for given region.
     *
     * @return the shipmentType value.
     */
    public TransportShipmentTypes shipmentType() {
        return this.shipmentType;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
