// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of the KeyVault key. */
@Fluent
public final class KeyVaultKeyProperties {
    /*
     * The identifier of the key.
     */
    @JsonProperty(value = "keyIdentifier")
    private String keyIdentifier;

    /*
     * Managed identity properties of KeyVault Key.
     */
    @JsonProperty(value = "identity")
    private ManagedIdentity identity;

    /**
     * Get the keyIdentifier property: The identifier of the key.
     *
     * @return the keyIdentifier value.
     */
    public String keyIdentifier() {
        return this.keyIdentifier;
    }

    /**
     * Set the keyIdentifier property: The identifier of the key.
     *
     * @param keyIdentifier the keyIdentifier value to set.
     * @return the KeyVaultKeyProperties object itself.
     */
    public KeyVaultKeyProperties withKeyIdentifier(String keyIdentifier) {
        this.keyIdentifier = keyIdentifier;
        return this;
    }

    /**
     * Get the identity property: Managed identity properties of KeyVault Key.
     *
     * @return the identity value.
     */
    public ManagedIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Managed identity properties of KeyVault Key.
     *
     * @param identity the identity value to set.
     * @return the KeyVaultKeyProperties object itself.
     */
    public KeyVaultKeyProperties withIdentity(ManagedIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
    }
}
