// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The EncryptionUpdateProperties model. */
@Fluent
public final class EncryptionUpdateProperties {
    /*
     * Customer Key vault properties.
     */
    @JsonProperty(value = "keyVaultProperties", required = true)
    private EncryptionKeyVaultUpdateProperties keyVaultProperties;

    /**
     * Get the keyVaultProperties property: Customer Key vault properties.
     *
     * @return the keyVaultProperties value.
     */
    public EncryptionKeyVaultUpdateProperties keyVaultProperties() {
        return this.keyVaultProperties;
    }

    /**
     * Set the keyVaultProperties property: Customer Key vault properties.
     *
     * @param keyVaultProperties the keyVaultProperties value to set.
     * @return the EncryptionUpdateProperties object itself.
     */
    public EncryptionUpdateProperties withKeyVaultProperties(EncryptionKeyVaultUpdateProperties keyVaultProperties) {
        this.keyVaultProperties = keyVaultProperties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyVaultProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property keyVaultProperties in model EncryptionUpdateProperties"));
        } else {
            keyVaultProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EncryptionUpdateProperties.class);
}
