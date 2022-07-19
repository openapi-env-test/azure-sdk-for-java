// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.servicebus.generated.fluent.models.SBSubscriptionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response to the List Subscriptions operation. */
@Fluent
public final class SBSubscriptionListResult {
    /*
     * Result of the List Subscriptions operation.
     */
    @JsonProperty(value = "value")
    private List<SBSubscriptionInner> value;

    /*
     * Link to the next set of results. Not empty if Value contains incomplete
     * list of subscriptions.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Result of the List Subscriptions operation.
     *
     * @return the value value.
     */
    public List<SBSubscriptionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Result of the List Subscriptions operation.
     *
     * @param value the value value to set.
     * @return the SBSubscriptionListResult object itself.
     */
    public SBSubscriptionListResult withValue(List<SBSubscriptionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next set of results. Not empty if Value contains incomplete list of
     * subscriptions.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to the next set of results. Not empty if Value contains incomplete list of
     * subscriptions.
     *
     * @param nextLink the nextLink value to set.
     * @return the SBSubscriptionListResult object itself.
     */
    public SBSubscriptionListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
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
