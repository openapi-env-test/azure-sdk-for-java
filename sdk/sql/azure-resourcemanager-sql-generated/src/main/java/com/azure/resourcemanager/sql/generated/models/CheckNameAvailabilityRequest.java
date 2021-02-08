// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A request to check whether the specified name for a resource is available. */
@Fluent
public final class CheckNameAvailabilityRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CheckNameAvailabilityRequest.class);

    /*
     * The name whose availability is to be checked.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The type of resource that is used as the scope of the availability
     * check.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /** Creates an instance of CheckNameAvailabilityRequest class. */
    public CheckNameAvailabilityRequest() {
        type = "Microsoft.Sql/servers";
    }

    /**
     * Get the name property: The name whose availability is to be checked.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name whose availability is to be checked.
     *
     * @param name the name value to set.
     * @return the CheckNameAvailabilityRequest object itself.
     */
    public CheckNameAvailabilityRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The type of resource that is used as the scope of the availability check.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type of resource that is used as the scope of the availability check.
     *
     * @param type the type value to set.
     * @return the CheckNameAvailabilityRequest object itself.
     */
    public CheckNameAvailabilityRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property name in model CheckNameAvailabilityRequest"));
        }
    }
}
