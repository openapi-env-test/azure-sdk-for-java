// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Create network mappings input properties/behavior specific to Azure to Azure Network mapping. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("AzureToAzure")
@Fluent
public final class AzureToAzureCreateNetworkMappingInput extends FabricSpecificCreateNetworkMappingInput {
    /*
     * The primary azure vnet Id.
     */
    @JsonProperty(value = "primaryNetworkId", required = true)
    private String primaryNetworkId;

    /**
     * Get the primaryNetworkId property: The primary azure vnet Id.
     *
     * @return the primaryNetworkId value.
     */
    public String primaryNetworkId() {
        return this.primaryNetworkId;
    }

    /**
     * Set the primaryNetworkId property: The primary azure vnet Id.
     *
     * @param primaryNetworkId the primaryNetworkId value to set.
     * @return the AzureToAzureCreateNetworkMappingInput object itself.
     */
    public AzureToAzureCreateNetworkMappingInput withPrimaryNetworkId(String primaryNetworkId) {
        this.primaryNetworkId = primaryNetworkId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (primaryNetworkId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property primaryNetworkId in model AzureToAzureCreateNetworkMappingInput"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureToAzureCreateNetworkMappingInput.class);
}
