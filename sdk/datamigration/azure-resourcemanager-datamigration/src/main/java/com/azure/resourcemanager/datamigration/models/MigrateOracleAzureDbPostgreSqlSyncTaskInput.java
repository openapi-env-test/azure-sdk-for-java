// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Input for the task that migrates Oracle databases to Azure Database for PostgreSQL for online migrations. */
@Fluent
public final class MigrateOracleAzureDbPostgreSqlSyncTaskInput {
    /*
     * Databases to migrate
     */
    @JsonProperty(value = "selectedDatabases", required = true)
    private List<MigrateOracleAzureDbPostgreSqlSyncDatabaseInput> selectedDatabases;

    /*
     * Connection information for target Azure Database for PostgreSQL
     */
    @JsonProperty(value = "targetConnectionInfo", required = true)
    private PostgreSqlConnectionInfo targetConnectionInfo;

    /*
     * Connection information for source Oracle
     */
    @JsonProperty(value = "sourceConnectionInfo", required = true)
    private OracleConnectionInfo sourceConnectionInfo;

    /**
     * Get the selectedDatabases property: Databases to migrate.
     *
     * @return the selectedDatabases value.
     */
    public List<MigrateOracleAzureDbPostgreSqlSyncDatabaseInput> selectedDatabases() {
        return this.selectedDatabases;
    }

    /**
     * Set the selectedDatabases property: Databases to migrate.
     *
     * @param selectedDatabases the selectedDatabases value to set.
     * @return the MigrateOracleAzureDbPostgreSqlSyncTaskInput object itself.
     */
    public MigrateOracleAzureDbPostgreSqlSyncTaskInput withSelectedDatabases(
        List<MigrateOracleAzureDbPostgreSqlSyncDatabaseInput> selectedDatabases) {
        this.selectedDatabases = selectedDatabases;
        return this;
    }

    /**
     * Get the targetConnectionInfo property: Connection information for target Azure Database for PostgreSQL.
     *
     * @return the targetConnectionInfo value.
     */
    public PostgreSqlConnectionInfo targetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    /**
     * Set the targetConnectionInfo property: Connection information for target Azure Database for PostgreSQL.
     *
     * @param targetConnectionInfo the targetConnectionInfo value to set.
     * @return the MigrateOracleAzureDbPostgreSqlSyncTaskInput object itself.
     */
    public MigrateOracleAzureDbPostgreSqlSyncTaskInput withTargetConnectionInfo(
        PostgreSqlConnectionInfo targetConnectionInfo) {
        this.targetConnectionInfo = targetConnectionInfo;
        return this;
    }

    /**
     * Get the sourceConnectionInfo property: Connection information for source Oracle.
     *
     * @return the sourceConnectionInfo value.
     */
    public OracleConnectionInfo sourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Set the sourceConnectionInfo property: Connection information for source Oracle.
     *
     * @param sourceConnectionInfo the sourceConnectionInfo value to set.
     * @return the MigrateOracleAzureDbPostgreSqlSyncTaskInput object itself.
     */
    public MigrateOracleAzureDbPostgreSqlSyncTaskInput withSourceConnectionInfo(
        OracleConnectionInfo sourceConnectionInfo) {
        this.sourceConnectionInfo = sourceConnectionInfo;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (selectedDatabases() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property selectedDatabases in model"
                            + " MigrateOracleAzureDbPostgreSqlSyncTaskInput"));
        } else {
            selectedDatabases().forEach(e -> e.validate());
        }
        if (targetConnectionInfo() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property targetConnectionInfo in model"
                            + " MigrateOracleAzureDbPostgreSqlSyncTaskInput"));
        } else {
            targetConnectionInfo().validate();
        }
        if (sourceConnectionInfo() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sourceConnectionInfo in model"
                            + " MigrateOracleAzureDbPostgreSqlSyncTaskInput"));
        } else {
            sourceConnectionInfo().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MigrateOracleAzureDbPostgreSqlSyncTaskInput.class);
}
