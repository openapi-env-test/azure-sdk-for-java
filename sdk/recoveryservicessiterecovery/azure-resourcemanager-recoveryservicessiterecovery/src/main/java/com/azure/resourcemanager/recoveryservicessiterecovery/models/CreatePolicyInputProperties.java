// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Policy creation properties. */
@Fluent
public final class CreatePolicyInputProperties {
    /*
     * The ReplicationProviderSettings.
     */
    @JsonProperty(value = "providerSpecificInput")
    private PolicyProviderSpecificInput providerSpecificInput;

    /**
     * Get the providerSpecificInput property: The ReplicationProviderSettings.
     *
     * @return the providerSpecificInput value.
     */
    public PolicyProviderSpecificInput providerSpecificInput() {
        return this.providerSpecificInput;
    }

    /**
     * Set the providerSpecificInput property: The ReplicationProviderSettings.
     *
     * @param providerSpecificInput the providerSpecificInput value to set.
     * @return the CreatePolicyInputProperties object itself.
     */
    public CreatePolicyInputProperties withProviderSpecificInput(PolicyProviderSpecificInput providerSpecificInput) {
        this.providerSpecificInput = providerSpecificInput;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (providerSpecificInput() != null) {
            providerSpecificInput().validate();
        }
    }
}
