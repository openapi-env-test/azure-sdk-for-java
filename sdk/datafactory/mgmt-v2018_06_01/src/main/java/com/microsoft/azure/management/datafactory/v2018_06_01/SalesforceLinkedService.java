/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.LinkedServiceInner;

/**
 * Linked service for Salesforce.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = SalesforceLinkedService.class)
@JsonTypeName("Salesforce")
@JsonFlatten
public class SalesforceLinkedService extends LinkedServiceInner {
    /**
     * The URL of Salesforce instance. Default is
     * 'https://login.salesforce.com'. To copy data from sandbox, specify
     * 'https://test.salesforce.com'. To copy data from custom domain, specify,
     * for example, 'https://[domain].my.salesforce.com'. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.environmentUrl")
    private Object environmentUrl;

    /**
     * The username for Basic authentication of the Salesforce instance. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.username")
    private Object username;

    /**
     * The password for Basic authentication of the Salesforce instance.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /**
     * The security token is required to remotely access Salesforce instance.
     */
    @JsonProperty(value = "typeProperties.securityToken")
    private SecretBase securityToken;

    /**
     * The Salesforce API version used in ADF. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.apiVersion")
    private Object apiVersion;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the URL of Salesforce instance. Default is 'https://login.salesforce.com'. To copy data from sandbox, specify 'https://test.salesforce.com'. To copy data from custom domain, specify, for example, 'https://[domain].my.salesforce.com'. Type: string (or Expression with resultType string).
     *
     * @return the environmentUrl value
     */
    public Object environmentUrl() {
        return this.environmentUrl;
    }

    /**
     * Set the URL of Salesforce instance. Default is 'https://login.salesforce.com'. To copy data from sandbox, specify 'https://test.salesforce.com'. To copy data from custom domain, specify, for example, 'https://[domain].my.salesforce.com'. Type: string (or Expression with resultType string).
     *
     * @param environmentUrl the environmentUrl value to set
     * @return the SalesforceLinkedService object itself.
     */
    public SalesforceLinkedService withEnvironmentUrl(Object environmentUrl) {
        this.environmentUrl = environmentUrl;
        return this;
    }

    /**
     * Get the username for Basic authentication of the Salesforce instance. Type: string (or Expression with resultType string).
     *
     * @return the username value
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username for Basic authentication of the Salesforce instance. Type: string (or Expression with resultType string).
     *
     * @param username the username value to set
     * @return the SalesforceLinkedService object itself.
     */
    public SalesforceLinkedService withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password for Basic authentication of the Salesforce instance.
     *
     * @return the password value
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password for Basic authentication of the Salesforce instance.
     *
     * @param password the password value to set
     * @return the SalesforceLinkedService object itself.
     */
    public SalesforceLinkedService withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the security token is required to remotely access Salesforce instance.
     *
     * @return the securityToken value
     */
    public SecretBase securityToken() {
        return this.securityToken;
    }

    /**
     * Set the security token is required to remotely access Salesforce instance.
     *
     * @param securityToken the securityToken value to set
     * @return the SalesforceLinkedService object itself.
     */
    public SalesforceLinkedService withSecurityToken(SecretBase securityToken) {
        this.securityToken = securityToken;
        return this;
    }

    /**
     * Get the Salesforce API version used in ADF. Type: string (or Expression with resultType string).
     *
     * @return the apiVersion value
     */
    public Object apiVersion() {
        return this.apiVersion;
    }

    /**
     * Set the Salesforce API version used in ADF. Type: string (or Expression with resultType string).
     *
     * @param apiVersion the apiVersion value to set
     * @return the SalesforceLinkedService object itself.
     */
    public SalesforceLinkedService withApiVersion(Object apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * Get the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set
     * @return the SalesforceLinkedService object itself.
     */
    public SalesforceLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
