// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.machinelearning.fluent.models.ComponentVersionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A paginated list of ComponentVersion entities. */
@Fluent
public final class ComponentVersionResourceArmPaginatedResult {
    /*
     * The link to the next page of ComponentVersion objects. If null, there
     * are no additional pages.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * An array of objects of type ComponentVersion.
     */
    @JsonProperty(value = "value")
    private List<ComponentVersionInner> value;

    /**
     * Get the nextLink property: The link to the next page of ComponentVersion objects. If null, there are no
     * additional pages.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to the next page of ComponentVersion objects. If null, there are no
     * additional pages.
     *
     * @param nextLink the nextLink value to set.
     * @return the ComponentVersionResourceArmPaginatedResult object itself.
     */
    public ComponentVersionResourceArmPaginatedResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: An array of objects of type ComponentVersion.
     *
     * @return the value value.
     */
    public List<ComponentVersionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of objects of type ComponentVersion.
     *
     * @param value the value value to set.
     * @return the ComponentVersionResourceArmPaginatedResult object itself.
     */
    public ComponentVersionResourceArmPaginatedResult withValue(List<ComponentVersionInner> value) {
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
