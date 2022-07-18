// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Update network mapping input. */
@Fluent
public final class UpdateNetworkMappingInput {
    /*
     * The input properties needed to update network mapping.
     */
    @JsonProperty(value = "properties")
    private UpdateNetworkMappingInputProperties properties;

    /**
     * Get the properties property: The input properties needed to update network mapping.
     *
     * @return the properties value.
     */
    public UpdateNetworkMappingInputProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The input properties needed to update network mapping.
     *
     * @param properties the properties value to set.
     * @return the UpdateNetworkMappingInput object itself.
     */
    public UpdateNetworkMappingInput withProperties(UpdateNetworkMappingInputProperties properties) {
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
