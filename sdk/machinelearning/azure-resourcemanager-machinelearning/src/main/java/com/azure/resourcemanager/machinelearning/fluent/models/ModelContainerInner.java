// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearning.models.ModelContainerProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure Resource Manager resource envelope. */
@Fluent
public final class ModelContainerInner extends ProxyResource {
    /*
     * [Required] Additional attributes of the entity.
     */
    @JsonProperty(value = "properties", required = true)
    private ModelContainerProperties properties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy
     * information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the properties property: [Required] Additional attributes of the entity.
     *
     * @return the properties value.
     */
    public ModelContainerProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: [Required] Additional attributes of the entity.
     *
     * @param properties the properties value to set.
     * @return the ModelContainerInner object itself.
     */
    public ModelContainerInner withProperties(ModelContainerProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property properties in model ModelContainerInner"));
        } else {
            properties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ModelContainerInner.class);
}
