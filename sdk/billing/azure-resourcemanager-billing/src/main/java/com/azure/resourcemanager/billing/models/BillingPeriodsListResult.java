// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.billing.fluent.models.BillingPeriodInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Result of listing billing periods. It contains a list of available billing periods in reverse chronological order.
 */
@Immutable
public final class BillingPeriodsListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BillingPeriodsListResult.class);

    /*
     * The list of billing periods.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<BillingPeriodInner> value;

    /*
     * The link (url) to the next page of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: The list of billing periods.
     *
     * @return the value value.
     */
    public List<BillingPeriodInner> value() {
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
