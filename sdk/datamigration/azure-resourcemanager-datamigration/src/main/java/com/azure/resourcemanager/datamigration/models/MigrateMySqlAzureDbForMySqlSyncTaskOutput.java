// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Output for the task that migrates MySQL databases to Azure Database for MySQL for online migrations. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "resultType",
    defaultImpl = MigrateMySqlAzureDbForMySqlSyncTaskOutput.class)
@JsonTypeName("MigrateMySqlAzureDbForMySqlSyncTaskOutput")
@JsonSubTypes({
    @JsonSubTypes.Type(
        name = "MigrationLevelOutput",
        value = MigrateMySqlAzureDbForMySqlSyncTaskOutputMigrationLevel.class),
    @JsonSubTypes.Type(
        name = "DatabaseLevelOutput",
        value = MigrateMySqlAzureDbForMySqlSyncTaskOutputDatabaseLevel.class),
    @JsonSubTypes.Type(name = "TableLevelOutput", value = MigrateMySqlAzureDbForMySqlSyncTaskOutputTableLevel.class),
    @JsonSubTypes.Type(name = "ErrorOutput", value = MigrateMySqlAzureDbForMySqlSyncTaskOutputError.class),
    @JsonSubTypes.Type(
        name = "DatabaseLevelErrorOutput",
        value = MigrateMySqlAzureDbForMySqlSyncTaskOutputDatabaseError.class)
})
@Immutable
public class MigrateMySqlAzureDbForMySqlSyncTaskOutput {
    /*
     * Result identifier
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Get the id property: Result identifier.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
