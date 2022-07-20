// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Unresolved dependency. */
@Fluent
public final class UnresolvedDependencyInner {
    /*
     * Gets or sets the count.
     */
    @JsonProperty(value = "count")
    private Integer count;

    /*
     * Gets or sets the arm id of the dependency.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the count property: Gets or sets the count.
     *
     * @return the count value.
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Set the count property: Gets or sets the count.
     *
     * @param count the count value to set.
     * @return the UnresolvedDependencyInner object itself.
     */
    public UnresolvedDependencyInner withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get the id property: Gets or sets the arm id of the dependency.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Gets or sets the arm id of the dependency.
     *
     * @param id the id value to set.
     * @return the UnresolvedDependencyInner object itself.
     */
    public UnresolvedDependencyInner withId(String id) {
        this.id = id;
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
