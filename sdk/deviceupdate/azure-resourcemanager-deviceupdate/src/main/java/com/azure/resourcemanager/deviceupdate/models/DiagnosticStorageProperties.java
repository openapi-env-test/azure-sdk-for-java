// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Customer-initiated diagnostic log collection storage properties. */
@Fluent
public final class DiagnosticStorageProperties {
    /*
     * Authentication Type
     */
    @JsonProperty(value = "authenticationType", required = true)
    private AuthenticationType authenticationType;

    /*
     * ConnectionString of the diagnostic storage account
     */
    @JsonProperty(value = "connectionString")
    private String connectionString;

    /*
     * ResourceId of the diagnostic storage account
     */
    @JsonProperty(value = "resourceId", required = true)
    private String resourceId;

    /** Creates an instance of DiagnosticStorageProperties class. */
    public DiagnosticStorageProperties() {
    }

    /**
     * Get the authenticationType property: Authentication Type.
     *
     * @return the authenticationType value.
     */
    public AuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: Authentication Type.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the DiagnosticStorageProperties object itself.
     */
    public DiagnosticStorageProperties withAuthenticationType(AuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the connectionString property: ConnectionString of the diagnostic storage account.
     *
     * @return the connectionString value.
     */
    public String connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: ConnectionString of the diagnostic storage account.
     *
     * @param connectionString the connectionString value to set.
     * @return the DiagnosticStorageProperties object itself.
     */
    public DiagnosticStorageProperties withConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the resourceId property: ResourceId of the diagnostic storage account.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: ResourceId of the diagnostic storage account.
     *
     * @param resourceId the resourceId value to set.
     * @return the DiagnosticStorageProperties object itself.
     */
    public DiagnosticStorageProperties withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (authenticationType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property authenticationType in model DiagnosticStorageProperties"));
        }
        if (resourceId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property resourceId in model DiagnosticStorageProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DiagnosticStorageProperties.class);
}
