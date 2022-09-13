// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Username and password for basic login authentication. */
@Fluent
public final class BasicLoginInformation {
    /*
     * Login username.
     */
    @JsonProperty(value = "username")
    private String username;

    /*
     * Login password.
     */
    @JsonProperty(value = "password")
    private String password;

    /**
     * Get the username property: Login username.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: Login username.
     *
     * @param username the username value to set.
     * @return the BasicLoginInformation object itself.
     */
    public BasicLoginInformation withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Login password.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: Login password.
     *
     * @param password the password value to set.
     * @return the BasicLoginInformation object itself.
     */
    public BasicLoginInformation withPassword(String password) {
        this.password = password;
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
