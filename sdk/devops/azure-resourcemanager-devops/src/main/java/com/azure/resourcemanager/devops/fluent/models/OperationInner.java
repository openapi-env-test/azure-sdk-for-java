// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devops.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of an Operation. */
@JsonFlatten
@Fluent
public class OperationInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationInner.class);

    /*
     * Name of the operation.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Indicates whether the operation applies to data-plane.
     */
    @JsonProperty(value = "isDataAction")
    private String isDataAction;

    /*
     * Friendly name of the operation.
     */
    @JsonProperty(value = "display.operation", access = JsonProperty.Access.WRITE_ONLY)
    private String operation;

    /*
     * Friendly name of the resource type the operation applies to.
     */
    @JsonProperty(value = "display.resource", access = JsonProperty.Access.WRITE_ONLY)
    private String resource;

    /*
     * Friendly description of the operation.
     */
    @JsonProperty(value = "display.description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * Friendly name of the resource provider.
     */
    @JsonProperty(value = "display.provider", access = JsonProperty.Access.WRITE_ONLY)
    private String provider;

    /**
     * Get the name property: Name of the operation.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the isDataAction property: Indicates whether the operation applies to data-plane.
     *
     * @return the isDataAction value.
     */
    public String isDataAction() {
        return this.isDataAction;
    }

    /**
     * Set the isDataAction property: Indicates whether the operation applies to data-plane.
     *
     * @param isDataAction the isDataAction value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withIsDataAction(String isDataAction) {
        this.isDataAction = isDataAction;
        return this;
    }

    /**
     * Get the operation property: Friendly name of the operation.
     *
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Get the resource property: Friendly name of the resource type the operation applies to.
     *
     * @return the resource value.
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Get the description property: Friendly description of the operation.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the provider property: Friendly name of the resource provider.
     *
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
