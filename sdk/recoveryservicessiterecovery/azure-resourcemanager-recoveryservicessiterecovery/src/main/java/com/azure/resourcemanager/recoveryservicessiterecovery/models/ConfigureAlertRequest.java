// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Request to configure alerts for the system. */
@Fluent
public final class ConfigureAlertRequest {
    /*
     * The properties of a configure alert request.
     */
    @JsonProperty(value = "properties")
    private ConfigureAlertRequestProperties properties;

    /**
     * Get the properties property: The properties of a configure alert request.
     *
     * @return the properties value.
     */
    public ConfigureAlertRequestProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties of a configure alert request.
     *
     * @param properties the properties value to set.
     * @return the ConfigureAlertRequest object itself.
     */
    public ConfigureAlertRequest withProperties(ConfigureAlertRequestProperties properties) {
        this.properties = properties;
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
