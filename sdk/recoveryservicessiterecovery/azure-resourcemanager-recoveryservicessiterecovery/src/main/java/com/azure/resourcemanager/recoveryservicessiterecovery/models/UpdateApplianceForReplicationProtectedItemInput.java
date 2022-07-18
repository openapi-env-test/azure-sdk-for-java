// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Update appliance for replication protected item input. */
@Fluent
public final class UpdateApplianceForReplicationProtectedItemInput {
    /*
     * Update appliance replication protected item properties.
     */
    @JsonProperty(value = "properties", required = true)
    private UpdateApplianceForReplicationProtectedItemInputProperties properties;

    /**
     * Get the properties property: Update appliance replication protected item properties.
     *
     * @return the properties value.
     */
    public UpdateApplianceForReplicationProtectedItemInputProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Update appliance replication protected item properties.
     *
     * @param properties the properties value to set.
     * @return the UpdateApplianceForReplicationProtectedItemInput object itself.
     */
    public UpdateApplianceForReplicationProtectedItemInput withProperties(
        UpdateApplianceForReplicationProtectedItemInputProperties properties) {
        this.properties = properties;
        return this;
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
                    new IllegalArgumentException(
                        "Missing required property properties in model"
                            + " UpdateApplianceForReplicationProtectedItemInput"));
        } else {
            properties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(UpdateApplianceForReplicationProtectedItemInput.class);
}
