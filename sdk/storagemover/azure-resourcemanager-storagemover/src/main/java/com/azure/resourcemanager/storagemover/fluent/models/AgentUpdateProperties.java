// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AgentUpdateProperties model. */
@Fluent
public final class AgentUpdateProperties {
    /*
     * A description for the agent.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the description property: A description for the agent.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: A description for the agent.
     *
     * @param description the description value to set.
     * @return the AgentUpdateProperties object itself.
     */
    public AgentUpdateProperties withDescription(String description) {
        this.description = description;
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
