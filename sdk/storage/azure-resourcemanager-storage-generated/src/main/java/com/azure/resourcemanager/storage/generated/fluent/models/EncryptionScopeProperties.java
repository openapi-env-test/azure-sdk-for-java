// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.storage.generated.models.EncryptionScopeKeyVaultProperties;
import com.azure.resourcemanager.storage.generated.models.EncryptionScopeSource;
import com.azure.resourcemanager.storage.generated.models.EncryptionScopeState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Properties of the encryption scope. */
@Fluent
public final class EncryptionScopeProperties {
    /*
     * The provider for the encryption scope. Possible values
     * (case-insensitive):  Microsoft.Storage, Microsoft.KeyVault.
     */
    @JsonProperty(value = "source")
    private EncryptionScopeSource source;

    /*
     * The state of the encryption scope. Possible values (case-insensitive):
     * Enabled, Disabled.
     */
    @JsonProperty(value = "state")
    private EncryptionScopeState state;

    /*
     * Gets the creation date and time of the encryption scope in UTC.
     */
    @JsonProperty(value = "creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationTime;

    /*
     * Gets the last modification date and time of the encryption scope in UTC.
     */
    @JsonProperty(value = "lastModifiedTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModifiedTime;

    /*
     * The key vault properties for the encryption scope. This is a required
     * field if encryption scope 'source' attribute is set to
     * 'Microsoft.KeyVault'.
     */
    @JsonProperty(value = "keyVaultProperties")
    private EncryptionScopeKeyVaultProperties keyVaultProperties;

    /*
     * A boolean indicating whether or not the service applies a secondary
     * layer of encryption with platform managed keys for data at rest.
     */
    @JsonProperty(value = "requireInfrastructureEncryption")
    private Boolean requireInfrastructureEncryption;

    /**
     * Get the source property: The provider for the encryption scope. Possible values (case-insensitive):
     * Microsoft.Storage, Microsoft.KeyVault.
     *
     * @return the source value.
     */
    public EncryptionScopeSource source() {
        return this.source;
    }

    /**
     * Set the source property: The provider for the encryption scope. Possible values (case-insensitive):
     * Microsoft.Storage, Microsoft.KeyVault.
     *
     * @param source the source value to set.
     * @return the EncryptionScopeProperties object itself.
     */
    public EncryptionScopeProperties withSource(EncryptionScopeSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the state property: The state of the encryption scope. Possible values (case-insensitive): Enabled, Disabled.
     *
     * @return the state value.
     */
    public EncryptionScopeState state() {
        return this.state;
    }

    /**
     * Set the state property: The state of the encryption scope. Possible values (case-insensitive): Enabled, Disabled.
     *
     * @param state the state value to set.
     * @return the EncryptionScopeProperties object itself.
     */
    public EncryptionScopeProperties withState(EncryptionScopeState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the creationTime property: Gets the creation date and time of the encryption scope in UTC.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get the lastModifiedTime property: Gets the last modification date and time of the encryption scope in UTC.
     *
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Get the keyVaultProperties property: The key vault properties for the encryption scope. This is a required field
     * if encryption scope 'source' attribute is set to 'Microsoft.KeyVault'.
     *
     * @return the keyVaultProperties value.
     */
    public EncryptionScopeKeyVaultProperties keyVaultProperties() {
        return this.keyVaultProperties;
    }

    /**
     * Set the keyVaultProperties property: The key vault properties for the encryption scope. This is a required field
     * if encryption scope 'source' attribute is set to 'Microsoft.KeyVault'.
     *
     * @param keyVaultProperties the keyVaultProperties value to set.
     * @return the EncryptionScopeProperties object itself.
     */
    public EncryptionScopeProperties withKeyVaultProperties(EncryptionScopeKeyVaultProperties keyVaultProperties) {
        this.keyVaultProperties = keyVaultProperties;
        return this;
    }

    /**
     * Get the requireInfrastructureEncryption property: A boolean indicating whether or not the service applies a
     * secondary layer of encryption with platform managed keys for data at rest.
     *
     * @return the requireInfrastructureEncryption value.
     */
    public Boolean requireInfrastructureEncryption() {
        return this.requireInfrastructureEncryption;
    }

    /**
     * Set the requireInfrastructureEncryption property: A boolean indicating whether or not the service applies a
     * secondary layer of encryption with platform managed keys for data at rest.
     *
     * @param requireInfrastructureEncryption the requireInfrastructureEncryption value to set.
     * @return the EncryptionScopeProperties object itself.
     */
    public EncryptionScopeProperties withRequireInfrastructureEncryption(Boolean requireInfrastructureEncryption) {
        this.requireInfrastructureEncryption = requireInfrastructureEncryption;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyVaultProperties() != null) {
            keyVaultProperties().validate();
        }
    }
}
