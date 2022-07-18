// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** The MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputError model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType")
@JsonTypeName("ErrorOutput")
@Fluent
public final class MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputError
    extends MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutput {
    /*
     * Migration error
     */
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private ReportableException error;

    /*
     * List of error events
     */
    @JsonProperty(value = "events")
    private List<SyncMigrationDatabaseErrorEvent> events;

    /**
     * Get the error property: Migration error.
     *
     * @return the error value.
     */
    public ReportableException error() {
        return this.error;
    }

    /**
     * Get the events property: List of error events.
     *
     * @return the events value.
     */
    public List<SyncMigrationDatabaseErrorEvent> events() {
        return this.events;
    }

    /**
     * Set the events property: List of error events.
     *
     * @param events the events value to set.
     * @return the MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputError object itself.
     */
    public MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputError withEvents(
        List<SyncMigrationDatabaseErrorEvent> events) {
        this.events = events;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (error() != null) {
            error().validate();
        }
        if (events() != null) {
            events().forEach(e -> e.validate());
        }
    }
}
