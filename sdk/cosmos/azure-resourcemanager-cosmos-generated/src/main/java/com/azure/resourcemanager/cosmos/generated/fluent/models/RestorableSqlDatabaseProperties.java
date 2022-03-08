// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.models.RestorableSqlDatabasePropertiesResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of an Azure Cosmos DB SQL database event. */
@Fluent
public final class RestorableSqlDatabaseProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RestorableSqlDatabaseProperties.class);

    /*
     * The resource of an Azure Cosmos DB SQL database event
     */
    @JsonProperty(value = "resource")
    private RestorableSqlDatabasePropertiesResource resource;

    /**
     * Get the resource property: The resource of an Azure Cosmos DB SQL database event.
     *
     * @return the resource value.
     */
    public RestorableSqlDatabasePropertiesResource resource() {
        return this.resource;
    }

    /**
     * Set the resource property: The resource of an Azure Cosmos DB SQL database event.
     *
     * @param resource the resource value to set.
     * @return the RestorableSqlDatabaseProperties object itself.
     */
    public RestorableSqlDatabaseProperties withResource(RestorableSqlDatabasePropertiesResource resource) {
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
