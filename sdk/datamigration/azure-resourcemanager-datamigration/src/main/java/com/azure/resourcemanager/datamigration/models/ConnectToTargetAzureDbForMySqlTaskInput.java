// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Input for the task that validates connection to Azure Database for MySQL and target server requirements. */
@Fluent
public final class ConnectToTargetAzureDbForMySqlTaskInput {
    /*
     * Connection information for source MySQL server
     */
    @JsonProperty(value = "sourceConnectionInfo", required = true)
    private MySqlConnectionInfo sourceConnectionInfo;

    /*
     * Connection information for target Azure Database for MySQL server
     */
    @JsonProperty(value = "targetConnectionInfo", required = true)
    private MySqlConnectionInfo targetConnectionInfo;

    /*
     * Flag for whether or not the migration is offline
     */
    @JsonProperty(value = "isOfflineMigration")
    private Boolean isOfflineMigration;

    /** Creates an instance of ConnectToTargetAzureDbForMySqlTaskInput class. */
    public ConnectToTargetAzureDbForMySqlTaskInput() {
    }

    /**
     * Get the sourceConnectionInfo property: Connection information for source MySQL server.
     *
     * @return the sourceConnectionInfo value.
     */
    public MySqlConnectionInfo sourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Set the sourceConnectionInfo property: Connection information for source MySQL server.
     *
     * @param sourceConnectionInfo the sourceConnectionInfo value to set.
     * @return the ConnectToTargetAzureDbForMySqlTaskInput object itself.
     */
    public ConnectToTargetAzureDbForMySqlTaskInput withSourceConnectionInfo(MySqlConnectionInfo sourceConnectionInfo) {
        this.sourceConnectionInfo = sourceConnectionInfo;
        return this;
    }

    /**
     * Get the targetConnectionInfo property: Connection information for target Azure Database for MySQL server.
     *
     * @return the targetConnectionInfo value.
     */
    public MySqlConnectionInfo targetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    /**
     * Set the targetConnectionInfo property: Connection information for target Azure Database for MySQL server.
     *
     * @param targetConnectionInfo the targetConnectionInfo value to set.
     * @return the ConnectToTargetAzureDbForMySqlTaskInput object itself.
     */
    public ConnectToTargetAzureDbForMySqlTaskInput withTargetConnectionInfo(MySqlConnectionInfo targetConnectionInfo) {
        this.targetConnectionInfo = targetConnectionInfo;
        return this;
    }

    /**
     * Get the isOfflineMigration property: Flag for whether or not the migration is offline.
     *
     * @return the isOfflineMigration value.
     */
    public Boolean isOfflineMigration() {
        return this.isOfflineMigration;
    }

    /**
     * Set the isOfflineMigration property: Flag for whether or not the migration is offline.
     *
     * @param isOfflineMigration the isOfflineMigration value to set.
     * @return the ConnectToTargetAzureDbForMySqlTaskInput object itself.
     */
    public ConnectToTargetAzureDbForMySqlTaskInput withIsOfflineMigration(Boolean isOfflineMigration) {
        this.isOfflineMigration = isOfflineMigration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceConnectionInfo() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sourceConnectionInfo in model"
                            + " ConnectToTargetAzureDbForMySqlTaskInput"));
        } else {
            sourceConnectionInfo().validate();
        }
        if (targetConnectionInfo() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property targetConnectionInfo in model"
                            + " ConnectToTargetAzureDbForMySqlTaskInput"));
        } else {
            targetConnectionInfo().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ConnectToTargetAzureDbForMySqlTaskInput.class);
}
