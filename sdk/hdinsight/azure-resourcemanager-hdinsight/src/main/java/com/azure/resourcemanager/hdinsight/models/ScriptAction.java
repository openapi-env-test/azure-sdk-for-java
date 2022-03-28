// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes a script action on role on the cluster. */
@Fluent
public final class ScriptAction {
    /*
     * The name of the script action.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The URI to the script.
     */
    @JsonProperty(value = "uri", required = true)
    private String uri;

    /*
     * The parameters for the script provided.
     */
    @JsonProperty(value = "parameters", required = true)
    private String parameters;

    /**
     * Get the name property: The name of the script action.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the script action.
     *
     * @param name the name value to set.
     * @return the ScriptAction object itself.
     */
    public ScriptAction withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the uri property: The URI to the script.
     *
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the uri property: The URI to the script.
     *
     * @param uri the uri value to set.
     * @return the ScriptAction object itself.
     */
    public ScriptAction withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get the parameters property: The parameters for the script provided.
     *
     * @return the parameters value.
     */
    public String parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: The parameters for the script provided.
     *
     * @param parameters the parameters value to set.
     * @return the ScriptAction object itself.
     */
    public ScriptAction withParameters(String parameters) {
        this.parameters = parameters;
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
                    new IllegalArgumentException("Missing required property name in model ScriptAction"));
        }
        if (uri() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property uri in model ScriptAction"));
        }
        if (parameters() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property parameters in model ScriptAction"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ScriptAction.class);
}
