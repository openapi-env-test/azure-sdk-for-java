// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.consumption.fluent.models.ReservationDetailInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Result of listing reservation details. */
@Immutable
public final class ReservationDetailsListResult {
    /*
     * The list of reservation details.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReservationDetailInner> value;

    /*
     * The link (url) to the next page of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of ReservationDetailsListResult class. */
    public ReservationDetailsListResult() {
    }

    /**
     * Get the value property: The list of reservation details.
     *
     * @return the value value.
     */
    public List<ReservationDetailInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: The link (url) to the next page of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
