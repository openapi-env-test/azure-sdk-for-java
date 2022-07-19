// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The JSON object that contains the properties to validate a domain. */
@Immutable
public final class DomainValidationProperties {
    /*
     * Challenge used for DNS TXT record or file based validation
     */
    @JsonProperty(value = "validationToken", access = JsonProperty.Access.WRITE_ONLY)
    private String validationToken;

    /*
     * The date time that the token expires
     */
    @JsonProperty(value = "expirationDate", access = JsonProperty.Access.WRITE_ONLY)
    private String expirationDate;

    /**
     * Get the validationToken property: Challenge used for DNS TXT record or file based validation.
     *
     * @return the validationToken value.
     */
    public String validationToken() {
        return this.validationToken;
    }

    /**
     * Get the expirationDate property: The date time that the token expires.
     *
     * @return the expirationDate value.
     */
    public String expirationDate() {
        return this.expirationDate;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
