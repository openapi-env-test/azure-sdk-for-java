// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Subscriber detail. */
@Fluent
public class UserDetail {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UserDetail.class);

    /*
     * First name
     */
    @JsonProperty(value = "firstName")
    private String firstName;

    /*
     * Last name
     */
    @JsonProperty(value = "lastName")
    private String lastName;

    /*
     * Email address
     */
    @JsonProperty(value = "emailAddress")
    private String emailAddress;

    /**
     * Get the firstName property: First name.
     *
     * @return the firstName value.
     */
    public String firstName() {
        return this.firstName;
    }

    /**
     * Set the firstName property: First name.
     *
     * @param firstName the firstName value to set.
     * @return the UserDetail object itself.
     */
    public UserDetail withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Get the lastName property: Last name.
     *
     * @return the lastName value.
     */
    public String lastName() {
        return this.lastName;
    }

    /**
     * Set the lastName property: Last name.
     *
     * @param lastName the lastName value to set.
     * @return the UserDetail object itself.
     */
    public UserDetail withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Get the emailAddress property: Email address.
     *
     * @return the emailAddress value.
     */
    public String emailAddress() {
        return this.emailAddress;
    }

    /**
     * Set the emailAddress property: Email address.
     *
     * @param emailAddress the emailAddress value to set.
     * @return the UserDetail object itself.
     */
    public UserDetail withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
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
