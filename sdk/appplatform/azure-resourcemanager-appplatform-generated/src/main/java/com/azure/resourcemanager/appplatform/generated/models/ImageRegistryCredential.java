// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Credential of the image registry. */
@Fluent
public final class ImageRegistryCredential {
    /*
     * The username of the image registry credential
     */
    @JsonProperty(value = "username")
    private String username;

    /*
     * The password of the image registry credential
     */
    @JsonProperty(value = "password")
    private String password;

    /**
     * Get the username property: The username of the image registry credential.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: The username of the image registry credential.
     *
     * @param username the username value to set.
     * @return the ImageRegistryCredential object itself.
     */
    public ImageRegistryCredential withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password of the image registry credential.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: The password of the image registry credential.
     *
     * @param password the password value to set.
     * @return the ImageRegistryCredential object itself.
     */
    public ImageRegistryCredential withPassword(String password) {
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
