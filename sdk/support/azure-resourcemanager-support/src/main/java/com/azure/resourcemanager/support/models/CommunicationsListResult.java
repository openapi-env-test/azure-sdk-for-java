// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.support.fluent.models.CommunicationDetailsInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Collection of Communication resources. */
@Fluent
public final class CommunicationsListResult {
    /*
     * List of Communication resources.
     */
    @JsonProperty(value = "value")
    private List<CommunicationDetailsInner> value;

    /*
     * The URI to fetch the next page of Communication resources.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of Communication resources.
     *
     * @return the value value.
     */
    public List<CommunicationDetailsInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of Communication resources.
     *
     * @param value the value value to set.
     * @return the CommunicationsListResult object itself.
     */
    public CommunicationsListResult withValue(List<CommunicationDetailsInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page of Communication resources.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to fetch the next page of Communication resources.
     *
     * @param nextLink the nextLink value to set.
     * @return the CommunicationsListResult object itself.
     */
    public CommunicationsListResult withNextLink(String nextLink) {
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
