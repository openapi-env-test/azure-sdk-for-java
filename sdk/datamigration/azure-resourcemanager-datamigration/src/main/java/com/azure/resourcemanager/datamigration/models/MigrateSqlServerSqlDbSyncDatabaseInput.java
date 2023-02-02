// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Database specific information for SQL to Azure SQL DB sync migration task inputs. */
@Fluent
public final class MigrateSqlServerSqlDbSyncDatabaseInput {
    /*
     * Unique identifier for database
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Name of database
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Target database name
     */
    @JsonProperty(value = "targetDatabaseName")
    private String targetDatabaseName;

    /*
     * Schema name to be migrated
     */
    @JsonProperty(value = "schemaName")
    private String schemaName;

    /*
     * Mapping of source to target tables
     */
    @JsonProperty(value = "tableMap")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tableMap;

    /*
     * Migration settings which tune the migration behavior
     */
    @JsonProperty(value = "migrationSetting")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> migrationSetting;

    /*
     * Source settings to tune source endpoint migration behavior
     */
    @JsonProperty(value = "sourceSetting")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> sourceSetting;

    /*
     * Target settings to tune target endpoint migration behavior
     */
    @JsonProperty(value = "targetSetting")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> targetSetting;

    /** Creates an instance of MigrateSqlServerSqlDbSyncDatabaseInput class. */
    public MigrateSqlServerSqlDbSyncDatabaseInput() {
    }

    /**
     * Get the id property: Unique identifier for database.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Unique identifier for database.
     *
     * @param id the id value to set.
     * @return the MigrateSqlServerSqlDbSyncDatabaseInput object itself.
     */
    public MigrateSqlServerSqlDbSyncDatabaseInput withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Name of database.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of database.
     *
     * @param name the name value to set.
     * @return the MigrateSqlServerSqlDbSyncDatabaseInput object itself.
     */
    public MigrateSqlServerSqlDbSyncDatabaseInput withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the targetDatabaseName property: Target database name.
     *
     * @return the targetDatabaseName value.
     */
    public String targetDatabaseName() {
        return this.targetDatabaseName;
    }

    /**
     * Set the targetDatabaseName property: Target database name.
     *
     * @param targetDatabaseName the targetDatabaseName value to set.
     * @return the MigrateSqlServerSqlDbSyncDatabaseInput object itself.
     */
    public MigrateSqlServerSqlDbSyncDatabaseInput withTargetDatabaseName(String targetDatabaseName) {
        this.targetDatabaseName = targetDatabaseName;
        return this;
    }

    /**
     * Get the schemaName property: Schema name to be migrated.
     *
     * @return the schemaName value.
     */
    public String schemaName() {
        return this.schemaName;
    }

    /**
     * Set the schemaName property: Schema name to be migrated.
     *
     * @param schemaName the schemaName value to set.
     * @return the MigrateSqlServerSqlDbSyncDatabaseInput object itself.
     */
    public MigrateSqlServerSqlDbSyncDatabaseInput withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * Get the tableMap property: Mapping of source to target tables.
     *
     * @return the tableMap value.
     */
    public Map<String, String> tableMap() {
        return this.tableMap;
    }

    /**
     * Set the tableMap property: Mapping of source to target tables.
     *
     * @param tableMap the tableMap value to set.
     * @return the MigrateSqlServerSqlDbSyncDatabaseInput object itself.
     */
    public MigrateSqlServerSqlDbSyncDatabaseInput withTableMap(Map<String, String> tableMap) {
        this.tableMap = tableMap;
        return this;
    }

    /**
     * Get the migrationSetting property: Migration settings which tune the migration behavior.
     *
     * @return the migrationSetting value.
     */
    public Map<String, String> migrationSetting() {
        return this.migrationSetting;
    }

    /**
     * Set the migrationSetting property: Migration settings which tune the migration behavior.
     *
     * @param migrationSetting the migrationSetting value to set.
     * @return the MigrateSqlServerSqlDbSyncDatabaseInput object itself.
     */
    public MigrateSqlServerSqlDbSyncDatabaseInput withMigrationSetting(Map<String, String> migrationSetting) {
        this.migrationSetting = migrationSetting;
        return this;
    }

    /**
     * Get the sourceSetting property: Source settings to tune source endpoint migration behavior.
     *
     * @return the sourceSetting value.
     */
    public Map<String, String> sourceSetting() {
        return this.sourceSetting;
    }

    /**
     * Set the sourceSetting property: Source settings to tune source endpoint migration behavior.
     *
     * @param sourceSetting the sourceSetting value to set.
     * @return the MigrateSqlServerSqlDbSyncDatabaseInput object itself.
     */
    public MigrateSqlServerSqlDbSyncDatabaseInput withSourceSetting(Map<String, String> sourceSetting) {
        this.sourceSetting = sourceSetting;
        return this;
    }

    /**
     * Get the targetSetting property: Target settings to tune target endpoint migration behavior.
     *
     * @return the targetSetting value.
     */
    public Map<String, String> targetSetting() {
        return this.targetSetting;
    }

    /**
     * Set the targetSetting property: Target settings to tune target endpoint migration behavior.
     *
     * @param targetSetting the targetSetting value to set.
     * @return the MigrateSqlServerSqlDbSyncDatabaseInput object itself.
     */
    public MigrateSqlServerSqlDbSyncDatabaseInput withTargetSetting(Map<String, String> targetSetting) {
        this.targetSetting = targetSetting;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
