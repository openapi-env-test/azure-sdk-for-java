// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Endpoint resource, which contains information about file sources and targets. */
@Fluent
public class EndpointBaseUpdateProperties {
    /*
     * A description for the Endpoint.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the description property: A description for the Endpoint.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: A description for the Endpoint.
     *
     * @param description the description value to set.
     * @return the EndpointBaseUpdateProperties object itself.
     */
    public EndpointBaseUpdateProperties withDescription(String description) {
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
