// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.models.RestorableGremlinGraphPropertiesResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of an Azure Cosmos DB Gremlin graph event. */
@Fluent
public final class RestorableGremlinGraphProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RestorableGremlinGraphProperties.class);

    /*
     * The resource of an Azure Cosmos DB Gremlin graph event
     */
    @JsonProperty(value = "resource")
    private RestorableGremlinGraphPropertiesResource resource;

    /**
     * Get the resource property: The resource of an Azure Cosmos DB Gremlin graph event.
     *
     * @return the resource value.
     */
    public RestorableGremlinGraphPropertiesResource resource() {
        return this.resource;
    }

    /**
     * Set the resource property: The resource of an Azure Cosmos DB Gremlin graph event.
     *
     * @param resource the resource value to set.
     * @return the RestorableGremlinGraphProperties object itself.
     */
    public RestorableGremlinGraphProperties withResource(RestorableGremlinGraphPropertiesResource resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resource() != null) {
            resource().validate();
        }
    }
}
