// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Holds device secret either as a KeyVault reference or as an encrypted value. */
@Fluent
public final class Secret {
    /*
     * Encrypted (using device public key) secret value.
     */
    @JsonProperty(value = "encryptedSecret")
    private AsymmetricEncryptedSecret encryptedSecret;

    /*
     * Id of the Key-Vault where secret is stored (ex: secrets/AuthClientSecret/82ef4346187a4033a10d629cde07d740).
     */
    @JsonProperty(value = "keyVaultId")
    private String keyVaultId;

    /** Creates an instance of Secret class. */
    public Secret() {
    }

    /**
     * Get the encryptedSecret property: Encrypted (using device public key) secret value.
     *
     * @return the encryptedSecret value.
     */
    public AsymmetricEncryptedSecret encryptedSecret() {
        return this.encryptedSecret;
    }

    /**
     * Set the encryptedSecret property: Encrypted (using device public key) secret value.
     *
     * @param encryptedSecret the encryptedSecret value to set.
     * @return the Secret object itself.
     */
    public Secret withEncryptedSecret(AsymmetricEncryptedSecret encryptedSecret) {
        this.encryptedSecret = encryptedSecret;
        return this;
    }

    /**
     * Get the keyVaultId property: Id of the Key-Vault where secret is stored (ex:
     * secrets/AuthClientSecret/82ef4346187a4033a10d629cde07d740).
     *
     * @return the keyVaultId value.
     */
    public String keyVaultId() {
        return this.keyVaultId;
    }

    /**
     * Set the keyVaultId property: Id of the Key-Vault where secret is stored (ex:
     * secrets/AuthClientSecret/82ef4346187a4033a10d629cde07d740).
     *
     * @param keyVaultId the keyVaultId value to set.
     * @return the Secret object itself.
     */
    public Secret withKeyVaultId(String keyVaultId) {
        this.keyVaultId = keyVaultId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (encryptedSecret() != null) {
            encryptedSecret().validate();
        }
    }
}
