// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cdn.generated.models.SecurityPolicyPropertiesParameters;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The json object that contains properties required to update a security policy. */
@Fluent
public final class SecurityPolicyUpdateProperties {
    /*
     * object which contains security policy parameters
     */
    @JsonProperty(value = "parameters")
    private SecurityPolicyPropertiesParameters parameters;

    /**
     * Get the parameters property: object which contains security policy parameters.
     *
     * @return the parameters value.
     */
    public SecurityPolicyPropertiesParameters parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: object which contains security policy parameters.
     *
     * @param parameters the parameters value to set.
     * @return the SecurityPolicyUpdateProperties object itself.
     */
    public SecurityPolicyUpdateProperties withParameters(SecurityPolicyPropertiesParameters parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (parameters() != null) {
            parameters().validate();
        }
    }
}
