// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The complex type of the extended location. */
@Fluent
public final class ExtendedLocation {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExtendedLocation.class);

    /*
     * The name of the extended location.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The type of the extended location.
     */
    @JsonProperty(value = "type")
    private ExtendedLocationTypes type;

    /**
     * Get the name property: The name of the extended location.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the extended location.
     *
     * @param name the name value to set.
     * @return the ExtendedLocation object itself.
     */
    public ExtendedLocation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The type of the extended location.
     *
     * @return the type value.
     */
    public ExtendedLocationTypes type() {
        return this.type;
    }

    /**
     * Set the type property: The type of the extended location.
     *
     * @param type the type value to set.
     * @return the ExtendedLocation object itself.
     */
    public ExtendedLocation withType(ExtendedLocationTypes type) {
        this.type = type;
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
