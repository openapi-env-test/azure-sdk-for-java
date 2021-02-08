// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** Response for Import/Export Get operation. */
@JsonFlatten
@Immutable
public class ImportExportResponseInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ImportExportResponseInner.class);

    /*
     * The request type of the operation.
     */
    @JsonProperty(value = "properties.requestType", access = JsonProperty.Access.WRITE_ONLY)
    private String requestType;

    /*
     * The request type of the operation.
     */
    @JsonProperty(value = "properties.requestId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID requestId;

    /*
     * The name of the server.
     */
    @JsonProperty(value = "properties.serverName", access = JsonProperty.Access.WRITE_ONLY)
    private String serverName;

    /*
     * The name of the database.
     */
    @JsonProperty(value = "properties.databaseName", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseName;

    /*
     * The status message returned from the server.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /*
     * The operation status last modified time.
     */
    @JsonProperty(value = "properties.lastModifiedTime", access = JsonProperty.Access.WRITE_ONLY)
    private String lastModifiedTime;

    /*
     * The operation queued time.
     */
    @JsonProperty(value = "properties.queuedTime", access = JsonProperty.Access.WRITE_ONLY)
    private String queuedTime;

    /*
     * The blob uri.
     */
    @JsonProperty(value = "properties.blobUri", access = JsonProperty.Access.WRITE_ONLY)
    private String blobUri;

    /*
     * The error message returned from the server.
     */
    @JsonProperty(value = "properties.errorMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String errorMessage;

    /**
     * Get the requestType property: The request type of the operation.
     *
     * @return the requestType value.
     */
    public String requestType() {
        return this.requestType;
    }

    /**
     * Get the requestId property: The request type of the operation.
     *
     * @return the requestId value.
     */
    public UUID requestId() {
        return this.requestId;
    }

    /**
     * Get the serverName property: The name of the server.
     *
     * @return the serverName value.
     */
    public String serverName() {
        return this.serverName;
    }

    /**
     * Get the databaseName property: The name of the database.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Get the status property: The status message returned from the server.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the lastModifiedTime property: The operation status last modified time.
     *
     * @return the lastModifiedTime value.
     */
    public String lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Get the queuedTime property: The operation queued time.
     *
     * @return the queuedTime value.
     */
    public String queuedTime() {
        return this.queuedTime;
    }

    /**
     * Get the blobUri property: The blob uri.
     *
     * @return the blobUri value.
     */
    public String blobUri() {
        return this.blobUri;
    }

    /**
     * Get the errorMessage property: The error message returned from the server.
     *
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
