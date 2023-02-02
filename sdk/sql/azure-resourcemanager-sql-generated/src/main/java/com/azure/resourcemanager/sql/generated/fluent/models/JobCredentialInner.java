// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A stored credential that can be used by a job to connect to target databases. */
@Fluent
public final class JobCredentialInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private JobCredentialProperties innerProperties;

    /** Creates an instance of JobCredentialInner class. */
    public JobCredentialInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private JobCredentialProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the username property: The credential user name.
     *
     * @return the username value.
     */
    public String username() {
        return this.innerProperties() == null ? null : this.innerProperties().username();
    }

    /**
     * Set the username property: The credential user name.
     *
     * @param username the username value to set.
     * @return the JobCredentialInner object itself.
     */
    public JobCredentialInner withUsername(String username) {
        if (this.innerProperties() == null) {
            this.innerProperties = new JobCredentialProperties();
        }
        this.innerProperties().withUsername(username);
        return this;
    }

    /**
     * Get the password property: The credential password.
     *
     * @return the password value.
     */
    public String password() {
        return this.innerProperties() == null ? null : this.innerProperties().password();
    }

    /**
     * Set the password property: The credential password.
     *
     * @param password the password value to set.
     * @return the JobCredentialInner object itself.
     */
    public JobCredentialInner withPassword(String password) {
        if (this.innerProperties() == null) {
            this.innerProperties = new JobCredentialProperties();
        }
        this.innerProperties().withPassword(password);
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
