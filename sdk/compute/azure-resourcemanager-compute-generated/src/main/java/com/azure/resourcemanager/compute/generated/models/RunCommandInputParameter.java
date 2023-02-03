// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the properties of a run command parameter. */
@Fluent
public final class RunCommandInputParameter {
    /*
     * The run command parameter name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The run command parameter value.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /** Creates an instance of RunCommandInputParameter class. */
    public RunCommandInputParameter() {
    }

    /**
     * Get the name property: The run command parameter name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The run command parameter name.
     *
     * @param name the name value to set.
     * @return the RunCommandInputParameter object itself.
     */
    public RunCommandInputParameter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: The run command parameter value.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The run command parameter value.
     *
     * @param value the value value to set.
     * @return the RunCommandInputParameter object itself.
     */
    public RunCommandInputParameter withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model RunCommandInputParameter"));
        }
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model RunCommandInputParameter"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RunCommandInputParameter.class);
}
