// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Contains the private endpoint connection requests status. */
@Immutable
public final class PrivateEndpointConnectionRequestStatus {
    /*
     * Resource id for which the private endpoint is created.
     */
    @JsonProperty(value = "privateLinkServiceId", access = JsonProperty.Access.WRITE_ONLY)
    private String privateLinkServiceId;

    /*
     * The connection name for the private endpoint.
     */
    @JsonProperty(value = "privateEndpointConnectionName", access = JsonProperty.Access.WRITE_ONLY)
    private String privateEndpointConnectionName;

    /*
     * Status of this private endpoint connection.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /** Creates an instance of PrivateEndpointConnectionRequestStatus class. */
    public PrivateEndpointConnectionRequestStatus() {
    }

    /**
     * Get the privateLinkServiceId property: Resource id for which the private endpoint is created.
     *
     * @return the privateLinkServiceId value.
     */
    public String privateLinkServiceId() {
        return this.privateLinkServiceId;
    }

    /**
     * Get the privateEndpointConnectionName property: The connection name for the private endpoint.
     *
     * @return the privateEndpointConnectionName value.
     */
    public String privateEndpointConnectionName() {
        return this.privateEndpointConnectionName;
    }

    /**
     * Get the status property: Status of this private endpoint connection.
     *
     * @return the status value.
     */
    public String status() {
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
