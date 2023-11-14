// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The provider registration definition. */
@Fluent
public final class ProviderRegistrationRequest {
    /*
     * The provider consent.
     */
    @JsonProperty(value = "thirdPartyProviderConsent")
    private ProviderConsentDefinition thirdPartyProviderConsent;

    /** Creates an instance of ProviderRegistrationRequest class. */
    public ProviderRegistrationRequest() {
    }

    /**
     * Get the thirdPartyProviderConsent property: The provider consent.
     *
     * @return the thirdPartyProviderConsent value.
     */
    public ProviderConsentDefinition thirdPartyProviderConsent() {
        return this.thirdPartyProviderConsent;
    }

    /**
     * Set the thirdPartyProviderConsent property: The provider consent.
     *
     * @param thirdPartyProviderConsent the thirdPartyProviderConsent value to set.
     * @return the ProviderRegistrationRequest object itself.
     */
    public ProviderRegistrationRequest withThirdPartyProviderConsent(
        ProviderConsentDefinition thirdPartyProviderConsent) {
        this.thirdPartyProviderConsent = thirdPartyProviderConsent;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (thirdPartyProviderConsent() != null) {
            thirdPartyProviderConsent().validate();
        }
    }
}
