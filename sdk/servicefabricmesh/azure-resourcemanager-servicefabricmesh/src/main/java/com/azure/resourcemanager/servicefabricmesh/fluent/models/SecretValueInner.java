// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmesh.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This type represents the unencrypted value of the secret. */
@Fluent
public final class SecretValueInner {
    /*
     * The actual value of the secret.
     */
    @JsonProperty(value = "value")
    private String value;

    /** Creates an instance of SecretValueInner class. */
    public SecretValueInner() {
    }

    /**
     * Get the value property: The actual value of the secret.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The actual value of the secret.
     *
     * @param value the value value to set.
     * @return the SecretValueInner object itself.
     */
    public SecretValueInner withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
