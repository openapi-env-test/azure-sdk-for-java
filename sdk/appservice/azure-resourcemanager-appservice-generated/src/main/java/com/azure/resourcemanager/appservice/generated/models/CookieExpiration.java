// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The configuration settings of the session cookie's expiration. */
@Fluent
public final class CookieExpiration {
    /*
     * The convention used when determining the session cookie's expiration.
     */
    @JsonProperty(value = "convention")
    private CookieExpirationConvention convention;

    /*
     * The time after the request is made when the session cookie should
     * expire.
     */
    @JsonProperty(value = "timeToExpiration")
    private String timeToExpiration;

    /**
     * Get the convention property: The convention used when determining the session cookie's expiration.
     *
     * @return the convention value.
     */
    public CookieExpirationConvention convention() {
        return this.convention;
    }

    /**
     * Set the convention property: The convention used when determining the session cookie's expiration.
     *
     * @param convention the convention value to set.
     * @return the CookieExpiration object itself.
     */
    public CookieExpiration withConvention(CookieExpirationConvention convention) {
        this.convention = convention;
        return this;
    }

    /**
     * Get the timeToExpiration property: The time after the request is made when the session cookie should expire.
     *
     * @return the timeToExpiration value.
     */
    public String timeToExpiration() {
        return this.timeToExpiration;
    }

    /**
     * Set the timeToExpiration property: The time after the request is made when the session cookie should expire.
     *
     * @param timeToExpiration the timeToExpiration value to set.
     * @return the CookieExpiration object itself.
     */
    public CookieExpiration withTimeToExpiration(String timeToExpiration) {
        this.timeToExpiration = timeToExpiration;
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
