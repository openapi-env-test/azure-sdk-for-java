// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** The BalancePropertiesAdjustmentDetailsItem model. */
@Immutable
public final class BalancePropertiesAdjustmentDetailsItem {
    /*
     * the name of new adjustment.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * the value of new adjustment.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal value;

    /** Creates an instance of BalancePropertiesAdjustmentDetailsItem class. */
    public BalancePropertiesAdjustmentDetailsItem() {
    }

    /**
     * Get the name property: the name of new adjustment.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the value property: the value of new adjustment.
     *
     * @return the value value.
     */
    public BigDecimal value() {
        return this.value;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
