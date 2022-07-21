// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.generated.fluent.models.WorkflowTriggerInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list of workflow triggers. */
@Fluent
public final class WorkflowTriggerListResult {
    /*
     * A list of workflow triggers.
     */
    @JsonProperty(value = "value")
    private List<WorkflowTriggerInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: A list of workflow triggers.
     *
     * @return the value value.
     */
    public List<WorkflowTriggerInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of workflow triggers.
     *
     * @param value the value value to set.
     * @return the WorkflowTriggerListResult object itself.
     */
    public WorkflowTriggerListResult withValue(List<WorkflowTriggerInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the WorkflowTriggerListResult object itself.
     */
    public WorkflowTriggerListResult withNextLink(String nextLink) {
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
