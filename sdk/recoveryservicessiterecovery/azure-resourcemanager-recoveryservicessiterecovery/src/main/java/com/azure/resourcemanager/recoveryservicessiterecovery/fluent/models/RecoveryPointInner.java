// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPointProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Recovery point. */
@Fluent
public final class RecoveryPointInner extends ProxyResource {
    /*
     * The recovery point properties.
     */
    @JsonProperty(value = "properties")
    private RecoveryPointProperties properties;

    /*
     * Resource Location
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Get the properties property: The recovery point properties.
     *
     * @return the properties value.
     */
    public RecoveryPointProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The recovery point properties.
     *
     * @param properties the properties value to set.
     * @return the RecoveryPointInner object itself.
     */
    public RecoveryPointInner withProperties(RecoveryPointProperties properties) {
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
     * @return the RecoveryPointInner object itself.
     */
    public RecoveryPointInner withLocation(String location) {
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
