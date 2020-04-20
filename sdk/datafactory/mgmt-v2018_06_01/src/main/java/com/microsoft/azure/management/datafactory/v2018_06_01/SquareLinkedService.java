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
 * Square Service linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = SquareLinkedService.class)
@JsonTypeName("Square")
@JsonFlatten
public class SquareLinkedService extends LinkedServiceInner {
    /**
     * The URL of the Square instance. (i.e. mystore.mysquare.com).
     */
    @JsonProperty(value = "typeProperties.host", required = true)
    private Object host;

    /**
     * The client ID associated with your Square application.
     */
    @JsonProperty(value = "typeProperties.clientId")
    private Object clientId;

    /**
     * The client secret associated with your Square application.
     */
    @JsonProperty(value = "typeProperties.clientSecret")
    private SecretBase clientSecret;

    /**
     * The access token for OAuth 2.0 authentication.
     */
    @JsonProperty(value = "typeProperties.accessToken")
    private SecretBase accessToken;

    /**
     * The OAuth 2.0 refresh token associated with your Square application,
     * used to refresh the access token when it expires.
     */
    @JsonProperty(value = "typeProperties.refreshToken")
    private SecretBase refreshToken;

    /**
     * The redirect URL assigned in the Square application dashboard. (i.e.
     * http://localhost:2500) [Deprecated].
     */
    @JsonProperty(value = "typeProperties.redirectUri")
    private Object redirectUri;

    /**
     * Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     */
    @JsonProperty(value = "typeProperties.useEncryptedEndpoints")
    private Object useEncryptedEndpoints;

    /**
     * Specifies whether to require the host name in the server's certificate
     * to match the host name of the server when connecting over SSL. The
     * default value is true.
     */
    @JsonProperty(value = "typeProperties.useHostVerification")
    private Object useHostVerification;

    /**
     * Specifies whether to verify the identity of the server when connecting
     * over SSL. The default value is true.
     */
    @JsonProperty(value = "typeProperties.usePeerVerification")
    private Object usePeerVerification;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the URL of the Square instance. (i.e. mystore.mysquare.com).
     *
     * @return the host value
     */
    public Object host() {
        return this.host;
    }

    /**
     * Set the URL of the Square instance. (i.e. mystore.mysquare.com).
     *
     * @param host the host value to set
     * @return the SquareLinkedService object itself.
     */
    public SquareLinkedService withHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the client ID associated with your Square application.
     *
     * @return the clientId value
     */
    public Object clientId() {
        return this.clientId;
    }

    /**
     * Set the client ID associated with your Square application.
     *
     * @param clientId the clientId value to set
     * @return the SquareLinkedService object itself.
     */
    public SquareLinkedService withClientId(Object clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the client secret associated with your Square application.
     *
     * @return the clientSecret value
     */
    public SecretBase clientSecret() {
        return this.clientSecret;
    }

    /**
     * Set the client secret associated with your Square application.
     *
     * @param clientSecret the clientSecret value to set
     * @return the SquareLinkedService object itself.
     */
    public SquareLinkedService withClientSecret(SecretBase clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Get the access token for OAuth 2.0 authentication.
     *
     * @return the accessToken value
     */
    public SecretBase accessToken() {
        return this.accessToken;
    }

    /**
     * Set the access token for OAuth 2.0 authentication.
     *
     * @param accessToken the accessToken value to set
     * @return the SquareLinkedService object itself.
     */
    public SquareLinkedService withAccessToken(SecretBase accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Get the OAuth 2.0 refresh token associated with your Square application, used to refresh the access token when it expires.
     *
     * @return the refreshToken value
     */
    public SecretBase refreshToken() {
        return this.refreshToken;
    }

    /**
     * Set the OAuth 2.0 refresh token associated with your Square application, used to refresh the access token when it expires.
     *
     * @param refreshToken the refreshToken value to set
     * @return the SquareLinkedService object itself.
     */
    public SquareLinkedService withRefreshToken(SecretBase refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * Get the redirect URL assigned in the Square application dashboard. (i.e. http://localhost:2500) [Deprecated].
     *
     * @return the redirectUri value
     */
    public Object redirectUri() {
        return this.redirectUri;
    }

    /**
     * Set the redirect URL assigned in the Square application dashboard. (i.e. http://localhost:2500) [Deprecated].
     *
     * @param redirectUri the redirectUri value to set
     * @return the SquareLinkedService object itself.
     */
    public SquareLinkedService withRedirectUri(Object redirectUri) {
        this.redirectUri = redirectUri;
        return this;
    }

    /**
     * Get specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     *
     * @return the useEncryptedEndpoints value
     */
    public Object useEncryptedEndpoints() {
        return this.useEncryptedEndpoints;
    }

    /**
     * Set specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     *
     * @param useEncryptedEndpoints the useEncryptedEndpoints value to set
     * @return the SquareLinkedService object itself.
     */
    public SquareLinkedService withUseEncryptedEndpoints(Object useEncryptedEndpoints) {
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        return this;
    }

    /**
     * Get specifies whether to require the host name in the server's certificate to match the host name of the server when connecting over SSL. The default value is true.
     *
     * @return the useHostVerification value
     */
    public Object useHostVerification() {
        return this.useHostVerification;
    }

    /**
     * Set specifies whether to require the host name in the server's certificate to match the host name of the server when connecting over SSL. The default value is true.
     *
     * @param useHostVerification the useHostVerification value to set
     * @return the SquareLinkedService object itself.
     */
    public SquareLinkedService withUseHostVerification(Object useHostVerification) {
        this.useHostVerification = useHostVerification;
        return this;
    }

    /**
     * Get specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     *
     * @return the usePeerVerification value
     */
    public Object usePeerVerification() {
        return this.usePeerVerification;
    }

    /**
     * Set specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     *
     * @param usePeerVerification the usePeerVerification value to set
     * @return the SquareLinkedService object itself.
     */
    public SquareLinkedService withUsePeerVerification(Object usePeerVerification) {
        this.usePeerVerification = usePeerVerification;
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
     * @return the SquareLinkedService object itself.
     */
    public SquareLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
