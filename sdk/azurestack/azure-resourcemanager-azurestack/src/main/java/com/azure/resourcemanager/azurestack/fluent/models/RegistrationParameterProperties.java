// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of the Azure Stack registration resource. */
@Fluent
public final class RegistrationParameterProperties {
    /*
     * The token identifying registered Azure Stack
     */
    @JsonProperty(value = "registrationToken", required = true)
    private String registrationToken;

    /**
     * Get the registrationToken property: The token identifying registered Azure Stack.
     *
     * @return the registrationToken value.
     */
    public String registrationToken() {
        return this.registrationToken;
    }

    /**
     * Set the registrationToken property: The token identifying registered Azure Stack.
     *
     * @param registrationToken the registrationToken value to set.
     * @return the RegistrationParameterProperties object itself.
     */
    public RegistrationParameterProperties withRegistrationToken(String registrationToken) {
        this.registrationToken = registrationToken;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (registrationToken() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property registrationToken in model RegistrationParameterProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RegistrationParameterProperties.class);
}
