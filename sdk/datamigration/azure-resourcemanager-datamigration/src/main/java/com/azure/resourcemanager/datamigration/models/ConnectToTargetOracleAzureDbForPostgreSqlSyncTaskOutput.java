// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Output for the task that validates connection to Azure Database for PostgreSQL and target server requirements for
 * Oracle source.
 */
@Fluent
public final class ConnectToTargetOracleAzureDbForPostgreSqlSyncTaskOutput {
    /*
     * Version of the target server
     */
    @JsonProperty(value = "targetServerVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String targetServerVersion;

    /*
     * List of databases on target server
     */
    @JsonProperty(value = "databases", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> databases;

    /*
     * Target server brand version
     */
    @JsonProperty(value = "targetServerBrandVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String targetServerBrandVersion;

    /*
     * Validation errors associated with the task
     */
    @JsonProperty(value = "validationErrors", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReportableException> validationErrors;

    /*
     * Mapping of schemas per database
     */
    @JsonProperty(value = "databaseSchemaMap")
    private List<ConnectToTargetOracleAzureDbForPostgreSqlSyncTaskOutputDatabaseSchemaMapItem> databaseSchemaMap;

    /**
     * Get the targetServerVersion property: Version of the target server.
     *
     * @return the targetServerVersion value.
     */
    public String targetServerVersion() {
        return this.targetServerVersion;
    }

    /**
     * Get the databases property: List of databases on target server.
     *
     * @return the databases value.
     */
    public List<String> databases() {
        return this.databases;
    }

    /**
     * Get the targetServerBrandVersion property: Target server brand version.
     *
     * @return the targetServerBrandVersion value.
     */
    public String targetServerBrandVersion() {
        return this.targetServerBrandVersion;
    }

    /**
     * Get the validationErrors property: Validation errors associated with the task.
     *
     * @return the validationErrors value.
     */
    public List<ReportableException> validationErrors() {
        return this.validationErrors;
    }

    /**
     * Get the databaseSchemaMap property: Mapping of schemas per database.
     *
     * @return the databaseSchemaMap value.
     */
    public List<ConnectToTargetOracleAzureDbForPostgreSqlSyncTaskOutputDatabaseSchemaMapItem> databaseSchemaMap() {
        return this.databaseSchemaMap;
    }

    /**
     * Set the databaseSchemaMap property: Mapping of schemas per database.
     *
     * @param databaseSchemaMap the databaseSchemaMap value to set.
     * @return the ConnectToTargetOracleAzureDbForPostgreSqlSyncTaskOutput object itself.
     */
    public ConnectToTargetOracleAzureDbForPostgreSqlSyncTaskOutput withDatabaseSchemaMap(
        List<ConnectToTargetOracleAzureDbForPostgreSqlSyncTaskOutputDatabaseSchemaMapItem> databaseSchemaMap) {
        this.databaseSchemaMap = databaseSchemaMap;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (validationErrors() != null) {
            validationErrors().forEach(e -> e.validate());
        }
        if (databaseSchemaMap() != null) {
            databaseSchemaMap().forEach(e -> e.validate());
        }
    }
}
