// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Cosmos DB MongoDB database resource object. */
@Fluent
public class MongoDBDatabaseResource {
    /*
     * Name of the Cosmos DB MongoDB database
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Get the id property: Name of the Cosmos DB MongoDB database.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Name of the Cosmos DB MongoDB database.
     *
     * @param id the id value to set.
     * @return the MongoDBDatabaseResource object itself.
     */
    public MongoDBDatabaseResource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property id in model MongoDBDatabaseResource"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MongoDBDatabaseResource.class);
}
