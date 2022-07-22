// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.devtestlabs.fluent.models.PolicyInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Contains a list of policies and their properties. */
@Fluent
public final class PolicyList {
    /*
     * List of policies and their properties
     */
    @JsonProperty(value = "value")
    private List<PolicyInner> value;

    /*
     * URL to get the next set of operation list results if there are any
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of policies and their properties.
     *
     * @return the value value.
     */
    public List<PolicyInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of policies and their properties.
     *
     * @param value the value value to set.
     * @return the PolicyList object itself.
     */
    public PolicyList withValue(List<PolicyInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of operation list results if there are any.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of operation list results if there are any.
     *
     * @param nextLink the nextLink value to set.
     * @return the PolicyList object itself.
     */
    public PolicyList withNextLink(String nextLink) {
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
