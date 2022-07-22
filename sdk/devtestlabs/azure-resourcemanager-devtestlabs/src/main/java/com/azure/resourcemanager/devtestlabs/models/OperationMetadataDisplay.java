// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The object that describes the operations. */
@Fluent
public final class OperationMetadataDisplay {
    /*
     * Friendly name of the resource provider
     */
    @JsonProperty(value = "provider")
    private String provider;

    /*
     * Resource type on which the operation is performed.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /*
     * Operation type: read, write, delete, listKeys/action, etc.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /*
     * Friendly name of the operation
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the provider property: Friendly name of the resource provider.
     *
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the provider property: Friendly name of the resource provider.
     *
     * @param provider the provider value to set.
     * @return the OperationMetadataDisplay object itself.
     */
    public OperationMetadataDisplay withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the resource property: Resource type on which the operation is performed.
     *
     * @return the resource value.
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set the resource property: Resource type on which the operation is performed.
     *
     * @param resource the resource value to set.
     * @return the OperationMetadataDisplay object itself.
     */
    public OperationMetadataDisplay withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the operation property: Operation type: read, write, delete, listKeys/action, etc.
     *
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the operation property: Operation type: read, write, delete, listKeys/action, etc.
     *
     * @param operation the operation value to set.
     * @return the OperationMetadataDisplay object itself.
     */
    public OperationMetadataDisplay withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the description property: Friendly name of the operation.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Friendly name of the operation.
     *
     * @param description the description value to set.
     * @return the OperationMetadataDisplay object itself.
     */
    public OperationMetadataDisplay withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
