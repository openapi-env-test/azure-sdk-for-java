// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Identity for the resource. */
@Fluent
public class Identity {
    /*
     * The principal ID of the system-assigned identity of the search service.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /*
     * The tenant ID of the system-assigned identity of the search service.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /*
     * The identity type.
     */
    @JsonProperty(value = "type", required = true)
    private IdentityType type;

    /** Creates an instance of Identity class. */
    public Identity() {
    }

    /**
     * Get the principalId property: The principal ID of the system-assigned identity of the search service.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the tenantId property: The tenant ID of the system-assigned identity of the search service.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the type property: The identity type.
     *
     * @return the type value.
     */
    public IdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: The identity type.
     *
     * @param type the type value to set.
     * @return the Identity object itself.
     */
    public Identity withType(IdentityType type) {
        this.type = type;
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
                .logExceptionAsError(new IllegalArgumentException("Missing required property type in model Identity"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Identity.class);
}
