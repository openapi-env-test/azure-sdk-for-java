// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cosmos.generated.models.RestorableGremlinDatabasePropertiesResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of an Azure Cosmos DB Gremlin database event. */
@Fluent
public final class RestorableGremlinDatabaseProperties {
    /*
     * The resource of an Azure Cosmos DB Gremlin database event
     */
    @JsonProperty(value = "resource")
    private RestorableGremlinDatabasePropertiesResource resource;

    /**
     * Get the resource property: The resource of an Azure Cosmos DB Gremlin database event.
     *
     * @return the resource value.
     */
    public RestorableGremlinDatabasePropertiesResource resource() {
        return this.resource;
    }

    /**
     * Set the resource property: The resource of an Azure Cosmos DB Gremlin database event.
     *
     * @param resource the resource value to set.
     * @return the RestorableGremlinDatabaseProperties object itself.
     */
    public RestorableGremlinDatabaseProperties withResource(RestorableGremlinDatabasePropertiesResource resource) {
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
