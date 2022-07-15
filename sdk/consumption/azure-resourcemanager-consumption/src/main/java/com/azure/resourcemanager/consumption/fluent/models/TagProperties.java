// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.consumption.models.Tag;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The properties of the tag. */
@Fluent
public final class TagProperties {
    /*
     * A list of Tag.
     */
    @JsonProperty(value = "tags")
    private List<Tag> tags;

    /*
     * The link (url) to the next page of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /*
     * The link (url) to the previous page of results.
     */
    @JsonProperty(value = "previousLink", access = JsonProperty.Access.WRITE_ONLY)
    private String previousLink;

    /**
     * Get the tags property: A list of Tag.
     *
     * @return the tags value.
     */
    public List<Tag> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: A list of Tag.
     *
     * @param tags the tags value to set.
     * @return the TagProperties object itself.
     */
    public TagProperties withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
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
     * Get the previousLink property: The link (url) to the previous page of results.
     *
     * @return the previousLink value.
     */
    public String previousLink() {
        return this.previousLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (tags() != null) {
            tags().forEach(e -> e.validate());
        }
    }
}
