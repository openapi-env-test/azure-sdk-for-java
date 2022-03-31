// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The definition of a filtering tag. Filtering tags are used for capturing resources and include/exclude them from
 * being monitored.
 */
@Fluent
public final class FilteringTag {
    /*
     * The name (also known as the key) of the tag.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The value of the tag.
     */
    @JsonProperty(value = "value")
    private String value;

    /*
     * Valid actions for a filtering tag. Exclusion takes priority over
     * inclusion.
     */
    @JsonProperty(value = "action")
    private TagAction action;

    /**
     * Get the name property: The name (also known as the key) of the tag.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name (also known as the key) of the tag.
     *
     * @param name the name value to set.
     * @return the FilteringTag object itself.
     */
    public FilteringTag withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: The value of the tag.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The value of the tag.
     *
     * @param value the value value to set.
     * @return the FilteringTag object itself.
     */
    public FilteringTag withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the action property: Valid actions for a filtering tag. Exclusion takes priority over inclusion.
     *
     * @return the action value.
     */
    public TagAction action() {
        return this.action;
    }

    /**
     * Set the action property: Valid actions for a filtering tag. Exclusion takes priority over inclusion.
     *
     * @param action the action value to set.
     * @return the FilteringTag object itself.
     */
    public FilteringTag withAction(TagAction action) {
        this.action = action;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
