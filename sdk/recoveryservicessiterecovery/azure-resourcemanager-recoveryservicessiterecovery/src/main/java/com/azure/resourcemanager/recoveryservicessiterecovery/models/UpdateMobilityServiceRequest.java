// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Request to update the mobility service on a protected item. */
@Fluent
public final class UpdateMobilityServiceRequest {
    /*
     * The properties of the update mobility service request.
     */
    @JsonProperty(value = "properties")
    private UpdateMobilityServiceRequestProperties properties;

    /**
     * Get the properties property: The properties of the update mobility service request.
     *
     * @return the properties value.
     */
    public UpdateMobilityServiceRequestProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties of the update mobility service request.
     *
     * @param properties the properties value to set.
     * @return the UpdateMobilityServiceRequest object itself.
     */
    public UpdateMobilityServiceRequest withProperties(UpdateMobilityServiceRequestProperties properties) {
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
