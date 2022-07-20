// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Resource for a regional service location. */
@Immutable
public final class SqlDedicatedGatewayRegionalServiceResource extends RegionalServiceResource {
    /*
     * The regional endpoint for SqlDedicatedGateway.
     */
    @JsonProperty(value = "sqlDedicatedGatewayEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String sqlDedicatedGatewayEndpoint;

    /**
     * Get the sqlDedicatedGatewayEndpoint property: The regional endpoint for SqlDedicatedGateway.
     *
     * @return the sqlDedicatedGatewayEndpoint value.
     */
    public String sqlDedicatedGatewayEndpoint() {
        return this.sqlDedicatedGatewayEndpoint;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
