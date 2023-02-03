// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.servicebus.generated.fluent.models.SBAuthorizationRuleInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response to the List Namespace operation. */
@Fluent
public final class SBAuthorizationRuleListResult {
    /*
     * Result of the List Authorization Rules operation.
     */
    @JsonProperty(value = "value")
    private List<SBAuthorizationRuleInner> value;

    /*
     * Link to the next set of results. Not empty if Value contains incomplete list of Authorization Rules.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of SBAuthorizationRuleListResult class. */
    public SBAuthorizationRuleListResult() {
    }

    /**
     * Get the value property: Result of the List Authorization Rules operation.
     *
     * @return the value value.
     */
    public List<SBAuthorizationRuleInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Result of the List Authorization Rules operation.
     *
     * @param value the value value to set.
     * @return the SBAuthorizationRuleListResult object itself.
     */
    public SBAuthorizationRuleListResult withValue(List<SBAuthorizationRuleInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next set of results. Not empty if Value contains incomplete list of
     * Authorization Rules.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to the next set of results. Not empty if Value contains incomplete list of
     * Authorization Rules.
     *
     * @param nextLink the nextLink value to set.
     * @return the SBAuthorizationRuleListResult object itself.
     */
    public SBAuthorizationRuleListResult withNextLink(String nextLink) {
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
