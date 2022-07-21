// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.models.TransparentDataEncryptionState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of a transparent data encryption. */
@Fluent
public final class TransparentDataEncryptionProperties {
    /*
     * Specifies the state of the transparent data encryption.
     */
    @JsonProperty(value = "state", required = true)
    private TransparentDataEncryptionState state;

    /**
     * Get the state property: Specifies the state of the transparent data encryption.
     *
     * @return the state value.
     */
    public TransparentDataEncryptionState state() {
        return this.state;
    }

    /**
     * Set the state property: Specifies the state of the transparent data encryption.
     *
     * @param state the state value to set.
     * @return the TransparentDataEncryptionProperties object itself.
     */
    public TransparentDataEncryptionProperties withState(TransparentDataEncryptionState state) {
        this.state = state;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (state() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property state in model TransparentDataEncryptionProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TransparentDataEncryptionProperties.class);
}
