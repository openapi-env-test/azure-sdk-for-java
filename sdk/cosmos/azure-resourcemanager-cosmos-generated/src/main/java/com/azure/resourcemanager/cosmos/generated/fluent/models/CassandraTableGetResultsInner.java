// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.models.ArmResourceProperties;
import com.azure.resourcemanager.cosmos.generated.models.CassandraTableGetPropertiesOptions;
import com.azure.resourcemanager.cosmos.generated.models.CassandraTableGetPropertiesResource;
import com.azure.resourcemanager.cosmos.generated.models.ManagedServiceIdentity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** An Azure Cosmos DB Cassandra table. */
@Fluent
public final class CassandraTableGetResultsInner extends ArmResourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CassandraTableGetResultsInner.class);

    /*
     * The properties of an Azure Cosmos DB Cassandra table
     */
    @JsonProperty(value = "properties")
    private CassandraTableGetProperties innerProperties;

    /**
     * Get the innerProperties property: The properties of an Azure Cosmos DB Cassandra table.
     *
     * @return the innerProperties value.
     */
    private CassandraTableGetProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public CassandraTableGetResultsInner withIdentity(ManagedServiceIdentity identity) {
        super.withIdentity(identity);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CassandraTableGetResultsInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CassandraTableGetResultsInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the resource property: The resource property.
     *
     * @return the resource value.
     */
    public CassandraTableGetPropertiesResource resource() {
        return this.innerProperties() == null ? null : this.innerProperties().resource();
    }

    /**
     * Set the resource property: The resource property.
     *
     * @param resource the resource value to set.
     * @return the CassandraTableGetResultsInner object itself.
     */
    public CassandraTableGetResultsInner withResource(CassandraTableGetPropertiesResource resource) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CassandraTableGetProperties();
        }
        this.innerProperties().withResource(resource);
        return this;
    }

    /**
     * Get the options property: The options property.
     *
     * @return the options value.
     */
    public CassandraTableGetPropertiesOptions options() {
        return this.innerProperties() == null ? null : this.innerProperties().options();
    }

    /**
     * Set the options property: The options property.
     *
     * @param options the options value to set.
     * @return the CassandraTableGetResultsInner object itself.
     */
    public CassandraTableGetResultsInner withOptions(CassandraTableGetPropertiesOptions options) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CassandraTableGetProperties();
        }
        this.innerProperties().withOptions(options);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
