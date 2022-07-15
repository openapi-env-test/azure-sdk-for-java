// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Url signing key parameters. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("UrlSigningKey")
@Fluent
public final class UrlSigningKeyParameters extends SecretParameters {
    /*
     * Defines the customer defined key Id. This id will exist in the incoming
     * request to indicate the key used to form the hash.
     */
    @JsonProperty(value = "keyId", required = true)
    private String keyId;

    /*
     * Resource reference to the Azure Key Vault secret. Expected to be in
     * format of
     * /subscriptions/{​​​​​​​​​subscriptionId}​​​​​​​​​/resourceGroups/{​​​​​​​​​resourceGroupName}​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​/providers/Microsoft.KeyVault/vaults/{vaultName}​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​/secrets/{secretName}​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​
     */
    @JsonProperty(value = "secretSource", required = true)
    private ResourceReference secretSource;

    /*
     * Version of the secret to be used
     */
    @JsonProperty(value = "secretVersion")
    private String secretVersion;

    /**
     * Get the keyId property: Defines the customer defined key Id. This id will exist in the incoming request to
     * indicate the key used to form the hash.
     *
     * @return the keyId value.
     */
    public String keyId() {
        return this.keyId;
    }

    /**
     * Set the keyId property: Defines the customer defined key Id. This id will exist in the incoming request to
     * indicate the key used to form the hash.
     *
     * @param keyId the keyId value to set.
     * @return the UrlSigningKeyParameters object itself.
     */
    public UrlSigningKeyParameters withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * Get the secretSource property: Resource reference to the Azure Key Vault secret. Expected to be in format of
     * /subscriptions/{​​​​​​​​​subscriptionId}​​​​​​​​​/resourceGroups/{​​​​​​​​​resourceGroupName}​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​/providers/Microsoft.KeyVault/vaults/{vaultName}​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​/secrets/{secretName}​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​.
     *
     * @return the secretSource value.
     */
    public ResourceReference secretSource() {
        return this.secretSource;
    }

    /**
     * Set the secretSource property: Resource reference to the Azure Key Vault secret. Expected to be in format of
     * /subscriptions/{​​​​​​​​​subscriptionId}​​​​​​​​​/resourceGroups/{​​​​​​​​​resourceGroupName}​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​/providers/Microsoft.KeyVault/vaults/{vaultName}​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​/secrets/{secretName}​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​.
     *
     * @param secretSource the secretSource value to set.
     * @return the UrlSigningKeyParameters object itself.
     */
    public UrlSigningKeyParameters withSecretSource(ResourceReference secretSource) {
        this.secretSource = secretSource;
        return this;
    }

    /**
     * Get the secretVersion property: Version of the secret to be used.
     *
     * @return the secretVersion value.
     */
    public String secretVersion() {
        return this.secretVersion;
    }

    /**
     * Set the secretVersion property: Version of the secret to be used.
     *
     * @param secretVersion the secretVersion value to set.
     * @return the UrlSigningKeyParameters object itself.
     */
    public UrlSigningKeyParameters withSecretVersion(String secretVersion) {
        this.secretVersion = secretVersion;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (keyId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property keyId in model UrlSigningKeyParameters"));
        }
        if (secretSource() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property secretSource in model UrlSigningKeyParameters"));
        } else {
            secretSource().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(UrlSigningKeyParameters.class);
}
