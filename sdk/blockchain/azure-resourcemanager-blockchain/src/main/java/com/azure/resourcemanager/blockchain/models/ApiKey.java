// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.blockchain.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** API key payload which is exposed in the request/response of the resource provider. */
@Fluent
public final class ApiKey {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApiKey.class);

    /*
     * Gets or sets the API key name.
     */
    @JsonProperty(value = "keyName")
    private String keyName;

    /*
     * Gets or sets the API key value.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the keyName property: Gets or sets the API key name.
     *
     * @return the keyName value.
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set the keyName property: Gets or sets the API key name.
     *
     * @param keyName the keyName value to set.
     * @return the ApiKey object itself.
     */
    public ApiKey withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Get the value property: Gets or sets the API key value.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Gets or sets the API key value.
     *
     * @param value the value value to set.
     * @return the ApiKey object itself.
     */
    public ApiKey withValue(String value) {
        this.value = value;
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
