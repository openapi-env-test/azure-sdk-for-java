// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Cosmos DB SQL userDefinedFunction resource object. */
@Fluent
public class SqlUserDefinedFunctionResource {
    /*
     * Name of the Cosmos DB SQL userDefinedFunction
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * Body of the User Defined Function
     */
    @JsonProperty(value = "body")
    private String body;

    /**
     * Get the id property: Name of the Cosmos DB SQL userDefinedFunction.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Name of the Cosmos DB SQL userDefinedFunction.
     *
     * @param id the id value to set.
     * @return the SqlUserDefinedFunctionResource object itself.
     */
    public SqlUserDefinedFunctionResource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the body property: Body of the User Defined Function.
     *
     * @return the body value.
     */
    public String body() {
        return this.body;
    }

    /**
     * Set the body property: Body of the User Defined Function.
     *
     * @param body the body value to set.
     * @return the SqlUserDefinedFunctionResource object itself.
     */
    public SqlUserDefinedFunctionResource withBody(String body) {
        this.body = body;
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
                    new IllegalArgumentException(
                        "Missing required property id in model SqlUserDefinedFunctionResource"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SqlUserDefinedFunctionResource.class);
}
