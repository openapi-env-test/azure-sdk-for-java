// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cosmos.generated.models.SqlTriggerGetPropertiesResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of an Azure Cosmos DB trigger. */
@Fluent
public final class SqlTriggerGetProperties {
    /*
     * The resource property.
     */
    @JsonProperty(value = "resource")
    private SqlTriggerGetPropertiesResource resource;

    /**
     * Get the resource property: The resource property.
     *
     * @return the resource value.
     */
    public SqlTriggerGetPropertiesResource resource() {
        return this.resource;
    }

    /**
     * Set the resource property: The resource property.
     *
     * @param resource the resource value to set.
     * @return the SqlTriggerGetProperties object itself.
     */
    public SqlTriggerGetProperties withResource(SqlTriggerGetPropertiesResource resource) {
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
