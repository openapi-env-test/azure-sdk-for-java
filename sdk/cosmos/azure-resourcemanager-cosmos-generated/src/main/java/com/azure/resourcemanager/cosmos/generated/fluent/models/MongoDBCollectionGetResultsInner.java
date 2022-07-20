// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cosmos.generated.models.ArmResourceProperties;
import com.azure.resourcemanager.cosmos.generated.models.MongoDBCollectionGetPropertiesOptions;
import com.azure.resourcemanager.cosmos.generated.models.MongoDBCollectionGetPropertiesResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** An Azure Cosmos DB MongoDB collection. */
@Fluent
public final class MongoDBCollectionGetResultsInner extends ArmResourceProperties {
    /*
     * The properties of an Azure Cosmos DB MongoDB collection
     */
    @JsonProperty(value = "properties")
    private MongoDBCollectionGetProperties innerProperties;

    /**
     * Get the innerProperties property: The properties of an Azure Cosmos DB MongoDB collection.
     *
     * @return the innerProperties value.
     */
    private MongoDBCollectionGetProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public MongoDBCollectionGetResultsInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MongoDBCollectionGetResultsInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the resource property: The resource property.
     *
     * @return the resource value.
     */
    public MongoDBCollectionGetPropertiesResource resource() {
        return this.innerProperties() == null ? null : this.innerProperties().resource();
    }

    /**
     * Set the resource property: The resource property.
     *
     * @param resource the resource value to set.
     * @return the MongoDBCollectionGetResultsInner object itself.
     */
    public MongoDBCollectionGetResultsInner withResource(MongoDBCollectionGetPropertiesResource resource) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MongoDBCollectionGetProperties();
        }
        this.innerProperties().withResource(resource);
        return this;
    }

    /**
     * Get the options property: The options property.
     *
     * @return the options value.
     */
    public MongoDBCollectionGetPropertiesOptions options() {
        return this.innerProperties() == null ? null : this.innerProperties().options();
    }

    /**
     * Set the options property: The options property.
     *
     * @param options the options value to set.
     * @return the MongoDBCollectionGetResultsInner object itself.
     */
    public MongoDBCollectionGetResultsInner withOptions(MongoDBCollectionGetPropertiesOptions options) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MongoDBCollectionGetProperties();
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
