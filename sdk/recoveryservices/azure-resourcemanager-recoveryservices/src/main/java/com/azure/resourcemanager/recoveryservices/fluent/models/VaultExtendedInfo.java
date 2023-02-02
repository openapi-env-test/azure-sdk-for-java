// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Vault extended information. */
@Fluent
public final class VaultExtendedInfo {
    /*
     * Integrity key.
     */
    @JsonProperty(value = "integrityKey")
    private String integrityKey;

    /*
     * Encryption key.
     */
    @JsonProperty(value = "encryptionKey")
    private String encryptionKey;

    /*
     * Encryption key thumbprint.
     */
    @JsonProperty(value = "encryptionKeyThumbprint")
    private String encryptionKeyThumbprint;

    /*
     * Algorithm for Vault ExtendedInfo
     */
    @JsonProperty(value = "algorithm")
    private String algorithm;

    /** Creates an instance of VaultExtendedInfo class. */
    public VaultExtendedInfo() {
    }

    /**
     * Get the integrityKey property: Integrity key.
     *
     * @return the integrityKey value.
     */
    public String integrityKey() {
        return this.integrityKey;
    }

    /**
     * Set the integrityKey property: Integrity key.
     *
     * @param integrityKey the integrityKey value to set.
     * @return the VaultExtendedInfo object itself.
     */
    public VaultExtendedInfo withIntegrityKey(String integrityKey) {
        this.integrityKey = integrityKey;
        return this;
    }

    /**
     * Get the encryptionKey property: Encryption key.
     *
     * @return the encryptionKey value.
     */
    public String encryptionKey() {
        return this.encryptionKey;
    }

    /**
     * Set the encryptionKey property: Encryption key.
     *
     * @param encryptionKey the encryptionKey value to set.
     * @return the VaultExtendedInfo object itself.
     */
    public VaultExtendedInfo withEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }

    /**
     * Get the encryptionKeyThumbprint property: Encryption key thumbprint.
     *
     * @return the encryptionKeyThumbprint value.
     */
    public String encryptionKeyThumbprint() {
        return this.encryptionKeyThumbprint;
    }

    /**
     * Set the encryptionKeyThumbprint property: Encryption key thumbprint.
     *
     * @param encryptionKeyThumbprint the encryptionKeyThumbprint value to set.
     * @return the VaultExtendedInfo object itself.
     */
    public VaultExtendedInfo withEncryptionKeyThumbprint(String encryptionKeyThumbprint) {
        this.encryptionKeyThumbprint = encryptionKeyThumbprint;
        return this;
    }

    /**
     * Get the algorithm property: Algorithm for Vault ExtendedInfo.
     *
     * @return the algorithm value.
     */
    public String algorithm() {
        return this.algorithm;
    }

    /**
     * Set the algorithm property: Algorithm for Vault ExtendedInfo.
     *
     * @param algorithm the algorithm value to set.
     * @return the VaultExtendedInfo object itself.
     */
    public VaultExtendedInfo withAlgorithm(String algorithm) {
        this.algorithm = algorithm;
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
