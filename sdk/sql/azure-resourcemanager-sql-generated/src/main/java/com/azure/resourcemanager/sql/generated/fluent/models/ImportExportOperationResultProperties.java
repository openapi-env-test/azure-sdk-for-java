// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.sql.generated.models.PrivateEndpointConnectionRequestStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;

/** Contains the operation result properties for import/export operation. */
@Immutable
public final class ImportExportOperationResultProperties {
    /*
     * Request Id.
     */
    @JsonProperty(value = "requestId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID requestId;

    /*
     * Request type.
     */
    @JsonProperty(value = "requestType", access = JsonProperty.Access.WRITE_ONLY)
    private String requestType;

    /*
     * Queued time.
     */
    @JsonProperty(value = "queuedTime", access = JsonProperty.Access.WRITE_ONLY)
    private String queuedTime;

    /*
     * Last modified time.
     */
    @JsonProperty(value = "lastModifiedTime", access = JsonProperty.Access.WRITE_ONLY)
    private String lastModifiedTime;

    /*
     * Blob Uri.
     */
    @JsonProperty(value = "blobUri", access = JsonProperty.Access.WRITE_ONLY)
    private String blobUri;

    /*
     * Server name.
     */
    @JsonProperty(value = "serverName", access = JsonProperty.Access.WRITE_ONLY)
    private String serverName;

    /*
     * Database name.
     */
    @JsonProperty(value = "databaseName", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseName;

    /*
     * Operation status.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /*
     * Error message.
     */
    @JsonProperty(value = "errorMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String errorMessage;

    /*
     * Gets the status of private endpoints associated with this request.
     */
    @JsonProperty(value = "privateEndpointConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<PrivateEndpointConnectionRequestStatus> privateEndpointConnections;

    /** Creates an instance of ImportExportOperationResultProperties class. */
    public ImportExportOperationResultProperties() {
    }

    /**
     * Get the requestId property: Request Id.
     *
     * @return the requestId value.
     */
    public UUID requestId() {
        return this.requestId;
    }

    /**
     * Get the requestType property: Request type.
     *
     * @return the requestType value.
     */
    public String requestType() {
        return this.requestType;
    }

    /**
     * Get the queuedTime property: Queued time.
     *
     * @return the queuedTime value.
     */
    public String queuedTime() {
        return this.queuedTime;
    }

    /**
     * Get the lastModifiedTime property: Last modified time.
     *
     * @return the lastModifiedTime value.
     */
    public String lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Get the blobUri property: Blob Uri.
     *
     * @return the blobUri value.
     */
    public String blobUri() {
        return this.blobUri;
    }

    /**
     * Get the serverName property: Server name.
     *
     * @return the serverName value.
     */
    public String serverName() {
        return this.serverName;
    }

    /**
     * Get the databaseName property: Database name.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Get the status property: Operation status.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the errorMessage property: Error message.
     *
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Get the privateEndpointConnections property: Gets the status of private endpoints associated with this request.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionRequestStatus> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
    }
}
