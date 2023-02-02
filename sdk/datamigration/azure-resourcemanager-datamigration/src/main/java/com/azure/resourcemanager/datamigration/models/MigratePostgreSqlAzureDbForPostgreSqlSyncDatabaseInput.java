// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Database specific information for PostgreSQL to Azure Database for PostgreSQL migration task inputs. */
@Fluent
public final class MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInput {
    /*
     * Name of the database
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Result identifier
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Name of target database. Note: Target database will be truncated before starting migration.
     */
    @JsonProperty(value = "targetDatabaseName")
    private String targetDatabaseName;

    /*
     * Migration settings which tune the migration behavior
     */
    @JsonProperty(value = "migrationSetting")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> migrationSetting;

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

    /*
     * Tables selected for migration
     */
    @JsonProperty(value = "selectedTables")
    private List<MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseTableInput> selectedTables;

    /** Creates an instance of MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInput class. */
    public MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInput() {
    }

    /**
     * Get the name property: Name of the database.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the database.
     *
     * @param name the name value to set.
     * @return the MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInput object itself.
     */
    public MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInput withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the id property: Result identifier.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the targetDatabaseName property: Name of target database. Note: Target database will be truncated before
     * starting migration.
     *
     * @return the targetDatabaseName value.
     */
    public String targetDatabaseName() {
        return this.targetDatabaseName;
    }

    /**
     * Set the targetDatabaseName property: Name of target database. Note: Target database will be truncated before
     * starting migration.
     *
     * @param targetDatabaseName the targetDatabaseName value to set.
     * @return the MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInput object itself.
     */
    public MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInput withTargetDatabaseName(String targetDatabaseName) {
        this.targetDatabaseName = targetDatabaseName;
        return this;
    }

    /**
     * Get the migrationSetting property: Migration settings which tune the migration behavior.
     *
     * @return the migrationSetting value.
     */
    public Map<String, Object> migrationSetting() {
        return this.migrationSetting;
    }

    /**
     * Set the migrationSetting property: Migration settings which tune the migration behavior.
     *
     * @param migrationSetting the migrationSetting value to set.
     * @return the MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInput object itself.
     */
    public MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInput withMigrationSetting(
        Map<String, Object> migrationSetting) {
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
     * @return the MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInput object itself.
     */
    public MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInput withSourceSetting(Map<String, String> sourceSetting) {
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
     * @return the MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInput object itself.
     */
    public MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInput withTargetSetting(Map<String, String> targetSetting) {
        this.targetSetting = targetSetting;
        return this;
    }

    /**
     * Get the selectedTables property: Tables selected for migration.
     *
     * @return the selectedTables value.
     */
    public List<MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseTableInput> selectedTables() {
        return this.selectedTables;
    }

    /**
     * Set the selectedTables property: Tables selected for migration.
     *
     * @param selectedTables the selectedTables value to set.
     * @return the MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInput object itself.
     */
    public MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInput withSelectedTables(
        List<MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseTableInput> selectedTables) {
        this.selectedTables = selectedTables;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (selectedTables() != null) {
            selectedTables().forEach(e -> e.validate());
        }
    }
}
