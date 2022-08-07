// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Contains the information necessary to perform export database operation. */
@Fluent
public final class ExportDatabaseDefinition {
    /*
     * Storage key type.
     */
    @JsonProperty(value = "storageKeyType", required = true)
    private StorageKeyType storageKeyType;

    /*
     * Storage key.
     */
    @JsonProperty(value = "storageKey", required = true)
    private String storageKey;

    /*
     * Storage Uri.
     */
    @JsonProperty(value = "storageUri", required = true)
    private String storageUri;

    /*
     * Administrator login name.
     */
    @JsonProperty(value = "administratorLogin", required = true)
    private String administratorLogin;

    /*
     * Administrator login password.
     */
    @JsonProperty(value = "administratorLoginPassword", required = true)
    private String administratorLoginPassword;

    /*
     * Authentication type.
     */
    @JsonProperty(value = "authenticationType")
    private String authenticationType;

    /*
     * Optional resource information to enable network isolation for request.
     */
    @JsonProperty(value = "networkIsolation")
    private NetworkIsolationSettings networkIsolation;

    /**
     * Get the storageKeyType property: Storage key type.
     *
     * @return the storageKeyType value.
     */
    public StorageKeyType storageKeyType() {
        return this.storageKeyType;
    }

    /**
     * Set the storageKeyType property: Storage key type.
     *
     * @param storageKeyType the storageKeyType value to set.
     * @return the ExportDatabaseDefinition object itself.
     */
    public ExportDatabaseDefinition withStorageKeyType(StorageKeyType storageKeyType) {
        this.storageKeyType = storageKeyType;
        return this;
    }

    /**
     * Get the storageKey property: Storage key.
     *
     * @return the storageKey value.
     */
    public String storageKey() {
        return this.storageKey;
    }

    /**
     * Set the storageKey property: Storage key.
     *
     * @param storageKey the storageKey value to set.
     * @return the ExportDatabaseDefinition object itself.
     */
    public ExportDatabaseDefinition withStorageKey(String storageKey) {
        this.storageKey = storageKey;
        return this;
    }

    /**
     * Get the storageUri property: Storage Uri.
     *
     * @return the storageUri value.
     */
    public String storageUri() {
        return this.storageUri;
    }

    /**
     * Set the storageUri property: Storage Uri.
     *
     * @param storageUri the storageUri value to set.
     * @return the ExportDatabaseDefinition object itself.
     */
    public ExportDatabaseDefinition withStorageUri(String storageUri) {
        this.storageUri = storageUri;
        return this;
    }

    /**
     * Get the administratorLogin property: Administrator login name.
     *
     * @return the administratorLogin value.
     */
    public String administratorLogin() {
        return this.administratorLogin;
    }

    /**
     * Set the administratorLogin property: Administrator login name.
     *
     * @param administratorLogin the administratorLogin value to set.
     * @return the ExportDatabaseDefinition object itself.
     */
    public ExportDatabaseDefinition withAdministratorLogin(String administratorLogin) {
        this.administratorLogin = administratorLogin;
        return this;
    }

    /**
     * Get the administratorLoginPassword property: Administrator login password.
     *
     * @return the administratorLoginPassword value.
     */
    public String administratorLoginPassword() {
        return this.administratorLoginPassword;
    }

    /**
     * Set the administratorLoginPassword property: Administrator login password.
     *
     * @param administratorLoginPassword the administratorLoginPassword value to set.
     * @return the ExportDatabaseDefinition object itself.
     */
    public ExportDatabaseDefinition withAdministratorLoginPassword(String administratorLoginPassword) {
        this.administratorLoginPassword = administratorLoginPassword;
        return this;
    }

    /**
     * Get the authenticationType property: Authentication type.
     *
     * @return the authenticationType value.
     */
    public String authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: Authentication type.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the ExportDatabaseDefinition object itself.
     */
    public ExportDatabaseDefinition withAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the networkIsolation property: Optional resource information to enable network isolation for request.
     *
     * @return the networkIsolation value.
     */
    public NetworkIsolationSettings networkIsolation() {
        return this.networkIsolation;
    }

    /**
     * Set the networkIsolation property: Optional resource information to enable network isolation for request.
     *
     * @param networkIsolation the networkIsolation value to set.
     * @return the ExportDatabaseDefinition object itself.
     */
    public ExportDatabaseDefinition withNetworkIsolation(NetworkIsolationSettings networkIsolation) {
        this.networkIsolation = networkIsolation;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storageKeyType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property storageKeyType in model ExportDatabaseDefinition"));
        }
        if (storageKey() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property storageKey in model ExportDatabaseDefinition"));
        }
        if (storageUri() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property storageUri in model ExportDatabaseDefinition"));
        }
        if (administratorLogin() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property administratorLogin in model ExportDatabaseDefinition"));
        }
        if (administratorLoginPassword() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property administratorLoginPassword in model ExportDatabaseDefinition"));
        }
        if (networkIsolation() != null) {
            networkIsolation().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ExportDatabaseDefinition.class);
}
