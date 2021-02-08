// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Import database parameters. */
@JsonFlatten
@Fluent
public class ImportExtensionRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ImportExtensionRequest.class);

    /*
     * The name of the extension.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The type of the extension.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * The type of the storage key to use.
     */
    @JsonProperty(value = "properties.storageKeyType")
    private StorageKeyType storageKeyType;

    /*
     * The storage key to use.  If storage key type is SharedAccessKey, it must
     * be preceded with a "?."
     */
    @JsonProperty(value = "properties.storageKey")
    private String storageKey;

    /*
     * The storage uri to use.
     */
    @JsonProperty(value = "properties.storageUri")
    private String storageUri;

    /*
     * The name of the SQL administrator.
     */
    @JsonProperty(value = "properties.administratorLogin")
    private String administratorLogin;

    /*
     * The password of the SQL administrator.
     */
    @JsonProperty(value = "properties.administratorLoginPassword")
    private String administratorLoginPassword;

    /*
     * The authentication type.
     */
    @JsonProperty(value = "properties.authenticationType")
    private AuthenticationType authenticationType;

    /*
     * The type of import operation being performed. This is always Import.
     */
    @JsonProperty(value = "properties.operationMode")
    private ImportOperationMode operationMode;

    /**
     * Get the name property: The name of the extension.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the extension.
     *
     * @param name the name value to set.
     * @return the ImportExtensionRequest object itself.
     */
    public ImportExtensionRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The type of the extension.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type of the extension.
     *
     * @param type the type value to set.
     * @return the ImportExtensionRequest object itself.
     */
    public ImportExtensionRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the storageKeyType property: The type of the storage key to use.
     *
     * @return the storageKeyType value.
     */
    public StorageKeyType storageKeyType() {
        return this.storageKeyType;
    }

    /**
     * Set the storageKeyType property: The type of the storage key to use.
     *
     * @param storageKeyType the storageKeyType value to set.
     * @return the ImportExtensionRequest object itself.
     */
    public ImportExtensionRequest withStorageKeyType(StorageKeyType storageKeyType) {
        this.storageKeyType = storageKeyType;
        return this;
    }

    /**
     * Get the storageKey property: The storage key to use. If storage key type is SharedAccessKey, it must be preceded
     * with a "?.".
     *
     * @return the storageKey value.
     */
    public String storageKey() {
        return this.storageKey;
    }

    /**
     * Set the storageKey property: The storage key to use. If storage key type is SharedAccessKey, it must be preceded
     * with a "?.".
     *
     * @param storageKey the storageKey value to set.
     * @return the ImportExtensionRequest object itself.
     */
    public ImportExtensionRequest withStorageKey(String storageKey) {
        this.storageKey = storageKey;
        return this;
    }

    /**
     * Get the storageUri property: The storage uri to use.
     *
     * @return the storageUri value.
     */
    public String storageUri() {
        return this.storageUri;
    }

    /**
     * Set the storageUri property: The storage uri to use.
     *
     * @param storageUri the storageUri value to set.
     * @return the ImportExtensionRequest object itself.
     */
    public ImportExtensionRequest withStorageUri(String storageUri) {
        this.storageUri = storageUri;
        return this;
    }

    /**
     * Get the administratorLogin property: The name of the SQL administrator.
     *
     * @return the administratorLogin value.
     */
    public String administratorLogin() {
        return this.administratorLogin;
    }

    /**
     * Set the administratorLogin property: The name of the SQL administrator.
     *
     * @param administratorLogin the administratorLogin value to set.
     * @return the ImportExtensionRequest object itself.
     */
    public ImportExtensionRequest withAdministratorLogin(String administratorLogin) {
        this.administratorLogin = administratorLogin;
        return this;
    }

    /**
     * Get the administratorLoginPassword property: The password of the SQL administrator.
     *
     * @return the administratorLoginPassword value.
     */
    public String administratorLoginPassword() {
        return this.administratorLoginPassword;
    }

    /**
     * Set the administratorLoginPassword property: The password of the SQL administrator.
     *
     * @param administratorLoginPassword the administratorLoginPassword value to set.
     * @return the ImportExtensionRequest object itself.
     */
    public ImportExtensionRequest withAdministratorLoginPassword(String administratorLoginPassword) {
        this.administratorLoginPassword = administratorLoginPassword;
        return this;
    }

    /**
     * Get the authenticationType property: The authentication type.
     *
     * @return the authenticationType value.
     */
    public AuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: The authentication type.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the ImportExtensionRequest object itself.
     */
    public ImportExtensionRequest withAuthenticationType(AuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the operationMode property: The type of import operation being performed. This is always Import.
     *
     * @return the operationMode value.
     */
    public ImportOperationMode operationMode() {
        return this.operationMode;
    }

    /**
     * Set the operationMode property: The type of import operation being performed. This is always Import.
     *
     * @param operationMode the operationMode value to set.
     * @return the ImportExtensionRequest object itself.
     */
    public ImportExtensionRequest withOperationMode(ImportOperationMode operationMode) {
        this.operationMode = operationMode;
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
