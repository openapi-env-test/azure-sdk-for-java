// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;

/** The MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputTableLevel model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType")
@JsonTypeName("TableLevelOutput")
@Immutable
public final class MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputTableLevel
    extends MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutput {
    /*
     * Name of the table
     */
    @JsonProperty(value = "tableName", access = JsonProperty.Access.WRITE_ONLY)
    private String tableName;

    /*
     * Name of the database
     */
    @JsonProperty(value = "databaseName", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseName;

    /*
     * Number of applied inserts
     */
    @JsonProperty(value = "cdcInsertCounter", access = JsonProperty.Access.WRITE_ONLY)
    private Long cdcInsertCounter;

    /*
     * Number of applied updates
     */
    @JsonProperty(value = "cdcUpdateCounter", access = JsonProperty.Access.WRITE_ONLY)
    private Long cdcUpdateCounter;

    /*
     * Number of applied deletes
     */
    @JsonProperty(value = "cdcDeleteCounter", access = JsonProperty.Access.WRITE_ONLY)
    private Long cdcDeleteCounter;

    /*
     * Estimate to finish full load
     */
    @JsonProperty(value = "fullLoadEstFinishTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime fullLoadEstFinishTime;

    /*
     * Full load start time
     */
    @JsonProperty(value = "fullLoadStartedOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime fullLoadStartedOn;

    /*
     * Full load end time
     */
    @JsonProperty(value = "fullLoadEndedOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime fullLoadEndedOn;

    /*
     * Number of rows applied in full load
     */
    @JsonProperty(value = "fullLoadTotalRows", access = JsonProperty.Access.WRITE_ONLY)
    private Long fullLoadTotalRows;

    /*
     * Current state of the table migration
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private SyncTableMigrationState state;

    /*
     * Total number of applied changes
     */
    @JsonProperty(value = "totalChangesApplied", access = JsonProperty.Access.WRITE_ONLY)
    private Long totalChangesApplied;

    /*
     * Number of data errors occurred
     */
    @JsonProperty(value = "dataErrorsCounter", access = JsonProperty.Access.WRITE_ONLY)
    private Long dataErrorsCounter;

    /*
     * Last modified time on target
     */
    @JsonProperty(value = "lastModifiedTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModifiedTime;

    /**
     * Get the tableName property: Name of the table.
     *
     * @return the tableName value.
     */
    public String tableName() {
        return this.tableName;
    }

    /**
     * Get the databaseName property: Name of the database.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Get the cdcInsertCounter property: Number of applied inserts.
     *
     * @return the cdcInsertCounter value.
     */
    public Long cdcInsertCounter() {
        return this.cdcInsertCounter;
    }

    /**
     * Get the cdcUpdateCounter property: Number of applied updates.
     *
     * @return the cdcUpdateCounter value.
     */
    public Long cdcUpdateCounter() {
        return this.cdcUpdateCounter;
    }

    /**
     * Get the cdcDeleteCounter property: Number of applied deletes.
     *
     * @return the cdcDeleteCounter value.
     */
    public Long cdcDeleteCounter() {
        return this.cdcDeleteCounter;
    }

    /**
     * Get the fullLoadEstFinishTime property: Estimate to finish full load.
     *
     * @return the fullLoadEstFinishTime value.
     */
    public OffsetDateTime fullLoadEstFinishTime() {
        return this.fullLoadEstFinishTime;
    }

    /**
     * Get the fullLoadStartedOn property: Full load start time.
     *
     * @return the fullLoadStartedOn value.
     */
    public OffsetDateTime fullLoadStartedOn() {
        return this.fullLoadStartedOn;
    }

    /**
     * Get the fullLoadEndedOn property: Full load end time.
     *
     * @return the fullLoadEndedOn value.
     */
    public OffsetDateTime fullLoadEndedOn() {
        return this.fullLoadEndedOn;
    }

    /**
     * Get the fullLoadTotalRows property: Number of rows applied in full load.
     *
     * @return the fullLoadTotalRows value.
     */
    public Long fullLoadTotalRows() {
        return this.fullLoadTotalRows;
    }

    /**
     * Get the state property: Current state of the table migration.
     *
     * @return the state value.
     */
    public SyncTableMigrationState state() {
        return this.state;
    }

    /**
     * Get the totalChangesApplied property: Total number of applied changes.
     *
     * @return the totalChangesApplied value.
     */
    public Long totalChangesApplied() {
        return this.totalChangesApplied;
    }

    /**
     * Get the dataErrorsCounter property: Number of data errors occurred.
     *
     * @return the dataErrorsCounter value.
     */
    public Long dataErrorsCounter() {
        return this.dataErrorsCounter;
    }

    /**
     * Get the lastModifiedTime property: Last modified time on target.
     *
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
