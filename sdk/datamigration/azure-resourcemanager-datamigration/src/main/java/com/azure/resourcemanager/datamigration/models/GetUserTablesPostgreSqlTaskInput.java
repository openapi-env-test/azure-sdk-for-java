// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Input for the task that gets the list of tables for a provided list of PostgreSQL databases. */
@Fluent
public final class GetUserTablesPostgreSqlTaskInput {
    /*
     * Information for connecting to PostgreSQL source
     */
    @JsonProperty(value = "connectionInfo", required = true)
    private PostgreSqlConnectionInfo connectionInfo;

    /*
     * List of PostgreSQL databases for which to collect tables
     */
    @JsonProperty(value = "selectedDatabases", required = true)
    private List<String> selectedDatabases;

    /**
     * Get the connectionInfo property: Information for connecting to PostgreSQL source.
     *
     * @return the connectionInfo value.
     */
    public PostgreSqlConnectionInfo connectionInfo() {
        return this.connectionInfo;
    }

    /**
     * Set the connectionInfo property: Information for connecting to PostgreSQL source.
     *
     * @param connectionInfo the connectionInfo value to set.
     * @return the GetUserTablesPostgreSqlTaskInput object itself.
     */
    public GetUserTablesPostgreSqlTaskInput withConnectionInfo(PostgreSqlConnectionInfo connectionInfo) {
        this.connectionInfo = connectionInfo;
        return this;
    }

    /**
     * Get the selectedDatabases property: List of PostgreSQL databases for which to collect tables.
     *
     * @return the selectedDatabases value.
     */
    public List<String> selectedDatabases() {
        return this.selectedDatabases;
    }

    /**
     * Set the selectedDatabases property: List of PostgreSQL databases for which to collect tables.
     *
     * @param selectedDatabases the selectedDatabases value to set.
     * @return the GetUserTablesPostgreSqlTaskInput object itself.
     */
    public GetUserTablesPostgreSqlTaskInput withSelectedDatabases(List<String> selectedDatabases) {
        this.selectedDatabases = selectedDatabases;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (connectionInfo() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property connectionInfo in model GetUserTablesPostgreSqlTaskInput"));
        } else {
            connectionInfo().validate();
        }
        if (selectedDatabases() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property selectedDatabases in model GetUserTablesPostgreSqlTaskInput"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GetUserTablesPostgreSqlTaskInput.class);
}
