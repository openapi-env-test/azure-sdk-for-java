// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Cosmos DB Cassandra view resource object. */
@Fluent
public class CassandraViewResource {
    /*
     * Name of the Cosmos DB Cassandra view
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * View Definition of the Cosmos DB Cassandra view
     */
    @JsonProperty(value = "viewDefinition", required = true)
    private String viewDefinition;

    /**
     * Get the id property: Name of the Cosmos DB Cassandra view.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Name of the Cosmos DB Cassandra view.
     *
     * @param id the id value to set.
     * @return the CassandraViewResource object itself.
     */
    public CassandraViewResource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the viewDefinition property: View Definition of the Cosmos DB Cassandra view.
     *
     * @return the viewDefinition value.
     */
    public String viewDefinition() {
        return this.viewDefinition;
    }

    /**
     * Set the viewDefinition property: View Definition of the Cosmos DB Cassandra view.
     *
     * @param viewDefinition the viewDefinition value to set.
     * @return the CassandraViewResource object itself.
     */
    public CassandraViewResource withViewDefinition(String viewDefinition) {
        this.viewDefinition = viewDefinition;
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
                    new IllegalArgumentException("Missing required property id in model CassandraViewResource"));
        }
        if (viewDefinition() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property viewDefinition in model CassandraViewResource"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CassandraViewResource.class);
}
