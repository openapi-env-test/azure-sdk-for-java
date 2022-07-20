// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Resource for a regional service location. */
@Immutable
public class RegionalServiceResource {
    /*
     * The regional service name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The location name.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /*
     * Describes the status of a service.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private ServiceStatus status;

    /**
     * Get the name property: The regional service name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the location property: The location name.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the status property: Describes the status of a service.
     *
     * @return the status value.
     */
    public ServiceStatus status() {
        return this.status;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
