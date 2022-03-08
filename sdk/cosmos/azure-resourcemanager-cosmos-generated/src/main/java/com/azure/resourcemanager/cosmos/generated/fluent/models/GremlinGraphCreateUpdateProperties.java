// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.models.CreateUpdateOptions;
import com.azure.resourcemanager.cosmos.generated.models.GremlinGraphResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties to create and update Azure Cosmos DB Gremlin graph. */
@Fluent
public final class GremlinGraphCreateUpdateProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GremlinGraphCreateUpdateProperties.class);

    /*
     * The standard JSON format of a Gremlin graph
     */
    @JsonProperty(value = "resource", required = true)
    private GremlinGraphResource resource;

    /*
     * A key-value pair of options to be applied for the request. This
     * corresponds to the headers sent with the request.
     */
    @JsonProperty(value = "options")
    private CreateUpdateOptions options;

    /**
     * Get the resource property: The standard JSON format of a Gremlin graph.
     *
     * @return the resource value.
     */
    public GremlinGraphResource resource() {
        return this.resource;
    }

    /**
     * Set the resource property: The standard JSON format of a Gremlin graph.
     *
     * @param resource the resource value to set.
     * @return the GremlinGraphCreateUpdateProperties object itself.
     */
    public GremlinGraphCreateUpdateProperties withResource(GremlinGraphResource resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the options property: A key-value pair of options to be applied for the request. This corresponds to the
     * headers sent with the request.
     *
     * @return the options value.
     */
    public CreateUpdateOptions options() {
        return this.options;
    }

    /**
     * Set the options property: A key-value pair of options to be applied for the request. This corresponds to the
     * headers sent with the request.
     *
     * @param options the options value to set.
     * @return the GremlinGraphCreateUpdateProperties object itself.
     */
    public GremlinGraphCreateUpdateProperties withOptions(CreateUpdateOptions options) {
        this.options = options;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resource() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property resource in model GremlinGraphCreateUpdateProperties"));
        } else {
            resource().validate();
        }
        if (options() != null) {
            options().validate();
        }
    }
}
