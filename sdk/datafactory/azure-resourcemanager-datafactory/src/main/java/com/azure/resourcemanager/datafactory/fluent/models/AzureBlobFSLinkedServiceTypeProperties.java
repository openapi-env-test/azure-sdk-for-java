// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.CredentialReference;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure Data Lake Storage Gen2 linked service properties. */
@Fluent
public final class AzureBlobFSLinkedServiceTypeProperties {
    /*
     * Endpoint for the Azure Data Lake Storage Gen2 service. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "url", required = true)
    private Object url;

    /*
     * Account key for the Azure Data Lake Storage Gen2 service. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "accountKey")
    private Object accountKey;

    /*
     * The ID of the application used to authenticate against the Azure Data Lake Storage Gen2 account. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "servicePrincipalId")
    private Object servicePrincipalId;

    /*
     * The Key of the application used to authenticate against the Azure Data Lake Storage Gen2 account.
     */
    @JsonProperty(value = "servicePrincipalKey")
    private SecretBase servicePrincipalKey;

    /*
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "tenant")
    private Object tenant;

    /*
     * Indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina,
     * AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "azureCloudType")
    private Object azureCloudType;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "encryptedCredential")
    private Object encryptedCredential;

    /*
     * The credential reference containing authentication information.
     */
    @JsonProperty(value = "credential")
    private CredentialReference credential;

    /*
     * The service principal credential type to use in Server-To-Server authentication. 'ServicePrincipalKey' for
     * key/secret, 'ServicePrincipalCert' for certificate. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "servicePrincipalCredentialType")
    private Object servicePrincipalCredentialType;

    /*
     * The credential of the service principal object in Azure Active Directory. If servicePrincipalCredentialType is
     * 'ServicePrincipalKey', servicePrincipalCredential can be SecureString or AzureKeyVaultSecretReference. If
     * servicePrincipalCredentialType is 'ServicePrincipalCert', servicePrincipalCredential can only be
     * AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "servicePrincipalCredential")
    private SecretBase servicePrincipalCredential;

    /** Creates an instance of AzureBlobFSLinkedServiceTypeProperties class. */
    public AzureBlobFSLinkedServiceTypeProperties() {
    }

    /**
     * Get the url property: Endpoint for the Azure Data Lake Storage Gen2 service. Type: string (or Expression with
     * resultType string).
     *
     * @return the url value.
     */
    public Object url() {
        return this.url;
    }

    /**
     * Set the url property: Endpoint for the Azure Data Lake Storage Gen2 service. Type: string (or Expression with
     * resultType string).
     *
     * @param url the url value to set.
     * @return the AzureBlobFSLinkedServiceTypeProperties object itself.
     */
    public AzureBlobFSLinkedServiceTypeProperties withUrl(Object url) {
        this.url = url;
        return this;
    }

    /**
     * Get the accountKey property: Account key for the Azure Data Lake Storage Gen2 service. Type: string (or
     * Expression with resultType string).
     *
     * @return the accountKey value.
     */
    public Object accountKey() {
        return this.accountKey;
    }

    /**
     * Set the accountKey property: Account key for the Azure Data Lake Storage Gen2 service. Type: string (or
     * Expression with resultType string).
     *
     * @param accountKey the accountKey value to set.
     * @return the AzureBlobFSLinkedServiceTypeProperties object itself.
     */
    public AzureBlobFSLinkedServiceTypeProperties withAccountKey(Object accountKey) {
        this.accountKey = accountKey;
        return this;
    }

    /**
     * Get the servicePrincipalId property: The ID of the application used to authenticate against the Azure Data Lake
     * Storage Gen2 account. Type: string (or Expression with resultType string).
     *
     * @return the servicePrincipalId value.
     */
    public Object servicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId property: The ID of the application used to authenticate against the Azure Data Lake
     * Storage Gen2 account. Type: string (or Expression with resultType string).
     *
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the AzureBlobFSLinkedServiceTypeProperties object itself.
     */
    public AzureBlobFSLinkedServiceTypeProperties withServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the servicePrincipalKey property: The Key of the application used to authenticate against the Azure Data Lake
     * Storage Gen2 account.
     *
     * @return the servicePrincipalKey value.
     */
    public SecretBase servicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the servicePrincipalKey property: The Key of the application used to authenticate against the Azure Data Lake
     * Storage Gen2 account.
     *
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the AzureBlobFSLinkedServiceTypeProperties object itself.
     */
    public AzureBlobFSLinkedServiceTypeProperties withServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
        return this;
    }

    /**
     * Get the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     *
     * @return the tenant value.
     */
    public Object tenant() {
        return this.tenant;
    }

    /**
     * Set the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     *
     * @param tenant the tenant value to set.
     * @return the AzureBlobFSLinkedServiceTypeProperties object itself.
     */
    public AzureBlobFSLinkedServiceTypeProperties withTenant(Object tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * Get the azureCloudType property: Indicates the azure cloud type of the service principle auth. Allowed values are
     * AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type.
     * Type: string (or Expression with resultType string).
     *
     * @return the azureCloudType value.
     */
    public Object azureCloudType() {
        return this.azureCloudType;
    }

    /**
     * Set the azureCloudType property: Indicates the azure cloud type of the service principle auth. Allowed values are
     * AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type.
     * Type: string (or Expression with resultType string).
     *
     * @param azureCloudType the azureCloudType value to set.
     * @return the AzureBlobFSLinkedServiceTypeProperties object itself.
     */
    public AzureBlobFSLinkedServiceTypeProperties withAzureCloudType(Object azureCloudType) {
        this.azureCloudType = azureCloudType;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AzureBlobFSLinkedServiceTypeProperties object itself.
     */
    public AzureBlobFSLinkedServiceTypeProperties withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Get the credential property: The credential reference containing authentication information.
     *
     * @return the credential value.
     */
    public CredentialReference credential() {
        return this.credential;
    }

    /**
     * Set the credential property: The credential reference containing authentication information.
     *
     * @param credential the credential value to set.
     * @return the AzureBlobFSLinkedServiceTypeProperties object itself.
     */
    public AzureBlobFSLinkedServiceTypeProperties withCredential(CredentialReference credential) {
        this.credential = credential;
        return this;
    }

    /**
     * Get the servicePrincipalCredentialType property: The service principal credential type to use in Server-To-Server
     * authentication. 'ServicePrincipalKey' for key/secret, 'ServicePrincipalCert' for certificate. Type: string (or
     * Expression with resultType string).
     *
     * @return the servicePrincipalCredentialType value.
     */
    public Object servicePrincipalCredentialType() {
        return this.servicePrincipalCredentialType;
    }

    /**
     * Set the servicePrincipalCredentialType property: The service principal credential type to use in Server-To-Server
     * authentication. 'ServicePrincipalKey' for key/secret, 'ServicePrincipalCert' for certificate. Type: string (or
     * Expression with resultType string).
     *
     * @param servicePrincipalCredentialType the servicePrincipalCredentialType value to set.
     * @return the AzureBlobFSLinkedServiceTypeProperties object itself.
     */
    public AzureBlobFSLinkedServiceTypeProperties withServicePrincipalCredentialType(
        Object servicePrincipalCredentialType) {
        this.servicePrincipalCredentialType = servicePrincipalCredentialType;
        return this;
    }

    /**
     * Get the servicePrincipalCredential property: The credential of the service principal object in Azure Active
     * Directory. If servicePrincipalCredentialType is 'ServicePrincipalKey', servicePrincipalCredential can be
     * SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is 'ServicePrincipalCert',
     * servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     *
     * @return the servicePrincipalCredential value.
     */
    public SecretBase servicePrincipalCredential() {
        return this.servicePrincipalCredential;
    }

    /**
     * Set the servicePrincipalCredential property: The credential of the service principal object in Azure Active
     * Directory. If servicePrincipalCredentialType is 'ServicePrincipalKey', servicePrincipalCredential can be
     * SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is 'ServicePrincipalCert',
     * servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     *
     * @param servicePrincipalCredential the servicePrincipalCredential value to set.
     * @return the AzureBlobFSLinkedServiceTypeProperties object itself.
     */
    public AzureBlobFSLinkedServiceTypeProperties withServicePrincipalCredential(
        SecretBase servicePrincipalCredential) {
        this.servicePrincipalCredential = servicePrincipalCredential;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (url() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property url in model AzureBlobFSLinkedServiceTypeProperties"));
        }
        if (servicePrincipalKey() != null) {
            servicePrincipalKey().validate();
        }
        if (credential() != null) {
            credential().validate();
        }
        if (servicePrincipalCredential() != null) {
            servicePrincipalCredential().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureBlobFSLinkedServiceTypeProperties.class);
}
