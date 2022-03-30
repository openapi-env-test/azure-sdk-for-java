// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.billing.fluent.models.BillingProfileInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The billing profiles associated with the billing account. By default this is not populated, unless it's specified in
 * $expand.
 */
@Fluent
public final class BillingProfilesOnExpand {
    /*
     * Indicates whether there are more billing profiles than the ones listed
     * in this collection. The collection lists a maximum of 50 billing
     * profiles. To get all billing profiles, use the list billing profiles
     * API.
     */
    @JsonProperty(value = "hasMoreResults", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean hasMoreResults;

    /*
     * The billing profiles associated with the billing account.
     */
    @JsonProperty(value = "value")
    private List<BillingProfileInner> value;

    /**
     * Get the hasMoreResults property: Indicates whether there are more billing profiles than the ones listed in this
     * collection. The collection lists a maximum of 50 billing profiles. To get all billing profiles, use the list
     * billing profiles API.
     *
     * @return the hasMoreResults value.
     */
    public Boolean hasMoreResults() {
        return this.hasMoreResults;
    }

    /**
     * Get the value property: The billing profiles associated with the billing account.
     *
     * @return the value value.
     */
    public List<BillingProfileInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The billing profiles associated with the billing account.
     *
     * @param value the value value to set.
     * @return the BillingProfilesOnExpand object itself.
     */
    public BillingProfilesOnExpand withValue(List<BillingProfileInner> value) {
        this.value = value;
        return this;
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
