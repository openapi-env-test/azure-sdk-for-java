// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Definition of ExpressRouteLink Mac Security configuration.
 *
 * <p>ExpressRouteLink Mac Security Configuration.
 */
@Fluent
public final class ExpressRouteLinkMacSecConfig {
    /*
     * Keyvault Secret Identifier URL containing Mac security CKN key.
     */
    @JsonProperty(value = "cknSecretIdentifier")
    private String cknSecretIdentifier;

    /*
     * Keyvault Secret Identifier URL containing Mac security CAK key.
     */
    @JsonProperty(value = "cakSecretIdentifier")
    private String cakSecretIdentifier;

    /*
     * Mac security cipher.
     */
    @JsonProperty(value = "cipher")
    private ExpressRouteLinkMacSecCipher cipher;

    /*
     * Sci mode enabled/disabled.
     */
    @JsonProperty(value = "sciState")
    private ExpressRouteLinkMacSecSciState sciState;

    /** Creates an instance of ExpressRouteLinkMacSecConfig class. */
    public ExpressRouteLinkMacSecConfig() {
    }

    /**
     * Get the cknSecretIdentifier property: Keyvault Secret Identifier URL containing Mac security CKN key.
     *
     * @return the cknSecretIdentifier value.
     */
    public String cknSecretIdentifier() {
        return this.cknSecretIdentifier;
    }

    /**
     * Set the cknSecretIdentifier property: Keyvault Secret Identifier URL containing Mac security CKN key.
     *
     * @param cknSecretIdentifier the cknSecretIdentifier value to set.
     * @return the ExpressRouteLinkMacSecConfig object itself.
     */
    public ExpressRouteLinkMacSecConfig withCknSecretIdentifier(String cknSecretIdentifier) {
        this.cknSecretIdentifier = cknSecretIdentifier;
        return this;
    }

    /**
     * Get the cakSecretIdentifier property: Keyvault Secret Identifier URL containing Mac security CAK key.
     *
     * @return the cakSecretIdentifier value.
     */
    public String cakSecretIdentifier() {
        return this.cakSecretIdentifier;
    }

    /**
     * Set the cakSecretIdentifier property: Keyvault Secret Identifier URL containing Mac security CAK key.
     *
     * @param cakSecretIdentifier the cakSecretIdentifier value to set.
     * @return the ExpressRouteLinkMacSecConfig object itself.
     */
    public ExpressRouteLinkMacSecConfig withCakSecretIdentifier(String cakSecretIdentifier) {
        this.cakSecretIdentifier = cakSecretIdentifier;
        return this;
    }

    /**
     * Get the cipher property: Mac security cipher.
     *
     * @return the cipher value.
     */
    public ExpressRouteLinkMacSecCipher cipher() {
        return this.cipher;
    }

    /**
     * Set the cipher property: Mac security cipher.
     *
     * @param cipher the cipher value to set.
     * @return the ExpressRouteLinkMacSecConfig object itself.
     */
    public ExpressRouteLinkMacSecConfig withCipher(ExpressRouteLinkMacSecCipher cipher) {
        this.cipher = cipher;
        return this;
    }

    /**
     * Get the sciState property: Sci mode enabled/disabled.
     *
     * @return the sciState value.
     */
    public ExpressRouteLinkMacSecSciState sciState() {
        return this.sciState;
    }

    /**
     * Set the sciState property: Sci mode enabled/disabled.
     *
     * @param sciState the sciState value to set.
     * @return the ExpressRouteLinkMacSecConfig object itself.
     */
    public ExpressRouteLinkMacSecConfig withSciState(ExpressRouteLinkMacSecSciState sciState) {
        this.sciState = sciState;
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
