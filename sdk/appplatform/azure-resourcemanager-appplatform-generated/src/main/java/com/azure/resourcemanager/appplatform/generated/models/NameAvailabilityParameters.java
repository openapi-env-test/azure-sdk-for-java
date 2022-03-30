// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Name availability parameters payload. */
@Fluent
public final class NameAvailabilityParameters {
    /*
     * Type of the resource to check name availability
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /*
     * Name to be checked
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Get the type property: Type of the resource to check name availability.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Type of the resource to check name availability.
     *
     * @param type the type value to set.
     * @return the NameAvailabilityParameters object itself.
     */
    public NameAvailabilityParameters withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the name property: Name to be checked.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name to be checked.
     *
     * @param name the name value to set.
     * @return the NameAvailabilityParameters object itself.
     */
    public NameAvailabilityParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (type() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property type in model NameAvailabilityParameters"));
        }
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model NameAvailabilityParameters"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(NameAvailabilityParameters.class);
}
