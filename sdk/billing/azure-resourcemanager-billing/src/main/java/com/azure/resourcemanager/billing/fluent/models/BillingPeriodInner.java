// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.List;

/** A billing period resource. */
@Fluent
public final class BillingPeriodInner extends ProxyResource {
    /*
     * A billing period.
     */
    @JsonProperty(value = "properties")
    private BillingPeriodProperties innerProperties;

    /**
     * Get the innerProperties property: A billing period.
     *
     * @return the innerProperties value.
     */
    private BillingPeriodProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the billingPeriodStartDate property: The start of the date range covered by the billing period.
     *
     * @return the billingPeriodStartDate value.
     */
    public LocalDate billingPeriodStartDate() {
        return this.innerProperties() == null ? null : this.innerProperties().billingPeriodStartDate();
    }

    /**
     * Get the billingPeriodEndDate property: The end of the date range covered by the billing period.
     *
     * @return the billingPeriodEndDate value.
     */
    public LocalDate billingPeriodEndDate() {
        return this.innerProperties() == null ? null : this.innerProperties().billingPeriodEndDate();
    }

    /**
     * Get the invoiceIds property: Array of invoice ids that associated with.
     *
     * @return the invoiceIds value.
     */
    public List<String> invoiceIds() {
        return this.innerProperties() == null ? null : this.innerProperties().invoiceIds();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
