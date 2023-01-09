// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.releaseplannertest.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** Identity for the resource. */
@Fluent
public class Identity {
    /*
     * The principal ID of resource identity. The value must be an UUID.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID principalId;

    /*
     * The tenant ID of resource. The value must be an UUID.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID tenantId;

    /*
     * The identity type.
     */
    @JsonProperty(value = "type")
    private ResourceIdentityType type;

    /** Creates an instance of Identity class. */
    public Identity() {
    }

    /**
     * Get the principalId property: The principal ID of resource identity. The value must be an UUID.
     *
     * @return the principalId value.
     */
    public UUID principalId() {
        return this.principalId;
    }

    /**
     * Get the tenantId property: The tenant ID of resource. The value must be an UUID.
     *
     * @return the tenantId value.
     */
    public UUID tenantId() {
        return this.tenantId;
    }

    /**
     * Get the type property: The identity type.
     *
     * @return the type value.
     */
    public ResourceIdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: The identity type.
     *
     * @param type the type value to set.
     * @return the Identity object itself.
     */
    public Identity withType(ResourceIdentityType type) {
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
