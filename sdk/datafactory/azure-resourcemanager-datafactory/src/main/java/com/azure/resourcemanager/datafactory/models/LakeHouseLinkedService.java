// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.LakeHouseLinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Microsoft Fabric LakeHouse linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("LakeHouse")
@Fluent
public final class LakeHouseLinkedService extends LinkedService {
    /*
     * Microsoft Fabric LakeHouse linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private LakeHouseLinkedServiceTypeProperties innerTypeProperties = new LakeHouseLinkedServiceTypeProperties();

    /** Creates an instance of LakeHouseLinkedService class. */
    public LakeHouseLinkedService() {
    }

    /**
     * Get the innerTypeProperties property: Microsoft Fabric LakeHouse linked service properties.
     *
     * @return the innerTypeProperties value.
     */
    private LakeHouseLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public LakeHouseLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LakeHouseLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LakeHouseLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LakeHouseLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the workspaceId property: The ID of Microsoft Fabric workspace. Type: string (or Expression with resultType
     * string).
     *
     * @return the workspaceId value.
     */
    public Object workspaceId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().workspaceId();
    }

    /**
     * Set the workspaceId property: The ID of Microsoft Fabric workspace. Type: string (or Expression with resultType
     * string).
     *
     * @param workspaceId the workspaceId value to set.
     * @return the LakeHouseLinkedService object itself.
     */
    public LakeHouseLinkedService withWorkspaceId(Object workspaceId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new LakeHouseLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withWorkspaceId(workspaceId);
        return this;
    }

    /**
     * Get the artifactId property: The ID of Microsoft Fabric LakeHouse artifact. Type: string (or Expression with
     * resultType string).
     *
     * @return the artifactId value.
     */
    public Object artifactId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().artifactId();
    }

    /**
     * Set the artifactId property: The ID of Microsoft Fabric LakeHouse artifact. Type: string (or Expression with
     * resultType string).
     *
     * @param artifactId the artifactId value to set.
     * @return the LakeHouseLinkedService object itself.
     */
    public LakeHouseLinkedService withArtifactId(Object artifactId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new LakeHouseLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withArtifactId(artifactId);
        return this;
    }

    /**
     * Get the servicePrincipalId property: The ID of the application used to authenticate against Microsoft Fabric
     * LakeHouse. Type: string (or Expression with resultType string).
     *
     * @return the servicePrincipalId value.
     */
    public Object servicePrincipalId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().servicePrincipalId();
    }

    /**
     * Set the servicePrincipalId property: The ID of the application used to authenticate against Microsoft Fabric
     * LakeHouse. Type: string (or Expression with resultType string).
     *
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the LakeHouseLinkedService object itself.
     */
    public LakeHouseLinkedService withServicePrincipalId(Object servicePrincipalId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new LakeHouseLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServicePrincipalId(servicePrincipalId);
        return this;
    }

    /**
     * Get the servicePrincipalKey property: The Key of the application used to authenticate against Microsoft Fabric
     * LakeHouse.
     *
     * @return the servicePrincipalKey value.
     */
    public SecretBase servicePrincipalKey() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().servicePrincipalKey();
    }

    /**
     * Set the servicePrincipalKey property: The Key of the application used to authenticate against Microsoft Fabric
     * LakeHouse.
     *
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the LakeHouseLinkedService object itself.
     */
    public LakeHouseLinkedService withServicePrincipalKey(SecretBase servicePrincipalKey) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new LakeHouseLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServicePrincipalKey(servicePrincipalKey);
        return this;
    }

    /**
     * Get the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     *
     * @return the tenant value.
     */
    public Object tenant() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().tenant();
    }

    /**
     * Set the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     *
     * @param tenant the tenant value to set.
     * @return the LakeHouseLinkedService object itself.
     */
    public LakeHouseLinkedService withTenant(Object tenant) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new LakeHouseLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withTenant(tenant);
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     *
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encryptedCredential();
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the LakeHouseLinkedService object itself.
     */
    public LakeHouseLinkedService withEncryptedCredential(String encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new LakeHouseLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
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
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().servicePrincipalCredentialType();
    }

    /**
     * Set the servicePrincipalCredentialType property: The service principal credential type to use in Server-To-Server
     * authentication. 'ServicePrincipalKey' for key/secret, 'ServicePrincipalCert' for certificate. Type: string (or
     * Expression with resultType string).
     *
     * @param servicePrincipalCredentialType the servicePrincipalCredentialType value to set.
     * @return the LakeHouseLinkedService object itself.
     */
    public LakeHouseLinkedService withServicePrincipalCredentialType(Object servicePrincipalCredentialType) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new LakeHouseLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServicePrincipalCredentialType(servicePrincipalCredentialType);
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
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().servicePrincipalCredential();
    }

    /**
     * Set the servicePrincipalCredential property: The credential of the service principal object in Azure Active
     * Directory. If servicePrincipalCredentialType is 'ServicePrincipalKey', servicePrincipalCredential can be
     * SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is 'ServicePrincipalCert',
     * servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     *
     * @param servicePrincipalCredential the servicePrincipalCredential value to set.
     * @return the LakeHouseLinkedService object itself.
     */
    public LakeHouseLinkedService withServicePrincipalCredential(SecretBase servicePrincipalCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new LakeHouseLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServicePrincipalCredential(servicePrincipalCredential);
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
        if (innerTypeProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerTypeProperties in model LakeHouseLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LakeHouseLinkedService.class);
}
