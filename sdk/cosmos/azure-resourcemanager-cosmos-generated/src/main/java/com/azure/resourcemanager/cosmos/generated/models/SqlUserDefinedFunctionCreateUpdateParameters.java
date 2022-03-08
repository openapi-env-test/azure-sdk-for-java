// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.fluent.models.SqlUserDefinedFunctionCreateUpdateProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Parameters to create and update Cosmos DB userDefinedFunction. */
@Fluent
public final class SqlUserDefinedFunctionCreateUpdateParameters extends ArmResourceProperties {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(SqlUserDefinedFunctionCreateUpdateParameters.class);

    /*
     * Properties to create and update Azure Cosmos DB userDefinedFunction.
     */
    @JsonProperty(value = "properties", required = true)
    private SqlUserDefinedFunctionCreateUpdateProperties innerProperties =
        new SqlUserDefinedFunctionCreateUpdateProperties();

    /**
     * Get the innerProperties property: Properties to create and update Azure Cosmos DB userDefinedFunction.
     *
     * @return the innerProperties value.
     */
    private SqlUserDefinedFunctionCreateUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public SqlUserDefinedFunctionCreateUpdateParameters withIdentity(ManagedServiceIdentity identity) {
        super.withIdentity(identity);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlUserDefinedFunctionCreateUpdateParameters withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlUserDefinedFunctionCreateUpdateParameters withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the resource property: The standard JSON format of a userDefinedFunction.
     *
     * @return the resource value.
     */
    public SqlUserDefinedFunctionResource resource() {
        return this.innerProperties() == null ? null : this.innerProperties().resource();
    }

    /**
     * Set the resource property: The standard JSON format of a userDefinedFunction.
     *
     * @param resource the resource value to set.
     * @return the SqlUserDefinedFunctionCreateUpdateParameters object itself.
     */
    public SqlUserDefinedFunctionCreateUpdateParameters withResource(SqlUserDefinedFunctionResource resource) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlUserDefinedFunctionCreateUpdateProperties();
        }
        this.innerProperties().withResource(resource);
        return this;
    }

    /**
     * Get the options property: A key-value pair of options to be applied for the request. This corresponds to the
     * headers sent with the request.
     *
     * @return the options value.
     */
    public CreateUpdateOptions options() {
        return this.innerProperties() == null ? null : this.innerProperties().options();
    }

    /**
     * Set the options property: A key-value pair of options to be applied for the request. This corresponds to the
     * headers sent with the request.
     *
     * @param options the options value to set.
     * @return the SqlUserDefinedFunctionCreateUpdateParameters object itself.
     */
    public SqlUserDefinedFunctionCreateUpdateParameters withOptions(CreateUpdateOptions options) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlUserDefinedFunctionCreateUpdateProperties();
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
        if (innerProperties() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model"
                            + " SqlUserDefinedFunctionCreateUpdateParameters"));
        } else {
            innerProperties().validate();
        }
    }
}
