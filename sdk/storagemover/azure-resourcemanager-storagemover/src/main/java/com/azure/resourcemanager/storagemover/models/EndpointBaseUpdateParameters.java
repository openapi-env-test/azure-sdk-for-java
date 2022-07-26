// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The endpoint resource. */
@Fluent
public final class EndpointBaseUpdateParameters {
    /*
     * The endpoint resource, which contains information about file sources and
     * targets.
     */
    @JsonProperty(value = "properties")
    private EndpointBaseUpdateProperties properties;

    /**
     * Get the properties property: The endpoint resource, which contains information about file sources and targets.
     *
     * @return the properties value.
     */
    public EndpointBaseUpdateProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The endpoint resource, which contains information about file sources and targets.
     *
     * @param properties the properties value to set.
     * @return the EndpointBaseUpdateParameters object itself.
     */
    public EndpointBaseUpdateParameters withProperties(EndpointBaseUpdateProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
