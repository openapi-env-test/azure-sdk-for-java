// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.sql.generated.models.ManagementOperationState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The properties of a database operation. */
@Immutable
public final class DatabaseOperationProperties {
    /*
     * The name of the database the operation is being performed on.
     */
    @JsonProperty(value = "databaseName", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseName;

    /*
     * The name of operation.
     */
    @JsonProperty(value = "operation", access = JsonProperty.Access.WRITE_ONLY)
    private String operation;

    /*
     * The friendly name of operation.
     */
    @JsonProperty(value = "operationFriendlyName", access = JsonProperty.Access.WRITE_ONLY)
    private String operationFriendlyName;

    /*
     * The percentage of the operation completed.
     */
    @JsonProperty(value = "percentComplete", access = JsonProperty.Access.WRITE_ONLY)
    private Integer percentComplete;

    /*
     * The name of the server.
     */
    @JsonProperty(value = "serverName", access = JsonProperty.Access.WRITE_ONLY)
    private String serverName;

    /*
     * The operation start time.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startTime;

    /*
     * The operation state.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private ManagementOperationState state;

    /*
     * The operation error code.
     */
    @JsonProperty(value = "errorCode", access = JsonProperty.Access.WRITE_ONLY)
    private Integer errorCode;

    /*
     * The operation error description.
     */
    @JsonProperty(value = "errorDescription", access = JsonProperty.Access.WRITE_ONLY)
    private String errorDescription;

    /*
     * The operation error severity.
     */
    @JsonProperty(value = "errorSeverity", access = JsonProperty.Access.WRITE_ONLY)
    private Integer errorSeverity;

    /*
     * Whether or not the error is a user error.
     */
    @JsonProperty(value = "isUserError", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isUserError;

    /*
     * The estimated completion time of the operation.
     */
    @JsonProperty(value = "estimatedCompletionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime estimatedCompletionTime;

    /*
     * The operation description.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * Whether the operation can be cancelled.
     */
    @JsonProperty(value = "isCancellable", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isCancellable;

    /** Creates an instance of DatabaseOperationProperties class. */
    public DatabaseOperationProperties() {
    }

    /**
     * Get the databaseName property: The name of the database the operation is being performed on.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Get the operation property: The name of operation.
     *
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Get the operationFriendlyName property: The friendly name of operation.
     *
     * @return the operationFriendlyName value.
     */
    public String operationFriendlyName() {
        return this.operationFriendlyName;
    }

    /**
     * Get the percentComplete property: The percentage of the operation completed.
     *
     * @return the percentComplete value.
     */
    public Integer percentComplete() {
        return this.percentComplete;
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
     * Get the startTime property: The operation start time.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the state property: The operation state.
     *
     * @return the state value.
     */
    public ManagementOperationState state() {
        return this.state;
    }

    /**
     * Get the errorCode property: The operation error code.
     *
     * @return the errorCode value.
     */
    public Integer errorCode() {
        return this.errorCode;
    }

    /**
     * Get the errorDescription property: The operation error description.
     *
     * @return the errorDescription value.
     */
    public String errorDescription() {
        return this.errorDescription;
    }

    /**
     * Get the errorSeverity property: The operation error severity.
     *
     * @return the errorSeverity value.
     */
    public Integer errorSeverity() {
        return this.errorSeverity;
    }

    /**
     * Get the isUserError property: Whether or not the error is a user error.
     *
     * @return the isUserError value.
     */
    public Boolean isUserError() {
        return this.isUserError;
    }

    /**
     * Get the estimatedCompletionTime property: The estimated completion time of the operation.
     *
     * @return the estimatedCompletionTime value.
     */
    public OffsetDateTime estimatedCompletionTime() {
        return this.estimatedCompletionTime;
    }

    /**
     * Get the description property: The operation description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the isCancellable property: Whether the operation can be cancelled.
     *
     * @return the isCancellable value.
     */
    public Boolean isCancellable() {
        return this.isCancellable;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
