// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.generated.fluent.models.StaticMemberInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Result of the request to list StaticMember. It contains a list of groups and a URL link to get the next set of
 * results.
 */
@Fluent
public final class StaticMemberListResult {
    /*
     * Gets a page of StaticMember
     */
    @JsonProperty(value = "value")
    private List<StaticMemberInner> value;

    /*
     * Gets the URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Gets a page of StaticMember.
     *
     * @return the value value.
     */
    public List<StaticMemberInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets a page of StaticMember.
     *
     * @param value the value value to set.
     * @return the StaticMemberListResult object itself.
     */
    public StaticMemberListResult withValue(List<StaticMemberInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Gets the URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Gets the URL to get the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the StaticMemberListResult object itself.
     */
    public StaticMemberListResult withNextLink(String nextLink) {
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
