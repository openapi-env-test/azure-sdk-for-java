// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.resources.generated.fluent.models.TagDetailsInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of subscription tags. */
@Fluent
public final class TagsListResult {
    /*
     * An array of tags.
     */
    @JsonProperty(value = "value")
    private List<TagDetailsInner> value;

    /*
     * The URL to use for getting the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of TagsListResult class. */
    public TagsListResult() {
    }

    /**
     * Get the value property: An array of tags.
     *
     * @return the value value.
     */
    public List<TagDetailsInner> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of tags.
     *
     * @param value the value value to set.
     * @return the TagsListResult object itself.
     */
    public TagsListResult withValue(List<TagDetailsInner> value) {
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
