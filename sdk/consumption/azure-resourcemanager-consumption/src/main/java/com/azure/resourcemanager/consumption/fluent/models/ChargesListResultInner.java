// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.consumption.models.ChargeSummary;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Result of listing charge summary. */
@Immutable
public final class ChargesListResultInner {
    /*
     * The list of charge summary
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<ChargeSummary> value;

    /**
     * Get the value property: The list of charge summary.
     *
     * @return the value value.
     */
    public List<ChargeSummary> value() {
        return this.value;
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
