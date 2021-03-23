// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devops.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Reference to an Azure DevOps Organization. */
@Fluent
public final class OrganizationReference {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OrganizationReference.class);

    /*
     * Unique immutable identifier for the Azure DevOps Organization.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Name of the Azure DevOps Organization.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Get the id property: Unique immutable identifier for the Azure DevOps Organization.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: Name of the Azure DevOps Organization.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the Azure DevOps Organization.
     *
     * @param name the name value to set.
     * @return the OrganizationReference object itself.
     */
    public OrganizationReference withName(String name) {
        this.name = name;
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
                    new IllegalArgumentException("Missing required property name in model OrganizationReference"));
        }
    }
}
