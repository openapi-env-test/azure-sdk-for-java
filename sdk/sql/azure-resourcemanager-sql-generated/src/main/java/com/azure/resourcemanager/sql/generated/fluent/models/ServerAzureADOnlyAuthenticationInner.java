// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure Active Directory only authentication. */
@Fluent
public final class ServerAzureADOnlyAuthenticationInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private AzureADOnlyAuthProperties innerProperties;

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private AzureADOnlyAuthProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the azureADOnlyAuthentication property: Azure Active Directory only Authentication enabled.
     *
     * @return the azureADOnlyAuthentication value.
     */
    public Boolean azureADOnlyAuthentication() {
        return this.innerProperties() == null ? null : this.innerProperties().azureADOnlyAuthentication();
    }

    /**
     * Set the azureADOnlyAuthentication property: Azure Active Directory only Authentication enabled.
     *
     * @param azureADOnlyAuthentication the azureADOnlyAuthentication value to set.
     * @return the ServerAzureADOnlyAuthenticationInner object itself.
     */
    public ServerAzureADOnlyAuthenticationInner withAzureADOnlyAuthentication(Boolean azureADOnlyAuthentication) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureADOnlyAuthProperties();
        }
        this.innerProperties().withAzureADOnlyAuthentication(azureADOnlyAuthentication);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
