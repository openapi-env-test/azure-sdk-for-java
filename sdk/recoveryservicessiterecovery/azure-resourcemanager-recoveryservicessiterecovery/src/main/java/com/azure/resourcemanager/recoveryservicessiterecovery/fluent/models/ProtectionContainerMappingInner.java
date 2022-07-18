// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ProtectionContainerMappingProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Protection container mapping object. */
@Fluent
public final class ProtectionContainerMappingInner extends ProxyResource {
    /*
     * The custom data.
     */
    @JsonProperty(value = "properties")
    private ProtectionContainerMappingProperties properties;

    /*
     * Resource Location
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Get the properties property: The custom data.
     *
     * @return the properties value.
     */
    public ProtectionContainerMappingProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The custom data.
     *
     * @param properties the properties value to set.
     * @return the ProtectionContainerMappingInner object itself.
     */
    public ProtectionContainerMappingInner withProperties(ProtectionContainerMappingProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the location property: Resource Location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Resource Location.
     *
     * @param location the location value to set.
     * @return the ProtectionContainerMappingInner object itself.
     */
    public ProtectionContainerMappingInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
