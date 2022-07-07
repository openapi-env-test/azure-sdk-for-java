// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.authorization.generated.fluent.models.AccessReviewHistoryDefinitionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of Access Review History Definitions. */
@Fluent
public final class AccessReviewHistoryDefinitionListResult {
    /*
     * Access Review History Definition list.
     */
    @JsonProperty(value = "value")
    private List<AccessReviewHistoryDefinitionInner> value;

    /*
     * The URL to use for getting the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Access Review History Definition list.
     *
     * @return the value value.
     */
    public List<AccessReviewHistoryDefinitionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Access Review History Definition list.
     *
     * @param value the value value to set.
     * @return the AccessReviewHistoryDefinitionListResult object itself.
     */
    public AccessReviewHistoryDefinitionListResult withValue(List<AccessReviewHistoryDefinitionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to use for getting the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the AccessReviewHistoryDefinitionListResult object itself.
     */
    public AccessReviewHistoryDefinitionListResult withNextLink(String nextLink) {
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
