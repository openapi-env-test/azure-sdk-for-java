// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.AlertProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Implements the Alert class. */
@Fluent
public final class AlertInner extends ProxyResource {
    /*
     * Alert related data.
     */
    @JsonProperty(value = "properties")
    private AlertProperties properties;

    /*
     * Resource Location
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Get the properties property: Alert related data.
     *
     * @return the properties value.
     */
    public AlertProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Alert related data.
     *
     * @param properties the properties value to set.
     * @return the AlertInner object itself.
     */
    public AlertInner withProperties(AlertProperties properties) {
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
     * @return the AlertInner object itself.
     */
    public AlertInner withLocation(String location) {
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
