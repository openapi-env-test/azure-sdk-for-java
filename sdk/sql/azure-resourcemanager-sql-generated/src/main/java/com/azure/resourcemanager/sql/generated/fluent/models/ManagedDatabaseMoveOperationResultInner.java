// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.sql.generated.models.ManagementOperationState;
import com.azure.resourcemanager.sql.generated.models.MoveOperationMode;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** A managed database move operation. */
@Immutable
public final class ManagedDatabaseMoveOperationResultInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private ManagedDatabaseMoveOperationResultProperties innerProperties;

    /** Creates an instance of ManagedDatabaseMoveOperationResultInner class. */
    public ManagedDatabaseMoveOperationResultInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private ManagedDatabaseMoveOperationResultProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the operation property: The name of operation.
     *
     * @return the operation value.
     */
    public String operation() {
        return this.innerProperties() == null ? null : this.innerProperties().operation();
    }

    /**
     * Get the operationFriendlyName property: The friendly name of operation.
     *
     * @return the operationFriendlyName value.
     */
    public String operationFriendlyName() {
        return this.innerProperties() == null ? null : this.innerProperties().operationFriendlyName();
    }

    /**
     * Get the startTime property: The operation start time.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.innerProperties() == null ? null : this.innerProperties().startTime();
    }

    /**
     * Get the state property: The operation state.
     *
     * @return the state value.
     */
    public ManagementOperationState state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Get the operationMode property: Operation mode.
     *
     * @return the operationMode value.
     */
    public MoveOperationMode operationMode() {
        return this.innerProperties() == null ? null : this.innerProperties().operationMode();
    }

    /**
     * Get the sourceManagedInstanceName property: Source Managed Instance name.
     *
     * @return the sourceManagedInstanceName value.
     */
    public String sourceManagedInstanceName() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceManagedInstanceName();
    }

    /**
     * Get the targetManagedInstanceName property: Target Managed Instance name.
     *
     * @return the targetManagedInstanceName value.
     */
    public String targetManagedInstanceName() {
        return this.innerProperties() == null ? null : this.innerProperties().targetManagedInstanceName();
    }

    /**
     * Get the sourceManagedInstanceId property: Source Managed Instance resource id.
     *
     * @return the sourceManagedInstanceId value.
     */
    public String sourceManagedInstanceId() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceManagedInstanceId();
    }

    /**
     * Get the targetManagedInstanceId property: Target Managed instance resource id.
     *
     * @return the targetManagedInstanceId value.
     */
    public String targetManagedInstanceId() {
        return this.innerProperties() == null ? null : this.innerProperties().targetManagedInstanceId();
    }

    /**
     * Get the sourceDatabaseName property: Source database name.
     *
     * @return the sourceDatabaseName value.
     */
    public String sourceDatabaseName() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceDatabaseName();
    }

    /**
     * Get the targetDatabaseName property: Target database name.
     *
     * @return the targetDatabaseName value.
     */
    public String targetDatabaseName() {
        return this.innerProperties() == null ? null : this.innerProperties().targetDatabaseName();
    }

    /**
     * Get the isCancellable property: Is move operation cancellable.
     *
     * @return the isCancellable value.
     */
    public Boolean isCancellable() {
        return this.innerProperties() == null ? null : this.innerProperties().isCancellable();
    }

    /**
     * Get the errorCode property: The operation error code.
     *
     * @return the errorCode value.
     */
    public Integer errorCode() {
        return this.innerProperties() == null ? null : this.innerProperties().errorCode();
    }

    /**
     * Get the errorDescription property: The operation error description.
     *
     * @return the errorDescription value.
     */
    public String errorDescription() {
        return this.innerProperties() == null ? null : this.innerProperties().errorDescription();
    }

    /**
     * Get the errorSeverity property: The operation error severity.
     *
     * @return the errorSeverity value.
     */
    public Integer errorSeverity() {
        return this.innerProperties() == null ? null : this.innerProperties().errorSeverity();
    }

    /**
     * Get the isUserError property: Whether or not the error is a user error.
     *
     * @return the isUserError value.
     */
    public Boolean isUserError() {
        return this.innerProperties() == null ? null : this.innerProperties().isUserError();
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
